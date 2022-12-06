package com.plcoding.cryptocurrencyappyt.data.remote.dto

// TODO 5: In the data.remote.dto package, create a data class for each
//  object that will be received straight from the API.

import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.domain.model.Coin

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

// TODO 7: Create a function that maps the dto to the corresponding
//  model (created in step 6) and returns an object of the model.

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}