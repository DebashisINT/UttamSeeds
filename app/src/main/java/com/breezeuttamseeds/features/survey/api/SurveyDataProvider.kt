package com.breezeuttamseeds.features.survey.api

import com.breezeuttamseeds.features.photoReg.api.GetUserListPhotoRegApi
import com.breezeuttamseeds.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}