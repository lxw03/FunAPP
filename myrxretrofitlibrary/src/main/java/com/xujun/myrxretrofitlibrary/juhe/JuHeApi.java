package com.xujun.myrxretrofitlibrary.juhe;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;
import rx.Observable;

/**
 * @author xujun  on 2017/1/2.
 * @email gdutxiaoxu@163.com
 */

public interface JuHeApi {


    String mBaseUrl="http://api.juheapi.com/";

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> push(@Url String url, @FieldMap Map<String,Object> paramsMap);
}
