package com.example.myretrofit.inter;



import com.example.myretrofit.bean.SnslearnBean;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IGetRequestDataInterface {
    // 注解里传入网络请求的部分URL地址
    // 其中返回类型为Call<News>，News是接收数据的类（即上面定义的News类）
    // 如果想直接获得Responsebody中的内容，可以定义网络请求返回值为Call<ResponseBody>

    //1.直接将地址放上去
    //@GET("index.php?app=interface&mod=Directory&act=getDirectoryList&parent_id=0&token=YTA3ZjI2NGM0MDRhNDk1OGZkN2YzZDhjOTBmMzFlNDQ")


    //2.采用拼接的方式将参数拼出来  @Path("app")String app,
    // 使用path拼接出来的没有连接符：比如（&,? ）等
    // @Query("app") String app  相当于自己添加了个 （？，&） 变为：(?app)的形式   注：与上面的长地址对比一下就知道了
    //@GET("index.php")
    @GET(" ") //注意这里与上行比较它中间是个空格但是可以请求数据
    // getCall()是接受网络请求数据的方法
    Call<SnslearnBean> getCall(@Query("app") String app, @Query("mod") String mod, @Query("act") String act, @Query("parent_id") String parent_id, @Query("token") String token);




    //3. rxjava  结合方式
    @GET("index.php?app=interface&mod=Directory&act=getDirectoryList&parent_id=0&token=YTA3ZjI2NGM0MDRhNDk1OGZkN2YzZDhjOTBmMzFlNDQ")
    Observable<SnslearnBean> getRxJavaCall();



}
