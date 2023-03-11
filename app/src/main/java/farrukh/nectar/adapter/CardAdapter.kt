package farrukh.nectar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import farrukh.nectar.R
import farrukh.nectar.databinding.CartItemsBinding
import farrukh.nectar.model.Exclusive_Offer_products_child

class CardAdapter(
    context: Context,
    var items:MutableList<Exclusive_Offer_products_child>, var listener: onchangeListner
) :
    ArrayAdapter<Exclusive_Offer_products_child>(context, R.layout.cart_items) {
    override fun getCount(): Int {
        return  items.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view : CartItemsBinding

        if (convertView == null){
            view = CartItemsBinding.inflate(LayoutInflater.from(parent.context),null,false)
        }
        else{
            view = CartItemsBinding.bind(convertView)
        }

        val cart_it = items.get(position)
        view.name.text = cart_it.name
        view.img.setImageResource(cart_it.img)
        view.price.text = cart_it.price.toString()

        view.card.setOnClickListener {
            listener!!.onEdit(position,cart_it)
        }

        return  view.root

    }

    interface onchangeListner{
        fun onEdit(position: Int, item: Exclusive_Offer_products_child)
    }

}