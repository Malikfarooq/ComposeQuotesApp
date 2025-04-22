package com.example.composequotesapp.di

import com.example.composequotesapp.data.remote.ApiInterface
import com.example.composequotesapp.data.repositoryImpl.QuotesRepositoryImpl
import com.example.composequotesapp.domain.repository.QuotesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides

    fun getQuotesRepository(apiInterface: ApiInterface): QuotesRepository = QuotesRepositoryImpl(apiInterface)


}