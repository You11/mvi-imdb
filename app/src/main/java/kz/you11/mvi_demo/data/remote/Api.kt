package kz.you11.mvi_demo.data.remote

import kz.you11.mvi_demo.data.remote.models.TVPopularResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("popular")
    fun getTVSeriesList(@Query("page") page: Int = 0): Response<TVPopularResponse>
}