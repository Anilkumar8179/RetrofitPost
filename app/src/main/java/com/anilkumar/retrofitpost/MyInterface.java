package com.anilkumar.retrofitpost;



import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyInterface {
    @POST("users")
     Call<Pojo> createPost(@Body Pojo pojo);



}
