package com.plcoding.bookpedia.book.data.network

import com.plcoding.bookpedia.book.dormain.Book
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import io.ktor.client.HttpClient

data class KtorRemoteBookDataSource (
    private val httpClient: HttpClient

){
    suspend fun searchBooks(
                        query: String,
                            resultLimit: Int? = null
                            ): Result<List<Book>, DataError.Remote>{

    }
}

