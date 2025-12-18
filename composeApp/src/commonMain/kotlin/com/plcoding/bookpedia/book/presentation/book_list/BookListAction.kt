package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.dormain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String): BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class onTabSelected(val index: Int): BookListAction

}