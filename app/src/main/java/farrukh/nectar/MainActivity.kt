package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import farrukh.nectar.adapter.CardAdapter
import farrukh.nectar.adapter.DiscountAdapter
import farrukh.nectar.adapter.Exclusive_Offer_Adapter
import farrukh.nectar.databinding.ActivityMainBinding
import farrukh.nectar.model.Discount
import farrukh.nectar.model.Exclusive_Offer_products_child
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list : MutableList<Exclusive_Offer_products_child>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = DiscountAdapter(discounts())
        var manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.recDis.layoutManager = manager
        binding.recDis.adapter = adapter

        var adapter_offer = Exclusive_Offer_Adapter(offers(), object : Exclusive_Offer_Adapter.onEditListner{
            override fun onEdit(position: Int, item: Exclusive_Offer_products_child) {
                var intent1 = Intent(this@MainActivity,DescriptionActivity::class.java)
                intent1.putExtra("food",item)
//                intent1.putExtra("tag",binding.mainConst.tag.toString())
                startActivity(intent1)

            }
        })
//        Log.d("JJJJJ", "onCreate: "+binding.mainConst.tag.toString())
        var manager_offer = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.exclusiveOfferRecycle.layoutManager = manager_offer
        binding.exclusiveOfferRecycle.adapter = adapter_offer

        explore.setOnClickListener {
            startActivity(Intent(this,ExploreActivity::class.java))
        }
        cart.setOnClickListener {
            startActivity(Intent(this,CartActivity::class.java))
        }
        favourite.setOnClickListener {
            startActivity(Intent(this,FavouriteActivity::class.java))
        }



    }

    fun discounts():MutableList<Discount>{
        var list = mutableListOf<Discount>()

        list.add(Discount("fresh vegetables","40% off",R.drawable.vegetaaa))
        list.add(Discount("fresh cookies","20% off",R.drawable.cok))
        list.add(Discount("fresh fried meat","50% off",R.drawable.meat))

        return list
    }

    fun offers():MutableList<Exclusive_Offer_products_child>{
        list = mutableListOf<Exclusive_Offer_products_child>()

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