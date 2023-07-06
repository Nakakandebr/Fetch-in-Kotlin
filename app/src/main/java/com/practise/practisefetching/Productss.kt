package com.practise.practisefetching

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practise.practisefetching.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation
import com.practise.practisefetching.databinding.ImageListsItemBinding

class Productss  (var imagesList:List<Product>):RecyclerView.Adapter<ImageViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding=
            ImageListsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ImageViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return imagesList.size

    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val currentImage=imagesList.get(position)
        val binding=holder.binding
       binding.tvdescription.text=currentImage.description
       binding.tvprice.text = currentImage.price.toString()
       binding.tvid.text= currentImage.id.toString()
     Picasso
            .get()
            .load(currentImage.thumbnail)
           .centerCrop()

            .transform(CropCircleTransformation())
            .into(binding.ivavatar)

    }
}
class ImageViewHolder(var binding:ImageListsItemBinding):RecyclerView.ViewHolder(binding.root)

//package com.assignment.contact_app_validated
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.assignment.contact_app_validated.databinding.ContactListItemBinding
//import com.squareup.picasso.Picasso
//import jp.wasabeef.picasso.transformations.CropCircleTransformation
//
//
//class ContactsAdapter(var contactList:List<contactData>): RecyclerView.Adapter< ContactViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ContactViewHolder {
//        val binding=
//            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//        return ContactViewHolder(binding)
//
//    }
//
//    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
//        val currentContact=contactList.get(position)
//        val binding=holder.binding
//        binding.tvDisplayName.text=currentContact.displayName
//        binding.tvPhoneNumber.text =currentContact.phoneNumber
//        binding.tvEmail.text=currentContact.email
//        Picasso
//            .get()
//            .load(currentContact.avatar)
////            .resize(100,80)
////            .centerCrop()
//
//            .transform(CropCircleTransformation())
//            .into(binding.imageView)
//
//
//    }
//
//    override fun getItemCount(): Int {
//        return contactList.size
//    }
//}
//
//class ContactViewHolder(var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root)