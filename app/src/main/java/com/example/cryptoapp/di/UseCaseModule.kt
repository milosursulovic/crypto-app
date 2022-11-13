package com.example.cryptoapp.di

import com.example.cryptoapp.domain.repository.CoinRepository
import com.example.cryptoapp.domain.use_case.get_coin.GetCoinUseCase
import com.example.cryptoapp.domain.use_case.get_coins.GetCoinsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun providesGetCoinUseCase(repository: CoinRepository): GetCoinUseCase {
        return GetCoinUseCase(repository)
    }

    @Provides
    @Singleton
    fun providesGetCoinsUseCase(repository: CoinRepository): GetCoinsUseCase {
        return GetCoinsUseCase(repository)
    }
}