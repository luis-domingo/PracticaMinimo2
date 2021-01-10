package com.example.practicaminimo2;

import com.example.practicaminimo2.models.Museums;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {

    @GET("/api/dataset/museus/format/json")
    Call<Museums> getMuseums();

}
