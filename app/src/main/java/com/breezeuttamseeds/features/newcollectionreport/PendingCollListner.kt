package com.breezeuttamseeds.features.newcollectionreport

import com.breezeuttamseeds.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}