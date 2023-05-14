package org.bmsk.blind.presenter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.bmsk.blind.R
import org.bmsk.blind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { initBinding() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    private fun initBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater).apply {
            view = this@MainActivity
        }
    }

    fun onClickAdd() {

    }
}