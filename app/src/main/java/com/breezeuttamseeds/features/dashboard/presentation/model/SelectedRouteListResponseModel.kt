package com.breezeuttamseeds.features.dashboard.presentation.model

import com.breezeuttamseeds.base.BaseResponse

/**
 * Created by Saikat on 03-12-2018.
 */
class SelectedRouteListResponseModel : BaseResponse() {
    var JointVisitSelectedUserName : String = ""
    var JointVisit_Employee_Code : String = ""
    var worktype: ArrayList<SelectedRouteListWorkTypeModel>? = null
    var route_list: ArrayList<SelectRouteShopListModel>? = null
}