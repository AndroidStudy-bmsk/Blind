package org.bmsk.blind.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import org.bmsk.blind.data.repository.ContentRepositoryImpl
import org.bmsk.blind.data.source.remote.api.ContentService
import org.bmsk.blind.domain.repository.ContentRepository

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providesContentRepository(
        contentService: ContentService
    ): ContentRepository = ContentRepositoryImpl(contentService)
}