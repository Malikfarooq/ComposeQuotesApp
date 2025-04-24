package com.example.composequotesapp.domain.repository
import com.example.composequotesapp.domain.models.Quotes
import retrofit2.Response




/**
 Abstract interface that defines the contract for fetching quotes.
 Implemented in the data layer to provide actual data from API or database.
 ---------------
 This repo interface could be multiple on the basis of
   module like Login ,  Register, Home etc
*/

interface QuotesRepository {
    suspend fun getAllQuotes(): Response<List<Quotes>>
    suspend fun getRandomQuote(): Response<Quotes>
}
