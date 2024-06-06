package com.breezeuttamseeds.features.weather.api

import com.breezeuttamseeds.base.BaseResponse
import com.breezeuttamseeds.features.task.api.TaskApi
import com.breezeuttamseeds.features.task.model.AddTaskInputModel
import com.breezeuttamseeds.features.weather.model.ForeCastAPIResponse
import com.breezeuttamseeds.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}