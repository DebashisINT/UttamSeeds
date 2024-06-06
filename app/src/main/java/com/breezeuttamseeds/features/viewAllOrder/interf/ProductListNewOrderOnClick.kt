package com.breezeuttamseeds.features.viewAllOrder.interf

import com.breezeuttamseeds.app.domain.NewOrderGenderEntity
import com.breezeuttamseeds.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}