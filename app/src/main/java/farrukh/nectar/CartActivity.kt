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
            override fun onEdit(position: Int, item: Cart_products) {
                var intent1 = Intent(this@CartActivity,DescriptionActivity::class.java)
                intent1.putExtra("cart_food",item)
//                intent1.putExtra("tag_cart",binding.cartConst.tag.toString())
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


    fun offers(): MutableList<Cart_products> {
        var list = mutableListOf<Cart_products>()

        list.add(Cart_products("Organic bananas", 4.99f, R.drawable.banannnn))
        list.add(Cart_products("Red apple", 4.99f, R.drawable.applee))
        list.add(Cart_products("Fresh tomato", 4.99f, R.drawable.tomot))
        list.add(Cart_products("Organic bananas", 4.99f, R.drawable.banannnn))
        list.add(Cart_products("Red apple", 4.99f, R.drawable.applee))
        list.add(Cart_products("Fresh tomato", 4.99f, R.drawable.tomot))
        list.add(Cart_products("Organic bananas", 4.99f, R.drawable.banannnn))
        list.add(Cart_products("Red apple", 4.99f, R.drawable.applee))
        list.add(Cart_products("Fresh tomato", 4.99f, R.drawable.tomot))
        list.add(Cart_products("Organic bananas", 4.99f, R.drawable.banannnn))
        list.add(Cart_products("Red apple", 4.99f, R.drawable.applee))
        list.add(Cart_products("Fresh tomato", 4.99f, R.drawable.tomot))
        list.add(Cart_products("Organic bananas", 4.99f, R.drawable.banannnn))

        return list
    }
}