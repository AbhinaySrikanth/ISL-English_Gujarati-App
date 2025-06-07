package com.abhinay.ISLEnglishGujaratiApp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SignAdapter(
    private val signs: List<Sign>,
    private val listener: OnItemClickListener
) : RecyclerView.Adapter<SignAdapter.SignViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(sign: Sign)
    }

    inner class SignViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val signImage: ImageView = itemView.findViewById(R.id.signImage)
        val signName: TextView = itemView.findViewById(R.id.signName)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(signs[position])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SignViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.sign_item, parent, false)
        return SignViewHolder(view)
    }

    override fun onBindViewHolder(holder: SignViewHolder, position: Int) {
        val sign = signs[position]
        holder.signImage.setImageResource(sign.imageRes)
        holder.signName.text = sign.name
    }

    override fun getItemCount() = signs.size
}
