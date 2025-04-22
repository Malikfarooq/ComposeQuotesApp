package com.example.composequotesapp.domain.usecases

import com.example.composequotesapp.domain.repository.QuotesRepository
import javax.inject.Inject

class AllQuotesUseCase @Inject constructor(
    private val quotesRepository: QuotesRepository
) {
    /**
     * need to understand invoke method
     */
    suspend operator fun invoke() = quotesRepository.getAllQuotes()
}