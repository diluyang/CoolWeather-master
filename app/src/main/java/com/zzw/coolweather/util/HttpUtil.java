package com.zzw.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by dly.
 */

public class HttpUtil {
    /**
     * post请求
     * @param address
     * @param callback
     */
    public static void  sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient okHttpClient=new OkHttpClient ();
        Request request = new Request.Builder ().url (address).build ();
        okHttpClient.newCall (request).enqueue (callback);
    }
}
