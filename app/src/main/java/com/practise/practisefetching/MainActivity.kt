package com.practise.practisefetching

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.practise.practisefetching.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
//     lateinit var binding  =ActivityMainBinding
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        getProducts()
    }

    fun getProducts(){
        val apiClient = ApiClient.buildClient(ApiInterface ::class.java)
        val request = apiClient.getProducts()
        request.enqueue(object : Callback<ProductResponse> {
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                if(response.isSuccessful){
                    var products = response.body()?.products
                    Toast
                        .makeText(baseContext, "fetched ${products?.size} products" , Toast.LENGTH_LONG)
                        .show()

                }
                else{
                    Toast.makeText(baseContext, response.errorBody()?.string() , Toast.LENGTH_LONG).show()
                }

            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Toast.makeText(baseContext,t.message , Toast.LENGTH_LONG).show()
            }

        })
    }
    fun displayContacts(){
//        val image1 :Product("rr
    }


}


// fun diplayContacts(){
//        val contact1=contactData("https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Milcah","0720987542","milcah2@gmail.com")
//        val contact2=contactData("https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Rachel","0735426780","racheal23@gmail.com")
//        val contact3=contactData("https://media.istockphoto.com/id/1386479313/photo/happy-millennial-afro-american-business-woman-posing-isolated-on-white.webp?b=1&s=170667a&w=0&k=20&c=ahypUC_KTc95VOsBkzLFZiCQ0VJwewfrSV43BOrLETM=","Rachel","0735426780","racheal23@gmail.com")
//        val contact4=contactData("https://images.unsplash.com/photo-1500648767791-00dcc994a43e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Bridget","0742426767","bridget4@gmail.com")
//        val contact5=contactData("https://images.unsplash.com/photo-1544723795-3fb6469f5b39?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Rebecca","0722426780","rebecca30@gmail.com")
//        val contact6=contactData("https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Mary","0720987542","mary2@gmail.com")
//        val contact7=contactData("https://images.unsplash.com/photo-1607746882042-944635dfe10e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Amina","0735426780","aminaraji23@gmail.com")
//        val contact8=contactData("https://images.unsplash.com/photo-1619895862022-09114b41f16f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Kareem","0742426767","kareem4@gmail.com")
//        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
//        val twtAdapter=ContactsAdapter(contactList)
//        binding.rvcontacts.layoutManager= LinearLayoutManager(this)
//        binding.rvcontacts.adapter=twtAdapter
//
//    }
//
//}

