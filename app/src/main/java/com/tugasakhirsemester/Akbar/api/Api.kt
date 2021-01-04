package com.tugasakhirsemester.Akbar.api

import com.tugasakhirsemester.Akbar.model.IndonesiaResponse
import com.tugasakhirsemester.Akbar.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("indonesia/provinsi")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}