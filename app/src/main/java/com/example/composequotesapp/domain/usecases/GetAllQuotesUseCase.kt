package com.example.composequotesapp.domain.usecases

import com.example.composequotesapp.domain.models.Quotes
import com.example.composequotesapp.domain.repository.QuotesRepository
import com.example.composequotesapp.utils.ApiResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// TODO: need to understand invoke method

//TODO: need to add error handle into API
class GetAllQuotesUseCase @Inject constructor(
    private val repository: QuotesRepository
) {
    operator fun invoke(): Flow<ApiResponse<List<Quotes>>> = flow {
        emit(ApiResponse.Loading)

        try {
            val quotes = repository.getAllQuotes()

            if(quotes.isSuccessful){
                val data= quotes.body()?: emptyList()
                 emit(ApiResponse.Success(data))
            }else{
                emit(ApiResponse.Error("Error: ${quotes.code()} ${quotes.message()}"))
            }

        }catch (ex:Exception){
            val errorMsg = ex.localizedMessage ?: "Unknown error"
            emit(ApiResponse.Error("Exception: $errorMsg"))
        }
    }
}
