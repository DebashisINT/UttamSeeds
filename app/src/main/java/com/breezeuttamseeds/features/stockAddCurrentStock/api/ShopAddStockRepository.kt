package com.breezeuttamseeds.features.stockAddCurrentStock.api

import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.location.model.ShopRevisitStatusRequest
import com.breezeuttamseeds.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezeuttamseeds.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezeuttamseeds.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezeuttamseeds.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}