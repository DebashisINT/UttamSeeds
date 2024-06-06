package com.breezeuttamseeds.features.viewAllOrder.interf

import com.breezeuttamseeds.app.domain.NewOrderGenderEntity
import com.breezeuttamseeds.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}