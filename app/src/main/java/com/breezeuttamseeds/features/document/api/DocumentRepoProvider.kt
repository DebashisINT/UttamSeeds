package com.breezeuttamseeds.features.document.api

import com.breezeuttamseeds.features.dymanicSection.api.DynamicApi
import com.breezeuttamseeds.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}