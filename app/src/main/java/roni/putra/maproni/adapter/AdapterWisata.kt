package roni.putra.maproni.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import roni.putra.maproni.R
import roni.putra.maproni.model.ModelWisata

class AdapterWisata(
    //data di ambil dari model
    val listItemWisata: List<ModelWisata>
) : RecyclerView.Adapter<AdapterWisata.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {
        //layout pada widget//
        val imgWisata: ImageView = itemView.findViewById(R.id.imgWisata)
        val tvNamaTempatWisata: TextView = itemView.findViewById(R.id.tvNamaTempatWisata)
        val tvAlamat: TextView = itemView.findViewById(R.id.tvAlamat)
        val cardWisata: CardView = itemView.findViewById(R.id.cardWisata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_wisata,parent,false)
        return  MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = listItemWisata[position]
        holder.imgWisata.setImageResource(currentItem.gambarWisata)
        holder.tvNamaTempatWisata.text = currentItem.namaLokasiWisata
        holder.tvAlamat.text = currentItem.alamatWisata
        holder.cardWisata.setOnClickListener {
            Toast.makeText(holder.itemView.context,"{${currentItem.latWisata}}",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return  listItemWisata.size
    }
}