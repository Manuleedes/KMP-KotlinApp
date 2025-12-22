package com.plcoding.bookpedia.book.presentation.book_detail

import com.plcoding.bookpedia.book.dormain.Book

sealed interface BookDetailAction {
    data object OnBackClick: BookDetailAction
    data object OnFavoriteClick: BookDetailAction
    data class  OnSelectedBBookChange(val book: Book): BookDetailAction
}