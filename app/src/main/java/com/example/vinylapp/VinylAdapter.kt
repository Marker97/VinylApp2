package com.example.vinylapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vinylapp.databinding.RecyclerViewVinylBinding
import kotlinx.android.synthetic.main.item_vinyl.view.*


class VinylAdapter(var vinyl: List<VinylData>) :
    RecyclerView.Adapter<VinylAdapter.vinylViewHolder>() {

    class vinylViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var epName = view.nameEp
        var epArtist = view.nameArtist
        var epYear = view.yearEp
        var epCode = view.codeEp
        var vinylImg = view.vinyl_img

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vinylViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_vinyl, parent, false)
        return vinylViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: vinylViewHolder, position: Int) {
        var vinylImage: Int? = null
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,VinylDetail::class.java)
            intent.putExtra("vinyl", vinyl[position])
            intent.putExtra("vinylImage", vinylImage)


            holder.itemView.context.startActivity(intent)
        }

        holder.epName.text = vinyl[position].epName
        holder.epArtist.text = vinyl[position].artistName
        holder.epYear.text = vinyl[position].epYear
        holder.epCode.text = vinyl[position].epCode

        when (vinyl[position].epName!!) {
            "Red Rooster" -> {
                vinylImage = R.drawable.ic_red_rooster
            }
            "Who's Gonna Do it" -> {
                vinylImage = R.drawable.ic_whos_gonna_do_it
            }
            "Fourplay" -> {
                vinylImage = R.drawable.ic_fourplay
            }
            "Metro Area"-> {
                vinylImage = R.drawable.ic_metro_area
            }
            "Knoe 5/3" -> {
                vinylImage = R.drawable.ic_knoe_5_3
            }
            "Beauty is Random" -> {
                vinylImage = R.drawable.ic_beauty_is_random
            }
            "Polypako"-> {
                vinylImage = R.drawable.ic_polypako
            }
        }
        vinylImage?.let { holder.vinylImg.setImageResource(it) }
    }

    override fun getItemCount(): Int {
        return vinyl.size
    }
}





