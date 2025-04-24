package com.example.composequotesapp.domain.usecases

import com.example.composequotesapp.domain.models.Quotes
import com.example.composequotesapp.domain.repository.QuotesRepository
import com.example.composequotesapp.utils.ApiResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


/**
 * Use case that contains the business logic to fetch a random quote from the repository.
 * Called from the ViewModel or presentation layer.
 */

//TODO: need to add error handle into API
class RandomApiUseCase @Inject constructor(
    private val quotesRepository: QuotesRepository
) {
    operator fun invoke(): Flow<ApiResponse<Quotes>> = flow {
        emit(ApiResponse.Loading)

        try {
            val quotes = quotesRepository.getRandomQuote()

            if (quotes.isSuccessful) {
                emit(ApiResponse.Success(quotes.body() ?: Quotes(id = -1, author = "", quote = "")))
            } else {
                emit(ApiResponse.Error("Error: ${quotes.code()} ${quotes.message()}"))
            }

        } catch (ex: Exception) {
            val errorMsg = ex.localizedMessage ?: "Unknown error"
            emit(ApiResponse.Error("Exception: $errorMsg"))
        }
    }
}