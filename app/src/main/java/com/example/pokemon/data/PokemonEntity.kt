package com.example.pokemon.data

import androidx.room.*

@Entity(tableName = "pokemon_table")

data class PokemonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "pokemon_name")
    val name: String,
    val image: String,
)
