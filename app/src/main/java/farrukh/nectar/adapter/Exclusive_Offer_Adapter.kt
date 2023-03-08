package farrukh.nectar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import farrukh.nectar.R
import farrukh.nectar.model.Discount
import farrukh.nectar.model.Exclusive_Offer

class Exclusive_Offer_Adapter(var offers:MutableList<Exclusive_Offer> ):RecyclerView.Adapter<Exclusive_Offer_Adapter.MyHolder>()  {
    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.name)
        var price = itemView.findViewById<TextView>(R.id.price)
        var img = itemView.findViewById<ImageView>(R.id.img)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Exclusive_Offer_Adapter.MyHolder {
        var myHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_description,parent,false)
        return Exclusive_Offer_Adapter.MyHolder(myHolder)
    }

    override fun getItemCount(): Int {
        return offers.size
    }

    override fun onBindViewHolder(holder: Exclusive_Offer_Adapter.MyHolder, position: Int) {
        var cont = offers.get(position)
        holder.name.text = cont.name
        holder.price.text = cont.price.toString()
        holder.img.setImageResource(cont.img)
    }

}