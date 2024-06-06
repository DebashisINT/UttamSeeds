package com.breezeuttamseeds.features.dashboard.presentation.api.dayStartEnd

import com.breezeuttamseeds.features.stockCompetetorStock.api.AddCompStockApi
import com.breezeuttamseeds.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}