/*
 * Code generated by goctl-android. DO NOT EDIT.
 *
 * Copyright [2020] [ClientCall]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tal.service;

import com.tal.bean.*;
import com.alibaba.fastjson.JSON;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {
    private static final String MEDIA_TYPE_JSON = "application/json; charset=utf-8";
    private static final String BASE_RUL = "http://localhost:8888/";// TODO replace to your host and delete this comment
    private static Service instance;
    private static IService service;

    private Service() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_RUL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(IService.class);
    }

    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    private RequestBody buildJSONBody(Object obj) {
        String s = JSON.toJSONString(obj);
        return RequestBody.create(s, MediaType.parse(MEDIA_TYPE_JSON));
    }
	// 登录
    public void login(LoginReq in, Callback<Void> callback) {
        Call<Void> call = service.login(buildJSONBody(in));
        call.enqueue(callback);
    }
	// 注册
    public void register(RegisterReq in, Callback<Void> callback) {
        Call<Void> call = service.register(buildJSONBody(in));
        call.enqueue(callback);
    }
	// 用户搜索
    public void searchUser(UserSearchReq in, Callback<UserInfoReply> callback) {
        Call<UserInfoReply> call = service.searchUser(in.getKeyWord());
        call.enqueue(callback);
    }
	// 获取用户信息
    public void getUserInfo(UserInfoReq in, Callback<UserInfoReply> callback) {
        Call<UserInfoReply> call = service.getUserInfo(in.getId());
        call.enqueue(callback);
    }
	
}
