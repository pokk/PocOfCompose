package com.compose.feature.amodule

import com.compose.domain.share.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AModule {
    @Provides
    fun provideAComponent(): Component = AComponent()
}
