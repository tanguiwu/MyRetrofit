package com.example.myretrofit.bean;

import java.util.List;

public class SnslearnBean {

    /**
     * is_admin : 1
     * count : 1
     * data : [{"id":"9772","name":"js高级教程.txt","type":"1","public_flag":"0","public_time":"0","domain":"0","parent_id":"0","resource_type":"4","resource_id":"286949","face_md":"","user_id":"111402","org_type":"0","org_target_id":"111402","ctime":"1545912965","mtime":"1545912965","status":"0","public_end_time":"0","qrcode_md":"","format_mtime":"2018-12-27 20:16","format_ctime":"2018-12-27 20:16","size":"235B","before_format_size":"235","suffix":"txt","resource_md":"be87493e2beb407fe80b2f5ec279fcc5","download_url":"http://eagle.snslearn.com/interface/Resource/download?id=286949&directory_id=9772","upload_user_name":"土豆区域云管理员","icon":"","url":"","format_url":"","face":"","view_url":"http://eagle.snslearn.com/resource/Index/resourceView?resource_id=286949","resource_status":"3","filename":"js高级教程.txt","user_info":{"uid":"111402","email":"","login":"Tudo_areaadmin","nick":"土豆区域云管理员","nick_pinyin":"tudouquyuyunguanliyuan","card":"","idNumber":"","name":"土豆区域云管理员","pinyin":"tudouquyuyunguanliyuan","first_letter":"T","address":"","birthday":"1539878400","interesting":"","description":"","complete_telephone":"","telephone":"","logo_md":"046decb5e961f04998d832b9791b081a","qrcode_md":"ded31bc235e052184883976c0f3e0d06","type":"1","type_code":"","is_first_login":"0","is_modify_login":0,"intro":"","sex":"2","score":"0","status":0,"province_id":0,"city_id":0,"district_id":0,"node_id":113,"project_id":1065,"ctime":1539915789,"format_ctime":"2018-10-19 10:23:09","last_login_time":1563844387,"huanxin_name":"113_111402","webapp_url":"http://eagle.snslearn.com/index.php?app=webapp&mod=Index&act=homepage&user_id=111402","webapp_growth_url":"http://eagle.snslearn.com/teaching/UserWebapp/studentGrowth?user_id=111402","english_name":"tudouquyuyunguanliyuan","logo":"http://eagle.snslearn.com/md/046decb5e961f04998d832b9791b081a","qrcode":"http://eagle.snslearn.com/md/ded31bc235e052184883976c0f3e0d06","age":0,"url":"http://eagle.snslearn.com/index.php?app=center&mod=Teacher&act=homepage&user_id=111402"},"org_url":"http://eagle.snslearn.com/index.php?app=interface&mod=Resource&act=document&md=be87493e2beb407fe80b2f5ec279fcc5","share_user_count":1,"format_share_time":"2018-12-27 20:16","collect_flag":0}]
     * error_msg : 成功
     * error_code : 0
     */

    public int is_admin;
    public int count;
    public String error_msg;
    public String error_code;
    public List<DataBean> data;

    public static class DataBean {
        /**
         * id : 9772
         * name : js高级教程.txt
         * type : 1
         * public_flag : 0
         * public_time : 0
         * domain : 0
         * parent_id : 0
         * resource_type : 4
         * resource_id : 286949
         * face_md :
         * user_id : 111402
         * org_type : 0
         * org_target_id : 111402
         * ctime : 1545912965
         * mtime : 1545912965
         * status : 0
         * public_end_time : 0
         * qrcode_md :
         * format_mtime : 2018-12-27 20:16
         * format_ctime : 2018-12-27 20:16
         * size : 235B
         * before_format_size : 235
         * suffix : txt
         * resource_md : be87493e2beb407fe80b2f5ec279fcc5
         * download_url : http://eagle.snslearn.com/interface/Resource/download?id=286949&directory_id=9772
         * upload_user_name : 土豆区域云管理员
         * icon :
         * url :
         * format_url :
         * face :
         * view_url : http://eagle.snslearn.com/resource/Index/resourceView?resource_id=286949
         * resource_status : 3
         * filename : js高级教程.txt
         * user_info : {"uid":"111402","email":"","login":"Tudo_areaadmin","nick":"土豆区域云管理员","nick_pinyin":"tudouquyuyunguanliyuan","card":"","idNumber":"","name":"土豆区域云管理员","pinyin":"tudouquyuyunguanliyuan","first_letter":"T","address":"","birthday":"1539878400","interesting":"","description":"","complete_telephone":"","telephone":"","logo_md":"046decb5e961f04998d832b9791b081a","qrcode_md":"ded31bc235e052184883976c0f3e0d06","type":"1","type_code":"","is_first_login":"0","is_modify_login":0,"intro":"","sex":"2","score":"0","status":0,"province_id":0,"city_id":0,"district_id":0,"node_id":113,"project_id":1065,"ctime":1539915789,"format_ctime":"2018-10-19 10:23:09","last_login_time":1563844387,"huanxin_name":"113_111402","webapp_url":"http://eagle.snslearn.com/index.php?app=webapp&mod=Index&act=homepage&user_id=111402","webapp_growth_url":"http://eagle.snslearn.com/teaching/UserWebapp/studentGrowth?user_id=111402","english_name":"tudouquyuyunguanliyuan","logo":"http://eagle.snslearn.com/md/046decb5e961f04998d832b9791b081a","qrcode":"http://eagle.snslearn.com/md/ded31bc235e052184883976c0f3e0d06","age":0,"url":"http://eagle.snslearn.com/index.php?app=center&mod=Teacher&act=homepage&user_id=111402"}
         * org_url : http://eagle.snslearn.com/index.php?app=interface&mod=Resource&act=document&md=be87493e2beb407fe80b2f5ec279fcc5
         * share_user_count : 1
         * format_share_time : 2018-12-27 20:16
         * collect_flag : 0
         */

        public String id;
        public String name;
        public String type;
        public String public_flag;
        public String public_time;
        public String domain;
        public String parent_id;
        public String resource_type;
        public String resource_id;
        public String face_md;
        public String user_id;
        public String org_type;
        public String org_target_id;
        public String ctime;
        public String mtime;
        public String status;
        public String public_end_time;
        public String qrcode_md;
        public String format_mtime;
        public String format_ctime;
        public String size;
        public String before_format_size;
        public String suffix;
        public String resource_md;
        public String download_url;
        public String upload_user_name;
        public String icon;
        public String url;
        public String format_url;
        public String face;
        public String view_url;
        public String resource_status;
        public String filename;
        public UserInfoBean user_info;
        public String org_url;
        public int share_user_count;
        public String format_share_time;
        public int collect_flag;

        public static class UserInfoBean {
            /**
             * uid : 111402
             * email :
             * login : Tudo_areaadmin
             * nick : 土豆区域云管理员
             * nick_pinyin : tudouquyuyunguanliyuan
             * card :
             * idNumber :
             * name : 土豆区域云管理员
             * pinyin : tudouquyuyunguanliyuan
             * first_letter : T
             * address :
             * birthday : 1539878400
             * interesting :
             * description :
             * complete_telephone :
             * telephone :
             * logo_md : 046decb5e961f04998d832b9791b081a
             * qrcode_md : ded31bc235e052184883976c0f3e0d06
             * type : 1
             * type_code :
             * is_first_login : 0
             * is_modify_login : 0
             * intro :
             * sex : 2
             * score : 0
             * status : 0
             * province_id : 0
             * city_id : 0
             * district_id : 0
             * node_id : 113
             * project_id : 1065
             * ctime : 1539915789
             * format_ctime : 2018-10-19 10:23:09
             * last_login_time : 1563844387
             * huanxin_name : 113_111402
             * webapp_url : http://eagle.snslearn.com/index.php?app=webapp&mod=Index&act=homepage&user_id=111402
             * webapp_growth_url : http://eagle.snslearn.com/teaching/UserWebapp/studentGrowth?user_id=111402
             * english_name : tudouquyuyunguanliyuan
             * logo : http://eagle.snslearn.com/md/046decb5e961f04998d832b9791b081a
             * qrcode : http://eagle.snslearn.com/md/ded31bc235e052184883976c0f3e0d06
             * age : 0
             * url : http://eagle.snslearn.com/index.php?app=center&mod=Teacher&act=homepage&user_id=111402
             */

            public String uid;
            public String email;
            public String login;
            public String nick;
            public String nick_pinyin;
            public String card;
            public String idNumber;
            public String name;
            public String pinyin;
            public String first_letter;
            public String address;
            public String birthday;
            public String interesting;
            public String description;
            public String complete_telephone;
            public String telephone;
            public String logo_md;
            public String qrcode_md;
            public String type;
            public String type_code;
            public String is_first_login;
            public int is_modify_login;
            public String intro;
            public String sex;
            public String score;
            public int status;
            public int province_id;
            public int city_id;
            public int district_id;
            public int node_id;
            public int project_id;
            public int ctime;
            public String format_ctime;
            public int last_login_time;
            public String huanxin_name;
            public String webapp_url;
            public String webapp_growth_url;
            public String english_name;
            public String logo;
            public String qrcode;
            public int age;
            public String url;

            @Override
            public String toString() {
                return "UserInfoBean{" +
                        "uid='" + uid + '\'' +
                        ", email='" + email + '\'' +
                        ", login='" + login + '\'' +
                        ", nick='" + nick + '\'' +
                        ", nick_pinyin='" + nick_pinyin + '\'' +
                        ", card='" + card + '\'' +
                        ", idNumber='" + idNumber + '\'' +
                        ", name='" + name + '\'' +
                        ", pinyin='" + pinyin + '\'' +
                        ", first_letter='" + first_letter + '\'' +
                        ", address='" + address + '\'' +
                        ", birthday='" + birthday + '\'' +
                        ", interesting='" + interesting + '\'' +
                        ", description='" + description + '\'' +
                        ", complete_telephone='" + complete_telephone + '\'' +
                        ", telephone='" + telephone + '\'' +
                        ", logo_md='" + logo_md + '\'' +
                        ", qrcode_md='" + qrcode_md + '\'' +
                        ", type='" + type + '\'' +
                        ", type_code='" + type_code + '\'' +
                        ", is_first_login='" + is_first_login + '\'' +
                        ", is_modify_login=" + is_modify_login +
                        ", intro='" + intro + '\'' +
                        ", sex='" + sex + '\'' +
                        ", score='" + score + '\'' +
                        ", status=" + status +
                        ", province_id=" + province_id +
                        ", city_id=" + city_id +
                        ", district_id=" + district_id +
                        ", node_id=" + node_id +
                        ", project_id=" + project_id +
                        ", ctime=" + ctime +
                        ", format_ctime='" + format_ctime + '\'' +
                        ", last_login_time=" + last_login_time +
                        ", huanxin_name='" + huanxin_name + '\'' +
                        ", webapp_url='" + webapp_url + '\'' +
                        ", webapp_growth_url='" + webapp_growth_url + '\'' +
                        ", english_name='" + english_name + '\'' +
                        ", logo='" + logo + '\'' +
                        ", qrcode='" + qrcode + '\'' +
                        ", age=" + age +
                        ", url='" + url + '\'' +
                        '}';
            }
        }


        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", public_flag='" + public_flag + '\'' +
                    ", public_time='" + public_time + '\'' +
                    ", domain='" + domain + '\'' +
                    ", parent_id='" + parent_id + '\'' +
                    ", resource_type='" + resource_type + '\'' +
                    ", resource_id='" + resource_id + '\'' +
                    ", face_md='" + face_md + '\'' +
                    ", user_id='" + user_id + '\'' +
                    ", org_type='" + org_type + '\'' +
                    ", org_target_id='" + org_target_id + '\'' +
                    ", ctime='" + ctime + '\'' +
                    ", mtime='" + mtime + '\'' +
                    ", status='" + status + '\'' +
                    ", public_end_time='" + public_end_time + '\'' +
                    ", qrcode_md='" + qrcode_md + '\'' +
                    ", format_mtime='" + format_mtime + '\'' +
                    ", format_ctime='" + format_ctime + '\'' +
                    ", size='" + size + '\'' +
                    ", before_format_size='" + before_format_size + '\'' +
                    ", suffix='" + suffix + '\'' +
                    ", resource_md='" + resource_md + '\'' +
                    ", download_url='" + download_url + '\'' +
                    ", upload_user_name='" + upload_user_name + '\'' +
                    ", icon='" + icon + '\'' +
                    ", url='" + url + '\'' +
                    ", format_url='" + format_url + '\'' +
                    ", face='" + face + '\'' +
                    ", view_url='" + view_url + '\'' +
                    ", resource_status='" + resource_status + '\'' +
                    ", filename='" + filename + '\'' +
                    ", user_info=" + user_info +
                    ", org_url='" + org_url + '\'' +
                    ", share_user_count=" + share_user_count +
                    ", format_share_time='" + format_share_time + '\'' +
                    ", collect_flag=" + collect_flag +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "SnslearnBean{" +
                "is_admin=" + is_admin +
                ", count=" + count +
                ", error_msg='" + error_msg + '\'' +
                ", error_code='" + error_code + '\'' +
                ", data=" + data +
                '}';
    }
}
