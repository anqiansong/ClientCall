package com.tal.service;

import com.tal.bean.*;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IService {
    // 登录
	@POST("/api/user/login")
	Call<Void> login(@Body RequestBody req);
	// 注册
	@POST("/api/user/register")
	Call<Void> register(@Body RequestBody req);
	// 用户搜索
	@GET("/api/user/search")
	Call<UserInfoReply> searchUser(@Query("keyWord") String keyWord);
	// 获取用户信息
	@GET("/api/user/{id}")
	Call<UserInfoReply> getUserInfo(@Path("id") String id);
	
}