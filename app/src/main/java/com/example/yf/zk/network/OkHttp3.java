package com.example.yf.zk.network;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttp3{

    private OkHttpClient okHttpClient;
    private Request request;
    private FormBody build;

    public void getData(String url, final GetBackPost getBackPost){
        okHttpClient = new OkHttpClient();
        request = new Request.Builder().url(url).method("GET", null).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                getBackPost.getTrue(response.body().string());
            }
        });
    }
    public void getPost(final String url, final String name, final String pwd, final GetBackCall getBackCall){
        okHttpClient = new OkHttpClient();
        build = new FormBody.Builder().add("phone", name).add("pwd", pwd).build();
        request = new Request.Builder().url(url).post(this.build).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                getBackCall.getTrue("没有数据");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                getBackCall.getTrue(response.body().string());
            }
        });
    }
    public interface GetBackCall{
        public void getTrue(String mess);
    }
    public interface  GetBackPost{
        public void getTrue(String mess);
    }
}
