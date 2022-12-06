package com.plcoding.cryptocurrencyappyt.domain.model

// TODO 6: In the domain.model package, create a data class for each dto.
//  This will be the model for the UI.

import com.google.gson.annotations.SerializedName

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
