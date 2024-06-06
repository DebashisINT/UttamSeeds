package com.breezeuttamseeds.features.nearbyuserlist.api

import com.breezeuttamseeds.app.Pref
import com.breezeuttamseeds.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezeuttamseeds.features.newcollection.model.NewCollectionListResponseModel
import com.breezeuttamseeds.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}