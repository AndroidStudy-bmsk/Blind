package org.bmsk.blind.presenter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DividerItemDecoration
import dagger.hilt.android.AndroidEntryPoint
import org.bmsk.blind.R
import org.bmsk.blind.databinding.ActivityMainBinding
import org.bmsk.blind.domain.model.Content
import org.bmsk.blind.presenter.ui.list.ListAdapter

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val binding by lazy { initBinding() }
    private val adapter by lazy { ListAdapter(Handler()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    private fun initBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater).apply {
            view = this@MainActivity
            recyclerView.adapter = adapter
            recyclerView.addItemDecoration(
                DividerItemDecoration(this@MainActivity, LinearLayout.VERTICAL)
            )
        }
    }

    fun onClickAdd() {
        InputActivity.start(this)
    }

    inner class Handler {
        fun onClickItem(item: Content) {
            InputActivity.start(this@MainActivity, item)
        }

        fun onLongClickItem(item: Content): Boolean {
            AlertDialog.Builder(this@MainActivity)
                .setTitle("정말 삭제 하시겠습니까?")
                .setPositiveButton("네") { _, _ ->

                }.setNegativeButton("아니오") { _, _ ->

                }.show()

            return false
        }
    }
}
