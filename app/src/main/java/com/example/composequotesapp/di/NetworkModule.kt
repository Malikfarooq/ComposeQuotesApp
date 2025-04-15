package com.example.composequotesapp.di

import com.example.composequotesapp.networks.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    /** We use @Named("BaseUrl") to uniquely identify this String provider
    because there might be multiple @Provides functions returning String.
    Without a name, Hilt wouldn't know which one to inject if more than one exists.*/

    @Provides
    @Singleton
    @Named("BaseUrl")
    fun provideBaseUrl(): String = BASE_URL

    /** We annotate the parameter with @Named("BaseUrl") so Hilt knows
    to inject the String provided by the 'provideBaseUrl()' function above.*/

    @Provides
    @Singleton
    fun provideRetrofitClient(@Named("BaseUrl") baseUrl: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}
