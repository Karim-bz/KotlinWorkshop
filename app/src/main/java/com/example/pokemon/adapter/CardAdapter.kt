package com.example.pokemon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.pokemon.R
import com.example.pokemon.databinding.ItemLayoutBinding
import com.example.pokemon.model.Pokemon

class CardAdapter(private val context: Context) :
    RecyclerView.Adapter<CardAdapter.MyViewHolder>() {
    private var pokemonList : List<Pokemon> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.pokemonName.text = pokemonList.get(position).name
        Glide.with(context).load(pokemonList.get(position).imageurl)
             .apply(RequestOptions().centerCrop())
             .into(holder.image)
    }

    fun setPokemonListItems(movieList: List<Pokemon>){
        this.pokemonList = movieList;
        notifyDataSetChanged()
    }

    class MyViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val pokemonName: TextView = binding.cardTitle
        val image: ImageView = binding.pokemonImage

    }
}