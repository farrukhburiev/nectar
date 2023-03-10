package farrukh.nectar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView
import farrukh.nectar.R
import farrukh.nectar.model.Exclusive_Offer_products_child

class Expandable_Adapter_Product(var context:Context , var food_type:MutableList<Exclusive_Offer_products_child>, var food_name:MutableList<MutableList<Exclusive_Offer_products_child>>): BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return food_type.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return food_name.get(groupPosition).size
    }

    override fun getGroup(groupPosition: Int): Exclusive_Offer_products_child {
        return food_type.get(groupPosition)
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Exclusive_Offer_products_child {
        return food_name[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int,isExpanded: Boolean,convertView: View?,parent: ViewGroup?): View {
        var convertView = convertView
        if (convertView == null){
            convertView = LayoutInflater.from(parent!!.context).inflate(R.layout.product_parent,parent,false)

        }

        var name = convertView!!.findViewById<TextView>(R.id.name_title)
        var img = convertView!!.findViewById<ImageView>(R.id.img_title)
        name.text = getGroup(groupPosition).name
        img.setImageResource(getGroup(groupPosition).img)

        return convertView
    }

    override fun getChildView(groupPosition: Int,childPosition: Int,isLastChild: Boolean,convertView: View?,parent: ViewGroup?): View {
        var convertView = convertView
        if (convertView == null){
           convertView = LayoutInflater.from(parent!!.context).inflate(R.layout.products_child_exclusive_offer,parent,false)

        }

        var name = convertView!!.findViewById<TextView>(R.id.name)
        var img = convertView.findViewById<ImageView>(R.id.img)
        name.text = getChild(groupPosition,childPosition).name
        img.setImageResource(getChild(groupPosition,childPosition).img)

        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}