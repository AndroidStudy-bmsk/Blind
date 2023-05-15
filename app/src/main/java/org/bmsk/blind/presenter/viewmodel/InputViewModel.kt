package org.bmsk.blind.presenter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.bmsk.blind.domain.model.Content
import javax.inject.Inject

@HiltViewModel
class InputViewModel @Inject constructor(

) : ViewModel() {

    private val _doneEvent = MutableLiveData<Pair<Boolean, String>>()
    val doneEvent: LiveData<Pair<Boolean, String>>
        get() = _doneEvent

    var category = MutableLiveData("")
    var title = MutableLiveData("")
    var content = MutableLiveData("")
    private var item: Content? = null

    fun initData(item: Content) {
        this.item = item
        category.value = item.category
        title.value = item.title
        content.value = item.content
    }

    fun insertData() {
        val categoryValue = category.value
        val titleValue = title.value
        val contentValue = content.value

        if (categoryValue.isNullOrBlank() ||
            titleValue.isNullOrBlank() ||
            contentValue.isNullOrBlank()
        ) {
            _doneEvent.value = Pair(false, "모든 항목을 입력하셔야 합니다.")
            return
        }
    }

    // todo api
}
