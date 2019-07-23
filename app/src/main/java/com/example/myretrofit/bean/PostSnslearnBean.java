package com.example.myretrofit.bean;

public class PostSnslearnBean {


    /**
     * data : {"name":"shareTo我的视频123"}
     * error_msg : 成功
     * error_code : 0
     */

    public DataBean data;
    public String error_msg;
    public String error_code;

    public static class DataBean {
        /**
         * name : shareTo我的视频123
         */

        public String name;

        @Override
        public String toString() {
            return "DataBean{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PostSnslearnBean{" +
                "data=" + data +
                ", error_msg='" + error_msg + '\'' +
                ", error_code='" + error_code + '\'' +
                '}';
    }
}
