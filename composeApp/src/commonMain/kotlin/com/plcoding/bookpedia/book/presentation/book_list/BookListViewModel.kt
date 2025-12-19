package com.plcoding.bookpedia.book.presentation.book_list

import androidx.lifecycle.ViewModel
import com.plcoding.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.plcoding.bookpedia.book.data.repository.DefaultBookRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

//presentation -> domain <- data
class BookListViewModel(
    private val dataSource: DefaultBookRepository
) : ViewModel(){
    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()
    fun onAction(action: BookListAction){
        when(action){
            is BookListAction.OnBookClick -> {

            }
            is BookListAction.OnSearchQueryChange -> {
                _state.update {
                    it.copy(searchQuery = action.query)
                }
            }
            is BookListAction.onTabSelected -> {
                _state.update {
                    it.copy(selectedTabIndex = action.index)
                }
            }
        }
    }

}