package com.example.pokedexandroid.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexandroid.R
import com.example.pokedexandroid.domain.Pokemon
import com.example.pokedexandroid.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)
        val charmeleon = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png",
            4,
            "Charmeleon",
            listOf(
                PokemonType("Fire")
            )
        )

        val pokemons = listOf(charmeleon, charmeleon, charmeleon, charmeleon)


        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}