package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import farrukh.nectar.adapter.CardAdapter
import farrukh.nectar.databinding.ActivityCartBinding
import farrukh.nectar.model.Cart_products
import farrukh.nectar.model.Exclusive_Offer_products_child

class CartActivity : AppCompatActivity() {
    lateinit var binding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var arrayAdapter = CardAdapter(this, offers(), object : CardAdapter.onchangeListner {
            override fun onEdit(position: Int, item: Exclusive_Offer_products_child) {
                var intent1 = Intent(this@CartActivity,DescriptionActivity::class.java)
                intent1.putExtra("food",item)
//                intent1.putExtra("tag",binding.mainConst.tag.toString())
                startActivity(intent1)
            }
        })
        binding.listViewCart.adapter = arrayAdapter
        binding.myCart.setOnClickListener {
            startActivity(Intent(this,DescriptionActivity::class.java))
        }

        binding.shop.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        binding.explore.setOnClickListener {
            startActivity(Intent(this,ExploreActivity::class.java))
        }
        binding.favourite.setOnClickListener {
            startActivity(Intent(this,FavouriteActivity::class.java))
        }
    }


    fun offers(): MutableList<Exclusive_Offer_products_child> {
       var list = mutableListOf<Exclusive_Offer_products_child>()

        list.add(Exclusive_Offer_products_child("Organic bananas",4.99f,R.drawable.banannnn))
        list.add(Exclusive_Offer_products_child("Red apple",4.99f,R.drawable.applee))
        list.add(Exclusive_Offer_products_child("Fresh tomato",4.99f,R.drawable.tomot))
        list.add(Exclusive_Offer_products_child("Organic bananas",4.99f,R.drawable.banannnn))
        list.add(Exclusive_Offer_products_child("Red apple",4.99f,R.drawable.applee))
        list.add(Exclusive_Offer_products_child("Fresh tomato",4.99f,R.drawable.tomot))
        list.add(Exclusive_Offer_products_child("Organic bananas",4.99f,R.drawable.banannnn))
        list.add(Exclusive_Offer_products_child("Red apple",4.99f,R.drawable.applee))
        list.add(Exclusive_Offer_products_child("Fresh tomato",4.99f,R.drawable.tomot))
        list.add(Exclusive_Offer_products_child("Organic bananas",4.99f,R.drawable.banannnn))
        list.add(Exclusive_Offer_products_child("Red apple",4.99f,R.drawable.applee))
        list.add(Exclusive_Offer_products_child("Fresh tomato",4.99f,R.drawable.tomot))
        list.add(Exclusive_Offer_products_child("Organic bananas",4.99f,R.drawable.banannnn))
        list.add(Exclusive_Offer_products_child("Red apple",4.99f,R.drawable.applee))
        list.add(Exclusive_Offer_products_child("Fresh tomato",4.99f,R.drawable.tomot))
        list.add(Exclusive_Offer_products_child("Organic bananas",4.99f,R.drawable.banannnn))
        list.add(Exclusive_Offer_products_child("Red apple",4.99f,R.drawable.applee))
        list.add(Exclusive_Offer_products_child("Fresh tomato",4.99f,R.drawable.tomot))
        return list
    }
}