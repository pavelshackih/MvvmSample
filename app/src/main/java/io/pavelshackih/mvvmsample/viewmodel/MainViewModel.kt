package io.pavelshackih.mvvmsample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val isLoading = MutableLiveData<Boolean>()
    val items = MutableLiveData<List<ItemViewModel>>()

    init {
        isLoading.value = true
        val list = (0..10).map {
            ItemViewModel().apply {
                isError.value = it % 5 == 0
                name.value = "name$it"
            }
        }
        Thread {
            Thread.sleep(3000)
            items.postValue(list)
            isLoading.postValue(false)
        }.start()
    }
}