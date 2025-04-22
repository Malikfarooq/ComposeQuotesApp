package com.example.composequotesapp.domain.usecases

import com.example.composequotesapp.domain.repository.QuotesRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RandomApiUseCase @Inject constructor(
     private  val quotesRepository: QuotesRepository
) {

    operator fun invoke = flow<> {

        quotesRepository.getRandomQuotes().let {

            if (it.isSuccessful) {
                val quotes = it.body()
                if (quotes != null) {
                    emit(quotes)
                } else {
                    emit(null)
                }
            }
        }
    }

}