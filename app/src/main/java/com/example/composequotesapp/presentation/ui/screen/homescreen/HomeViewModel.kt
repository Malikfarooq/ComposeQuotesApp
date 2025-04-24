package com.example.composequotesapp.presentation.ui.screen.homescreen

import android.support.v4.os.IResultReceiver._Parcel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composequotesapp.domain.models.Quotes
import com.example.composequotesapp.domain.usecases.GetAllQuotesUseCase
import com.example.composequotesapp.domain.usecases.RandomApiUseCase
import com.example.composequotesapp.utils.ApiResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val getAllQuotesUseCase: GetAllQuotesUseCase,
    private val getRandomApiUseCase: RandomApiUseCase
) : ViewModel() {

     private val _allQuotes = MutableStateFlow<ApiResponse<List<Quotes>>>(ApiResponse.Loading)
     val  allQuotes: StateFlow<ApiResponse<List<Quotes>>> =_allQuotes

     private  val _randomQuote = MutableStateFlow<ApiResponse<Quotes>>(ApiResponse.Loading)
     val  randomQuote: StateFlow<ApiResponse<Quotes>> = _randomQuote

    fun getAllQuotes() {
        viewModelScope.launch {
            getAllQuotesUseCase().collect { response ->
                _allQuotes.value = response
            }
        }
    }

    fun getRandomQuote() {
        viewModelScope.launch {
            getRandomApiUseCase().collect { response ->
                _randomQuote.value = response
            }
        }
    }


}