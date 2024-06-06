package com.breezeuttamseeds.features.location.shopRevisitStatus

import com.breezeuttamseeds.features.location.shopdurationapi.ShopDurationApi
import com.breezeuttamseeds.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}