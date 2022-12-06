package com.plcoding.cryptocurrencyappyt.data.remote

// TODO 4: In the data.remote package, create your API interfaces that will
//  contain suspend functions that receive raw data straight from the API.
//  (In this example, they are using http requests with retrofit.)

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}