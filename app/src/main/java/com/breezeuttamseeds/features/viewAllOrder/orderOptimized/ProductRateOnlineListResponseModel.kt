package com.breezeuttamseeds.features.viewAllOrder.orderOptimized

import com.breezeuttamseeds.app.domain.ProductOnlineRateTempEntity
import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}