package org.bmsk.blind.domain.repository

import org.bmsk.blind.domain.model.Content

interface ContentRepository {

    suspend fun save(item: Content) : Boolean
}