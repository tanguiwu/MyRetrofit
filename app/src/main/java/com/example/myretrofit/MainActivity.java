package com.example.myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myretrofit.bean.PostSnslearnBean;
import com.example.myretrofit.bean.SnslearnBean;
import com.example.myretrofit.inter.IGetRequestDataInterface;
import com.example.myretrofit.inter.IPostRequestDataInterface;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btRequestSnslearn, btPostData;

    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRequestSnslearn = findViewById(R.id.bt_request_data);
        btPostData = findViewById(R.id.bt_post_request_data);

        btRequestSnslearn.setOnClickListener(this);
        btPostData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        if (viewId == R.id.bt_request_data) {
            //1. 传统方式：Call<..>接口形式
            requestData();
            //2. RxJava 方式：Observable<..>接口形式
            requestRxJavaData();
        } else if (viewId == R.id.bt_post_request_data) {
            //post 请求
            postData();
        }
    }


    private void postData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://eagle.snslearn.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        // 创建网络请求接口的实例
        IPostRequestDataInterface mApi = retrofit.create(IPostRequestDataInterface.class);

        Call<PostSnslearnBean> call = mApi.getCall("10018", "我使用retrofit重命名", "MzM1MjYyMWE0NjMyZTFkOWQ5YzVkMTYyODJmOTFjZDk");

        call.enqueue(new Callback<PostSnslearnBean>() {
            @Override
            public void onResponse(Call<PostSnslearnBean> call, Response<PostSnslearnBean> response) {
                PostSnslearnBean snslearnBean = response.body();
                Log.d("tgw2", "onResponse: " + snslearnBean.toString());
            }

            @Override
            public void onFailure(Call<PostSnslearnBean> call, Throwable t) {
                Log.d("tgw2", "onFailure:失败 ");
            }
        });


    }

    private void requestData() {

        /**
         * 创建Retrofit实例时需要通过Retrofit.Builder,并调用baseUrl方法设置URL。
         * Retrofit2的baseUlr 必须以 /（斜线）结束，不然会抛出一个IllegalArgumentException
         */
        retrofit = new Retrofit.Builder()
                .baseUrl("http://eagle.snslearn.com/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();

        /**
         * 创建网络请求接口的实例
         * 拿到代理对象 自己创建的接口
         */
        IGetRequestDataInterface request = retrofit.create(IGetRequestDataInterface.class);

        // 封装请求
        Call<SnslearnBean> call = request.getCall("interface", "Directory",
                "getDirectoryList", "0", "YTA3ZjI2NGM0MDRhNDk1OGZkN2YzZDhjOTBmMzFlNDQ");

        // 发送网络请求(异步)
        call.enqueue(new Callback<SnslearnBean>() {
            @Override
            public void onResponse(Call<SnslearnBean> call, Response<SnslearnBean> response) {
                SnslearnBean snslearnBean = response.body();
                Log.d("tgw1", "onResponse: " + snslearnBean.toString());


//如果Call<SnslearnBean> 中的参数为 :---ResponseBody  采用下面方法获取，它的返回值与okhttp3 一样
//                try {
//                    Log.d("tgw1", "onResponse: "+response.body().string());
//                    Gson gson = new Gson();
//                    SnslearnBean snslearnBean = gson.fromJson(response.body().string(),SnslearnBean.class);
//                    Log.d("tgw2", "onResponse: "+snslearnBean.data.get(0).id);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
            }

            @Override
            public void onFailure(Call<SnslearnBean> call, Throwable t) {
                Log.d("tgw1", "onFailure:失败 ");
            }
        });
    }

    private void requestRxJavaData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://eagle.snslearn.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        IGetRequestDataInterface request = retrofit.create(IGetRequestDataInterface.class);

        // 封装请求
        // 2. 采用Observable<...>形式对网络请求进行封装
        Observable<SnslearnBean> observable =  request.getRxJavaCall();

        // 3. 发送网络请求(异步)
        observable.subscribeOn(Schedulers.io())               // 在IO线程进行网络请求
                .observeOn(AndroidSchedulers.mainThread())  // 回到主线程 处理请求结果
                .subscribe(new Observer<SnslearnBean>() {
                    // 发送请求后调用该复写方法（无论请求成功与否）
                    @Override
                    public void onSubscribe(Disposable d) {
                        // 初始化工作
                        Log.d("tgwrxjava", "初始化工作");
                    }

                    @Override
                    public void onNext(SnslearnBean snslearnBean) {
                        Log.d("tgwrxjava", "结果"+snslearnBean.toString());
                    }

                    // 发送请求成功后，先调用onNext（）再调用该复写方法
                    @Override
                    public void onComplete() {
                        Log.d("tgwrxjava", "请求成功");
                    }

                    // 发送请求失败后调用该复写方法
                    @Override
                    public void onError(Throwable e) {
                        Log.d("tgwrxjava", "请求失败");
                    }
                });


    }
}
