package com.example.composequotesapp.data.mapper

import com.example.composequotesapp.data.model.QuoteDto
import com.example.composequotesapp.domain.models.Quotes


// Extension functions to convert QuoteDto objects to Quote domain objects
fun QuoteDto.toDomain(): Quotes {
    return Quotes(
        author = author.orEmpty(),
        id = id ?: -1,
        quote = quote.orEmpty()
    )
}

fun List<QuoteDto>.toDomain(): List<Quotes> {
    return map { it.toDomain() }
}
