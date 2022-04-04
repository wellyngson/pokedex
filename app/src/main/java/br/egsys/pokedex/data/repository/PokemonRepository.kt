package br.egsys.pokedex.data.repository

import androidx.lifecycle.LiveData
import br.egsys.pokedex.data.model.NetworkState
import br.egsys.pokedex.data.model.Pokemon
import kotlinx.coroutines.flow.StateFlow

interface PokemonRepository {

    val pokemon: LiveData<Pokemon>
    val pokemonState: StateFlow<NetworkState>

    suspend fun getPokemonById(id: Long)
}