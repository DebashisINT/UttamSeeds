package com.breezeuttamseeds.features.stockCompetetorStock.api

import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.orderList.model.NewOrderListResponseModel
import com.breezeuttamseeds.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezeuttamseeds.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}