package com.wg.wanggangapplication.service;


import com.wg.wanggangapplication.model.MovieEntity;
import com.wg.wanggangapplication.model.Subject;
import com.wg.wanggangapplication.net.HttpResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 描述:  ${TODO}
 * 作者:  wangg@13322.com
 * 时间:  2016/7/27 14:35
 */
public interface MovieService {
    @GET("top250")
    Call<MovieEntity> getTopMoive(@Query("start") int start, @Query("count") int count);


    @GET("top250")
    Observable<MovieEntity> getTopMoive2(@Query("start") int start, @Query("count") int count);


    @GET("top250")
    Observable<HttpResult<List<Subject>>> getTopMoive3(@Query("start") int start, @Query("count") int count);

}
