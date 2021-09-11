package com.example.jm.memes.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jm.jokes.data.api.JokesService
import com.example.jm.jokes.data.model.JokesModel
import com.example.jm.jokes.data.repository.JokesRepository
import com.example.jm.network.RetrofitBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    private val repository: JokesRepository = JokesRepository(JokesService(RetrofitBuilder))

    private var _userLiveData = MutableLiveData<JokesModel>()

    val jokesLiveData: LiveData<JokesModel>
        get() = _userLiveData


    fun fetchData(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getUserData()
            if(response.isSuccessful){
                _userLiveData.postValue(response.body())
            }
        }

    }


}