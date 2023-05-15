package org.bmsk.blind.domain.usecase

import org.bmsk.blind.domain.model.Content
import org.bmsk.blind.domain.repository.ContentRepository
import javax.inject.Inject

class ContentUseCase @Inject constructor(
    private val contentRepository: ContentRepository
) {
    suspend fun save(item: Content) = contentRepository.save(item)
}