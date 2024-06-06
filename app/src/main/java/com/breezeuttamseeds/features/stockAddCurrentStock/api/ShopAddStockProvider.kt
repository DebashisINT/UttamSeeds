package com.breezeuttamseeds.features.stockAddCurrentStock.api

import com.breezeuttamseeds.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezeuttamseeds.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}