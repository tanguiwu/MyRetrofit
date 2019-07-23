package com.example.myretrofit.inter;

import com.example.myretrofit.bean.PostSnslearnBean;
import com.example.myretrofit.bean.SnslearnBean;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IPostRequestDataInterface {
    // 注解里传入网络请求的部分URL地址
    //@POST("index.php?app=interface&mod=Directory&act=rebuildName&directory_id=10018&name=retrofit&token=MzM1MjYyMWE0NjMyZTFkOWQ5YzVkMTYyODJmOTFjZDk")
    @POST("index.php?app=interface&mod=Directory&act=rebuildName")
    // getCall()是接受网络请求数据的方法
    Call<PostSnslearnBean> getCall(@Query("directory_id") String directory_id, @Query("name") String name, @Query("token") String token);
}
