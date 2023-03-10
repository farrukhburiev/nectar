package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import farrukh.nectar.adapter.Exclusive_Offer_Adapter
import farrukh.nectar.adapter.Expandable_Adapter_Product
import farrukh.nectar.databinding.ActivityExploreBinding
import farrukh.nectar.databinding.ActivityMainBinding
import farrukh.nectar.model.Exclusive_Offer_products_child
import kotlinx.android.synthetic.main.activity_explore.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.cart
import kotlinx.android.synthetic.main.activity_main.favourite
import kotlinx.android.synthetic.main.activity_main.shop

class ExploreActivity : AppCompatActivity() {
    lateinit var binding: ActivityExploreBinding
    lateinit var binding_main: ActivityMainBinding
    lateinit var food_type: MutableList<Exclusive_Offer_products_child>
    lateinit var food_names: MutableList<MutableList<Exclusive_Offer_products_child>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExploreBinding.inflate(layoutInflater)
        binding_main = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        array_expandable()




        var expandableListAdapter = Expandable_Adapter_Product(this, food_type, food_names)


        binding.productsExpandable.setAdapter(expandableListAdapter)


        shop.setOnClickListener {
            startActivity(Intent(this,ExploreActivity::class.java))
        }
        cart.setOnClickListener {
            startActivity(Intent(this,CartActivity::class.java))
        }
        favourite.setOnClickListener {
            startActivity(Intent(this,FavouriteActivity::class.java))
        }

        enter.setOnClickListener {

        }



    }

    private fun array_expandable() {
        food_type = ArrayList()
        food_names = ArrayList()

        food_type.add(Exclusive_Offer_products_child("Frash Fruits \n & Vegetable",55f,R.drawable.img))
        food_type.add(Exclusive_Offer_products_child("Cooking Oil \n & Ghee",55f,R.drawable.oil))
        food_type.add(Exclusive_Offer_products_child("Meat & Fish",55f,R.drawable.meat_fish))
        food_type.add(Exclusive_Offer_products_child("Bakery & Snacks",55f,R.drawable.bakery))
        food_type.add(Exclusive_Offer_products_child("Dairy & Eggs",55f,R.drawable.diary))
        food_type.add(Exclusive_Offer_products_child("Beverages",55f,R.drawable.beverages))


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


        food_names.add(food_type)
        food_names.add(list)
        food_names.add(food_type)
        food_names.add(list)
        food_names.add(food_type)
        food_names.add(list)
    }


    fun offers():MutableList<Exclusive_Offer_products_child>{
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
        return list
    }
}