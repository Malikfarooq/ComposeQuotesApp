package com.example.composequotesapp.domain.repository

import com.example.composequotesapp.domain.models.AllQuotesDataClass
import com.example.composequotesapp.domain.models.Quote
import retrofit2.Response


/*
  This repo interface could be multiple on the basis of
   module like Login ,  Register, Home etc
 */
interface QuotesRepository {

    suspend fun  getAllQuotes(): Response<AllQuotesDataClass>

    suspend fun  getRandomQuotes(): Response<Quote>

}