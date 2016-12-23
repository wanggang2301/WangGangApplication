package com.wg.wanggangapplication.service;

import com.wg.wanggangapplication.model.response.FootBallDetailsBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author: Wangg
 * @Name：FootBallApiService
 * @Description:
 * @Created on:2016/12/23  11:49.
 */

public interface FootBallApiService {
    @GET("mlottery/core/footBallMatch.queryAndroidFirstMatchInfos.do")
    Observable<FootBallDetailsBean> getFootBallDetails(@Query("lang") String lang, @Query("timeZone") String timeZone, @Query("thirdId") String thirId);


    //足球内页http://m.13322.com/mlottery/core/footBallMatch.queryAndroidFirstMatchInfos.do?lang=zh&timeZone=8&thirdId=402944
    //  @GET("mlottery/core/footBallMatch.queryAndroidFirstMatchInfos.do")
    //Observable<>
}
