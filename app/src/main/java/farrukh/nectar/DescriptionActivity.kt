package farrukh.nectar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import farrukh.nectar.databinding.ActivityDescriptionBinding
import farrukh.nectar.databinding.CartItemsBinding
import farrukh.nectar.model.Cart_products
import farrukh.nectar.model.Exclusive_Offer_products_child
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.cart_items.view.*

class DescriptionActivity : AppCompatActivity() {
    lateinit var binding: ActivityDescriptionBinding
    var img_state = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var food:Exclusive_Offer_products_child = intent.getSerializableExtra("food") as Exclusive_Offer_products_child
//        var tag_main = intent.getStringExtra("tag_main")
//        var cart: Cart_products = intent.getSerializableExtra("cart_food") as Cart_products
//        var tag_cart = intent.getStringExtra("tag_cart")


        binding.selectedItemImg.setImageResource(food.img)
        binding.namae.text = food.name
        binding.price.text = binding.price.text.toString() + food.price

        binding.heartImage.setOnClickListener {
            if (!img_state) {
                heart_image.setImageResource(R.drawable.he)
                img_state = true
            }
            else {
                img_state = false
                heart_image.setImageResource(R.drawable.heart)
            }
        }
    }
}