package com.tal;

import com.alibaba.fastjson.JSON;
import com.tal.bean.*;
import com.tal.service.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Application {
    public static void main(String[] args) {
        LoginReq loginReq = new LoginReq();
        loginReq.setUsername("songmeizi");
        loginReq.setPassword("111111");
        Service service = Service.getInstance();
        service.login(loginReq, new Callback<Void>() {
            public void onResponse(Call<Void> call, Response<Void> response) {
                System.out.println("login success");
            }

            public void onFailure(Call<Void> call, Throwable throwable) {

            }
        });

        RegisterReq registerReq=new RegisterReq();
        registerReq.setUsername("songmeizi");
        registerReq.setPassword("1111");
        registerReq.setMobile("12311111111");
        service.register(registerReq, new Callback<Void>() {
            public void onResponse(Call<Void> call, Response<Void> response) {
                System.out.println("register success");
            }

            public void onFailure(Call<Void> call, Throwable throwable) {

            }
        });

        UserInfoReq infoReq = new UserInfoReq();
        infoReq.setId("8888");
        service.getUserInfo(infoReq, new Callback<UserInfoReply>() {
            public void onResponse(Call<UserInfoReply> call, Response<UserInfoReply> response) {
                System.out.println("userInfo:"+ JSON.toJSONString(response.body()));
            }

            public void onFailure(Call<UserInfoReply> call, Throwable throwable) {

            }
        });

        UserSearchReq searchReq=new UserSearchReq();
        searchReq.setKeyWord("song");
        service.searchUser(searchReq, new Callback<UserInfoReply>() {
            public void onResponse(Call<UserInfoReply> call, Response<UserInfoReply> response) {
                System.out.println("search:"+JSON.toJSONString(response.body()));
            }

            public void onFailure(Call<UserInfoReply> call, Throwable throwable) {

            }
        });

    }
}
