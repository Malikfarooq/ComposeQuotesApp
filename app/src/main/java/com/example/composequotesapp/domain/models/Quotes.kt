package com.example.composequotesapp.domain.models

/**
 * Notice: no nullables, domain layer avoids ? for clean usage in business logic and UI.
 * */
data class Quotes(
    val author: String,
    val id: Int,
    val quote: String
)
