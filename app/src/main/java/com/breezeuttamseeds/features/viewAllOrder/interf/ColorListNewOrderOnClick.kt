package com.breezeuttamseeds.features.viewAllOrder.interf

import com.breezeuttamseeds.app.domain.NewOrderColorEntity
import com.breezeuttamseeds.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}