package com.breezeuttamseeds.features.weather.api

import com.breezeuttamseeds.features.task.api.TaskApi
import com.breezeuttamseeds.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}