package com.enrique.myproductos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Pro(var context: Context,
          var Lista: MutableList<Productos>)  :
    RecyclerView.Adapter<Pro.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtId: TextView
        init {
            txtId=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtDescripcion: TextView
        init {
            txtDescripcion=itemView.findViewById(R.id.txtDescripcion)
        }
        lateinit var txtmenudeo: TextView
        init {
            txtmenudeo=itemView.findViewById(R.id.txtMenudeo)
        }
        lateinit var txtmayoreo: TextView
        init {
            txtmayoreo=itemView.findViewById(R.id.txtMayoreo)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Pro.vHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.activity_vistas,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return Lista.size
    }

    override fun onBindViewHolder(holder: Pro.vHolder, position: Int) {
        var producto = Lista[position]
        holder.txtId.text=producto.ID
        holder.txtDescripcion.text=producto.descripcion
        holder.txtmenudeo.text=producto.menudeo
        holder.txtmayoreo.text=producto.mayoreo
    }


}