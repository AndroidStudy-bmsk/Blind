package org.bmsk.blind.domain.model

import org.bmsk.blind.data.model.dto.ContentDto

object ContentMapper {

    fun Content.toRequest() = ContentDto(
        id = id,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount,
        commentCount = commentCount,
        viewCount = viewCount
    )
}