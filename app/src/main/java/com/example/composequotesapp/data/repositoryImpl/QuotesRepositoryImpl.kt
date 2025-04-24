package com.example.composequotesapp.data.repositoryImpl

import com.example.composequotesapp.data.mapper.toDomain
import com.example.composequotesapp.data.remote.ApiInterface
import com.example.composequotesapp.domain.models.Quotes
import com.example.composequotesapp.domain.repository.QuotesRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject


/**
 * Implementation of the QuotesRepository interface.
 * Fetches data from the remote API and maps it to domain models if necessary.
 */
class QuotesRepositoryImpl @Inject constructor(private val apiInterface: ApiInterface) : QuotesRepository {

    override suspend fun getAllQuotes(): Response<List<Quotes>> {
        val response = apiInterface.getAllQuotes()
        return if (response.isSuccessful) {
            val quotesList = response.body()?.quotes?.toDomain() ?: emptyList()
            Response.success(quotesList)
        } else {
            Response.error(response.code(), response.errorBody() ?: ResponseBody.create(null, ""))
        }
    }

    override suspend fun getRandomQuote(): Response<Quotes> {
        val response = apiInterface.getRandomQuotes()
        return if (response.isSuccessful) {
            val quote = response.body()?.toDomain() ?: Quotes(id = -1, author = "", quote = "")
            Response.success(quote)
        } else {
            Response.error(response.code(), response.errorBody() ?: ResponseBody.create(null, ""))
        }
    }


}
