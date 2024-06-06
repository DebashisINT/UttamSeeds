package com.breezeuttamseeds.features.photoReg.present

import com.breezeuttamseeds.app.domain.ProspectEntity
import com.breezeuttamseeds.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}