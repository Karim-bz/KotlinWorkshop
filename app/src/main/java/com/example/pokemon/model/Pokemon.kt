package com.example.pokemon.model


import com.google.gson.annotations.SerializedName

data class Pokemon(
    val abilities: List<String>? = null,
    val attack: Int = 0,
    @SerializedName("base_exp")
    val baseExp: String = "az",
    val category: String = "az",
    val cycles: String = "az",
    val defense: Int = 0,
    @SerializedName("egg_groups")
    val eggGroups: String = "az",
    val evolutions: List<String>? = null,
    val evolvedfrom: String = "az",
    @SerializedName("female_percentage")
    val femalePercentage: String = "az",
    val genderless: Int = 0,
    val height: String = "az",
    val hp: Int = 0,
    val id: String = "az",
    val imageurl: String,
    @SerializedName("male_percentage")
    val malePercentage: String = "az",
    val name: String,
    val reason: String = "az",
    @SerializedName("special_attack")
    val specialAttack: Int = 0,
    @SerializedName("special_defense")
    val specialDefense: Int = 0,
    val speed: Int = 0,
    val total: Int = 0,
    val typeofpokemon: List<String>? = null,
    val weaknesses: List<String>? = null,
    val weight: String = "az",
    val xdescription: String = "az",
    val ydescription: String = "az"
)