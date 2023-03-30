package com.example.myuca

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostViewHolder(itemView: View): RecyclerView.ViewHolder (itemView){
    private val tvId: TextView = itemView.findViewById(R.id.tvIdC)
    private val tvNombres: TextView = itemView.findViewById(R.id.tvnombres)
    private val tvApellido: TextView = itemView.findViewById(R.id.tvapellidos)
    private val tvFechaNac: TextView = itemView.findViewById(R.id.tvfechaNac)
    private val tvTitulo: TextView = itemView.findViewById(R.id.tvtitulo)
    private val tvEmail: TextView = itemView.findViewById(R.id.tvemail)
    private val tvFacultad: TextView = itemView.findViewById(R.id.tvfacultad)

    fun bindView(postModel: PostModel){
        tvId.text = postModel.idC.toString()
        tvNombres.text = postModel.nombres
        tvApellido.text = postModel.apellidos
        tvFechaNac.text = postModel.fechaNac
        tvTitulo.text = postModel.titulo
        tvEmail.text = postModel.email
        tvFacultad.text = postModel.facultad

    }
}
