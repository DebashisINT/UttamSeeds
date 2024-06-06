package com.breezeuttamseeds.features.viewAllOrder.model

import com.breezeuttamseeds.app.domain.NewOrderColorEntity
import com.breezeuttamseeds.app.domain.NewOrderGenderEntity
import com.breezeuttamseeds.app.domain.NewOrderProductEntity
import com.breezeuttamseeds.app.domain.NewOrderSizeEntity
import com.breezeuttamseeds.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

