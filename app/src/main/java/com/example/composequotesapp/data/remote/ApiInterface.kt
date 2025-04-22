package com.example.composequotesapp.data.remote

import com.example.composequotesapp.domain.models.AllQuotesDataClass
import com.example.composequotesapp.domain.models.Quote
import com.example.composequotesapp.networks.ALL_QUOTES
import com.example.composequotesapp.networks.RANDOM_QUOTES
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface{

    @GET(ALL_QUOTES)
    suspend fun getAllQuotes(): Response<AllQuotesDataClass>

    @GET(RANDOM_QUOTES)
    suspend fun getRandomQuotes(): Response<Quote>



}


