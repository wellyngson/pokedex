package br.egsys.pokedex.data.dto

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonDto(
    val id: String,
    val name: String,
    val types: List<String>,
    val weight: Int,
    val height: Int,
    val image: String
) : Parcelable