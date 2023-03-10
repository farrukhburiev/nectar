package farrukh.nectar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import farrukh.nectar.adapter.DiscountAdapter
import farrukh.nectar.adapter.Exclusive_Offer_Adapter
import farrukh.nectar.databinding.ActivityCartBinding
import farrukh.nectar.model.Exclusive_Offer_products_child

class CartActivity : AppCompatActivity() {
    lateinit var binding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var adapter_offer = Exclusive_Offer_Adapter(offers())
        var manager_offer = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.recycleCart.layoutManager = manager_offer
        binding.recycleCart.adapter = adapter_offer

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