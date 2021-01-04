package com.tugasakhirsemester.Akbar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tugasakhirsemester.Akbar.R
import com.tugasakhirsemester.Akbar.model.ProvinceResponse
import kotlinx.android.synthetic.main.item_province.view.*

class ProvinceAdapter(private var list: ArrayList<ProvinceResponse>): RecyclerView.Adapter<ProvinceAdapter.ProvinceViewHolder>(){
    inner class ProvinceViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(province: ProvinceResponse){
            with(itemView){
                tvName.text = province.attributes.province
                tvPositive.text = province.attributes.province.toString()
                tvRecover.text = province.attributes.province.toString()
                tvDeath.text = province.attributes.province.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_province, parent, false)
        return ProvinceViewHolder(view)

    }
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ProvinceAdapter.ProvinceViewHolder, position: Int) {
        holder.bind(list[position])

    }
}