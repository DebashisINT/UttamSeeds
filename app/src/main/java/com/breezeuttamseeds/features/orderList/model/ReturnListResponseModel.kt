package com.breezeuttamseeds.features.orderList.model

import com.breezeuttamseeds.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}