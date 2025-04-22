package com.example.composequotesapp.data.repositoryImpl

import com.example.composequotesapp.data.remote.ApiInterface
import com.example.composequotesapp.domain.models.AllQuotesDataClass
import com.example.composequotesapp.domain.models.Quote
import com.example.composequotesapp.domain.repository.QuotesRepository
import retrofit2.Response
import javax.inject.Inject

class QuotesRepositoryImpl @Inject constructor(private val  apiInterface: ApiInterface) : QuotesRepository {
    override suspend fun getAllQuotes(): Response<AllQuotesDataClass> {
        return apiInterface.getAllQuotes()
    }

    override suspend fun getRandomQuotes(): Response<Quote> {
        return apiInterface.getRandomQuotes()
    }
}