package com.breezeuttamseeds.features.viewAllOrder.interf

import com.breezeuttamseeds.app.domain.NewOrderGenderEntity
import com.breezeuttamseeds.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}