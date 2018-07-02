package io.pavelshackih.mvvmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import io.pavelshackih.mvvmsample.databinding.ActivityMainBinding
import io.pavelshackih.mvvmsample.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = MainViewModel()
        binding.setLifecycleOwner(this)
    }
}
