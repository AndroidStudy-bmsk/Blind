package org.bmsk.blind.data.repository

import org.bmsk.blind.data.source.remote.api.ContentService
import org.bmsk.blind.domain.model.Content
import org.bmsk.blind.domain.model.ContentMapper.toRequest
import org.bmsk.blind.domain.repository.ContentRepository
import java.io.IOException
import javax.inject.Inject

class ContentRepositoryImpl @Inject constructor(
    private val contentService: ContentService
) : ContentRepository {
    override suspend fun save(item: Content): Boolean {
        return try {
            contentService.saveItem(item.toRequest())
            true
        } catch (e: IOException) {  // network가 없을 경우 대비
            false
        }
    }
}