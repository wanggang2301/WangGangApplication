package com.wg.wanggangapplication.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.wg.wanggangapplication.R;
import com.wg.wanggangapplication.model.Subject;
import com.wg.wanggangapplication.model.response.FootBallDetailsBean;
import com.wg.wanggangapplication.model.response.GetIpInfoResponse;
import com.wg.wanggangapplication.net.HttpMethods;
import com.wg.wanggangapplication.net.ProgressSubscriber;
import com.wg.wanggangapplication.service.ApiService;
import com.wg.wanggangapplication.service.SubscriberOnNextListener;
import com.wg.wanggangapplication.utils.L;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author: wanggang2301@outlook.com
 * @Name：wanggang
 * @Description:
 * @Created on:2016/11/08
 */
public class FrameWorkAndMethodFragment extends Fragment {


    @BindView(R.id.retrofit)
    Button retrofit;
    @BindView(R.id.retrofit_result)
    TextView retrofitResult;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    @BindView(R.id.retrofitOkhttp)
    Button retrofitOkhttp;
    @BindView(R.id.retrofit_okhttp_result)
    TextView retrofitOkhttpResult;
    @BindView(R.id.btn_football_result)
    Button btnFootballResult;
    @BindView(R.id.football_result)
    TextView footballResult;
    @BindView(R.id.football_error)
    TextView footballError;


    //自定义的一个请求成功的接口OnNext
    private SubscriberOnNextListener getTopMovieOnNext;


    public FrameWorkAndMethodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frame_work_and_method, container, false);
        ButterKnife.bind(this, view);


        retrofit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestData();
            }
        });


        getTopMovieOnNext = new SubscriberOnNextListener<List<Subject>>() {
            @Override
            public void onNext(List<Subject> o) {

            }

            @Override
            public void onError() {

            }
        };


/*
        getTopMovieOnNext = new SubscriberOnNextListener<List<Subject>>() {
            @Override
            public void onNext(List<Subject> subjects) {
                retrofitOkhttpResult.setText(
                        subjects.get(0).getTitle() + "");
            }

        };*/

      /*  getFootBallDetailsOnNext = new SubscriberOnNextListener(List<Subject>) {
            @Override
            public void onNext(List<Subject> o) {

            }
        };*/


        retrofitOkhttp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMovie();
            }
        });

        btnFootballResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFootballDetails();
                //  startTimer();
            }
        });

        return view;
    }

    private static final String ENDPOINT = "http://m.13322.com";


    /**
     * retrofit请求方法
     * 一个针对Android和Java类型安全的http客户端
     */
    private void requestData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();


        ApiService apiService = retrofit.create(ApiService.class);


        apiService.getIpInfo("302001", "zh")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetIpInfoResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        progressBar.setVisibility(View.GONE);
                        retrofitResult.setText(e.getMessage());
                    }

                    @Override
                    public void onNext(GetIpInfoResponse getIpInfoResponse) {
                        retrofitResult.setText(getIpInfoResponse.getHomeTeamInfo().getName() + "");
                    }
                });

    }


    //进行网络请求
    private void getMovie() {

        /**
         * retrofit +Rxjava、RxAndroid
         * 获取全部对象
         * 在HttpMethods中封装RxAndroid
         * 有使用OkHttpClient
         */
       /* Subscriber subscriber = new Subscriber<MovieEntity>() {
            @Override
            public void onCompleted() {
                Toast.makeText(getActivity(), "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                retrofitOkhttpResult.setText(e.getMessage());
            }

            @Override
            public void onNext(MovieEntity movieEntity) {
                retrofitOkhttpResult.setText(movieEntity.getTitle() + "");
            }
        };

        HttpMethods.getInstance().getTopMovie2(subscriber, 0, 10);*/


        /**
         * retrofit+Rxjava、RxAndroid
         * 获取对象其中的list
         * 在HttpMethods中封装RxAndroid
         * 有使用OkHttpClient
         */
/*
        Subscriber subscriber = new Subscriber<List<Subject>>() {
            @Override
            public void onCompleted() {
                Toast.makeText(getActivity(), "Get Top Movie Completed", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError(Throwable e) {
                retrofitOkhttpResult.setText(e.getMessage());

            }

            @Override
            public void onNext(List<Subject> listHttpResult) {
                retrofitOkhttpResult.setText(listHttpResult.get(0).getTitle() + "");
            }
        };
        HttpMethods.getInstance().getTopMovie(subscriber, 0, 10);*/


        /**
         * 全部封装
         * 请求成功数据接口处理，共用一套错误处理代码
         * 一句话搞定
         * retrofit+Rxjava+OkHttp
         */
        // HttpMethods.getInstance().getTopMovie(new ProgressSubscriber(getTopMovieOnNext, getActivity()), 0, 10);


        HttpMethods.getInstance().getTopMovie(new ProgressSubscriber(new SubscriberOnNextListener<List<Subject>>() {

            @Override
            public void onNext(List<Subject> subjects) {
                retrofitOkhttpResult.setText(subjects.get(0).getTitle() + "");
            }

            @Override
            public void onError() {

            }
        }, getActivity()), 0, 10);

        /**
         * retrofit+Rxjava
         *
         * 没有封装Rxjava
         */

      /*  String baseUrl = "https://api.douban.com/v2/movie/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())  //添加这句代码sevice返回值不在是Call,而是一个Observable
                .build();

        MovieService movieService = retrofit.create(MovieService.class);

        movieService.getTopMoive2(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MovieEntity>() {
                    @Override
                    public void onCompleted() {
                        Toast.makeText(getActivity(), "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        retrofitOkhttpResult.setText(e.getMessage());
                    }

                    @Override
                    public void onNext(MovieEntity movieEntity) {
                        retrofitOkhttpResult.setText(movieEntity.getTitle() + "");

                    }
                });*/


        /**
         *
         * retrofit
         * Call
         */
     /*   String baseUrl = "https://api.douban.com/v2/movie/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())  //添加这句代码sevice返回值不在是Call,而是一个Observable
                .build();

        MovieService movieService = retrofit.create(MovieService.class);

        Call<MovieEntity> call = movieService.getTopMoive(0, 10);

        call.enqueue(new Callback<MovieEntity>() {
            @Override
            public void onResponse(Call<MovieEntity> call, Response<MovieEntity> response) {
                retrofitOkhttpResult.setText(response.body().getTitle() + "");
            }

            @Override
            public void onFailure(Call<MovieEntity> call, Throwable t) {
                retrofitOkhttpResult.setText(t.getMessage());
            }
        });*/
    }


    private Timer timer;
    private TimerTask timerTask;

    private int success = 0;
    private int error = 0;


    private void startTimer() {
        timer = new Timer();

        timerTask = new TimerTask() {
            @Override
            public void run() {
                L.i("wangg", "__________polling");

                getFootballDetails();
            }
        };

        timer.schedule(timerTask, 1000, 5000);
    }

    private void getFootballDetails() {
        HttpMethods.getInstance().getFootballDetailsData(new ProgressSubscriber(new SubscriberOnNextListener<FootBallDetailsBean>() {
            @Override
            public void onNext(FootBallDetailsBean footBallDetailsBean) {
                if ("200".equals(footBallDetailsBean.getResult())) {
                    //  footballResult.setText(footBallDetailsBean.getHomeTeamInfo().getName());
                    success++;
                    footballResult.setText(success + "");
                }
            }

            @Override
            public void onError() {
                error++;
                footballError.setText(error + "");
            }
        }, getActivity()), "zh", "8", "402944");
    }
}
