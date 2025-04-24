package com.example.composequotesapp.data.remote

import com.example.composequotesapp.data.model.AllQuotesDto
import com.example.composequotesapp.data.model.QuoteDto
import com.example.composequotesapp.networks.ALL_QUOTES
import com.example.composequotesapp.networks.RANDOM_QUOTES
import retrofit2.Response
import retrofit2.http.GET

/**

 Retrofit interface defining the remote API endpoints.
 This interface belongs to the data layer and is used to fetch data from the server.
 Returns raw Response<T> types, which should ideally be mapped to domain models in the repository.

*/

interface ApiInterface{

    @GET(ALL_QUOTES)
    suspend fun getAllQuotes(): Response<AllQuotesDto>

    @GET(RANDOM_QUOTES)
    suspend fun getRandomQuotes(): Response<QuoteDto>



}


