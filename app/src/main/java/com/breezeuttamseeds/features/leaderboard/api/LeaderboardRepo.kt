package com.breezeuttamseeds.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezeuttamseeds.app.FileUtils
import com.breezeuttamseeds.app.Pref
import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.addshop.model.AddLogReqData
import com.breezeuttamseeds.features.addshop.model.AddShopRequestData
import com.breezeuttamseeds.features.addshop.model.AddShopResponse
import com.breezeuttamseeds.features.addshop.model.LogFileResponse
import com.breezeuttamseeds.features.addshop.model.UpdateAddrReq
import com.breezeuttamseeds.features.contacts.CallHisDtls
import com.breezeuttamseeds.features.contacts.CompanyReqData
import com.breezeuttamseeds.features.contacts.ContactMasterRes
import com.breezeuttamseeds.features.contacts.SourceMasterRes
import com.breezeuttamseeds.features.contacts.StageMasterRes
import com.breezeuttamseeds.features.contacts.StatusMasterRes
import com.breezeuttamseeds.features.contacts.TypeMasterRes
import com.breezeuttamseeds.features.dashboard.presentation.DashboardActivity
import com.breezeuttamseeds.features.login.model.WhatsappApiData
import com.breezeuttamseeds.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}