package com.breezeuttamseeds.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezeuttamseeds.app.FileUtils
import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.NewQuotation.model.*
import com.breezeuttamseeds.features.addshop.model.AddShopRequestData
import com.breezeuttamseeds.features.addshop.model.AddShopResponse
import com.breezeuttamseeds.features.damageProduct.model.DamageProductResponseModel
import com.breezeuttamseeds.features.damageProduct.model.delBreakageReq
import com.breezeuttamseeds.features.damageProduct.model.viewAllBreakageReq
import com.breezeuttamseeds.features.login.model.userconfig.UserConfigResponseModel
import com.breezeuttamseeds.features.myjobs.model.WIPImageSubmit
import com.breezeuttamseeds.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}