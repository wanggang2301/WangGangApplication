package com.wg.wanggangapplication.service;

import com.wg.wanggangapplication.model.response.GetIpInfoResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by asus1 on 2016/3/22.
 */
public interface ApiService  {
    @GET("mlottery/core/footBallMatch.queryMatchInfos.do")
    Observable<GetIpInfoResponse> getIpInfo(@Query("thirdId") String id, @Query("lang") String lang);

    //足球内页http://m.13322.com/mlottery/core/footBallMatch.queryAndroidFirstMatchInfos.do?lang=zh&timeZone=8&thirdId=402944
  //  @GET("mlottery/core/footBallMatch.queryAndroidFirstMatchInfos.do")
    //Observable<>
}
