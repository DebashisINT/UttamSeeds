package com.breezeuttamseeds.features.activities.api

import com.breezeuttamseeds.features.member.api.TeamApi
import com.breezeuttamseeds.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}