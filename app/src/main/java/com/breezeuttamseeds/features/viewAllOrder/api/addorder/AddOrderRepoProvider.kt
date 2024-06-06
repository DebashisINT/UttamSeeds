package com.breezeuttamseeds.features.viewAllOrder.api.addorder

import com.breezeuttamseeds.features.timesheet.api.TimeSheetApi
import com.breezeuttamseeds.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 01-10-2018.
 */
object AddOrderRepoProvider {
    fun provideAddOrderRepository(): AddOrderRepo {
        return AddOrderRepo(AddOrderApi.create())
    }

    fun provideAddOrderImageRepository(): AddOrderRepo {
        return AddOrderRepo(AddOrderApi.createImage())
    }
}