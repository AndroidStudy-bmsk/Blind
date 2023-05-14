package org.bmsk.blind.presenter.ui.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import org.bmsk.blind.databinding.ItemContentBinding
import org.bmsk.blind.domain.model.Content
import org.bmsk.blind.presenter.ui.MainActivity

class ContentViewHolder(
    private val binding: ItemContentBinding,
    private val handler: MainActivity.Handler,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Content) {
        binding.item = item
        binding.handler = handler
    }
}