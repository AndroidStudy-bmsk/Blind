package org.bmsk.blind.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.bmsk.blind.data.source.remote.api.ContentService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Singleton
    @Provides
    fun providesContentService(retrofit: Retrofit): ContentService =
        retrofit.create(ContentService::class.java)
}