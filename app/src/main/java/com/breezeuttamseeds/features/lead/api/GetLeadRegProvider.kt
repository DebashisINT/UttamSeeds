package com.breezeuttamseeds.features.lead.api

import com.breezeuttamseeds.features.NewQuotation.api.GetQuotListRegRepository
import com.breezeuttamseeds.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}