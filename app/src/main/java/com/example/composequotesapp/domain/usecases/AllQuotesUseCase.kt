package com.example.composequotesapp.domain.usecases

import com.example.composequotesapp.domain.repository.QuotesRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AllQuotesUseCase @Inject constructor(
    private val quotesRepository: QuotesRepository
) {
    /**
     * need to understand invoke method
     */
    operator fun invoke()= flow {
         quotesRepository.getAllQuotes().let {
             if (it.isSuccessful) {
                 val quotes = it.body()?.quotes
                 if (quotes != null) {
                     emit(quotes)
                 } else {
                     emit(emptyList())
                 }
             }
         }
    }
}