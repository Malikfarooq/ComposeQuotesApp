package com.example.composequotesapp.domain.usecases

import com.example.composequotesapp.domain.models.Quotes
import com.example.composequotesapp.domain.repository.QuotesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// TODO: need to understand invoke method

//TODO: need to add error handle into API
class GetAllQuotesUseCase @Inject constructor(
    private val repository: QuotesRepository
) {
    operator fun invoke(): Flow<List<Quotes>> = flow {
        val quotes = repository.getAllQuotes()
        emit(quotes)
    }
}
