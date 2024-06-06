package com.breezeuttamseeds.features.viewAllOrder.interf

import com.breezeuttamseeds.app.domain.NewOrderProductEntity
import com.breezeuttamseeds.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}