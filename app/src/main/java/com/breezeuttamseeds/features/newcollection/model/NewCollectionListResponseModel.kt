package com.breezeuttamseeds.features.newcollection.model

import com.breezeuttamseeds.app.domain.CollectionDetailsEntity
import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}