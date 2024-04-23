package com.example.myapplication12.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication12.model.api.Repository
import com.example.myapplication12.model.ResponceWebView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class SplashViewModel:ViewModel() {

    private val repository = Repository()
    var webViewUrl: MutableLiveData <Response <ResponceWebView> > = MutableLiveData()

    fun setPostParametersPhone(phoneName : String , locale : String , unique : String){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.setParametersPhone(phoneName , locale , unique)
            withContext(Dispatchers.Main){
                webViewUrl.value = response
            }
        }
    }

}