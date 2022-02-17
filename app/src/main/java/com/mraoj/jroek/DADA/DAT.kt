package com.mraoj.jroek.DADA

import retrofit2.Response
import retrofit2.http.GET

interface DAT {
    @GET("https://gist.githubusercontent.com/SMIDvMaks/5578e5685bafaf83ffd67a18cde7b18a/raw/Major%2520Joker/")
    suspend fun DADY(): Response<String>
}