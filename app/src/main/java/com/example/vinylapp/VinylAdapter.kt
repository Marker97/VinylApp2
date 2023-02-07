package com.example.vinylapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kotlinx.android.synthetic.main.item_vinyl.view.*


class VinylAdapter(var vinyl: List<VinylData>): RecyclerView.Adapter<VinylAdapter.vinylViewHolder>() {

    class vinylViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var epName = view.nameEp
        var epArtist = view.nameArtist
        var epYear = view.yearEp
        var epCode = view.codeEp

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vinylViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_vinyl, parent, false)
        return vinylViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: vinylViewHolder, position: Int) {
        holder.epName.text = vinyl[position].epName
        holder.epArtist.text = vinyl[position].artistName
        holder.epYear.text = vinyl[position].epYear
        holder.epCode.text = vinyl[position].epCode
    }

    override fun getItemCount(): Int {
        return vinyl.size
    }
}





