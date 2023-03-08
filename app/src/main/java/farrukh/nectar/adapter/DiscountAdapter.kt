package farrukh.nectar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import farrukh.nectar.R
import farrukh.nectar.model.Discount

class DiscountAdapter(var discounts:MutableList<Discount> ):RecyclerView.Adapter<DiscountAdapter.MyHolder>() {

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.name)
        var discount_obj = itemView.findViewById<TextView>(R.id.discount_obj)
        var img = itemView.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var myHolder = LayoutInflater.from(parent.context).inflate(R.layout.discount_item,parent,false)
        return MyHolder(myHolder)
    }

    override fun getItemCount(): Int {
        return discounts.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var cont = discounts.get(position)
        holder.name.text = cont.name
        holder.discount_obj.text = cont.dis_object
        holder.img.setImageResource(cont.img)
    }
}