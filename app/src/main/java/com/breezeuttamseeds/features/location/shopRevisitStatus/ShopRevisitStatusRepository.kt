package com.breezeuttamseeds.features.location.shopRevisitStatus

import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.location.model.ShopDurationRequest
import com.breezeuttamseeds.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}