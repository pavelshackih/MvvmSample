package io.pavelshackih.mvvmsample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {

    val isError = MutableLiveData<Boolean>()
    val name = MutableLiveData<String>()

    fun onClick() {

    }
}
