package com.breezeuttamseeds.features.login.model.productlistmodel

import com.breezeuttamseeds.app.domain.ModelEntity
import com.breezeuttamseeds.app.domain.ProductListEntity
import com.breezeuttamseeds.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}