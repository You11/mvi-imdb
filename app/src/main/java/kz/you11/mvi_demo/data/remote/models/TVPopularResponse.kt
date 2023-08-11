package kz.you11.mvi_demo.data.remote.models

import com.squareup.moshi.Json

class TVPopularResponse {

    val totalPages: Int? = null

    val results: List<Results>? = null


    class Results {

        val id: Int? = null

        val name: String? = null

        @field:Json(name = "poster_path")
        val imagePath: String? = null

        @field:Json(name = "vote_average")
        val ratingAverage: Int? = null
    }
}