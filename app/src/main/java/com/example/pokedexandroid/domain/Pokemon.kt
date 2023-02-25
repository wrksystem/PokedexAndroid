package com.example.pokedexandroid.domain

import java.util.*

data class Pokemon(

    val number: Int,
    val name: String,
    val types: List<PokemonType>,
) {
    //alteração em relação ao projeto original
    val formattedName =
        name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }

    val formattedNumber = number.toString().padStart(3, '0')

    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png"
}

