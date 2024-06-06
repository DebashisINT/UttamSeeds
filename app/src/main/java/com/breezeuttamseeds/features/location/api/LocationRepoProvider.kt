package com.breezeuttamseeds.features.location.api

import com.breezeuttamseeds.features.location.shopdurationapi.ShopDurationApi
import com.breezeuttamseeds.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}