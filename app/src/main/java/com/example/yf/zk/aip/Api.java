package com.example.yf.zk.aip;

public class Api {
      /*
      * 开发环境
      * */
    //public static final String BASE_URL="http://172.17.8.100";
    /*http://172.17.8.100/small/commodity/v1/commodityList
    * 测试环境
    * */
    public static final String BASE_URL="http://172.17.8.100";
    //首页商品信息列表
    public static String SHOPLIST=BASE_URL+"/small/commodity/v1/commodityList";
    //登录接口
    public static String LOGIN=BASE_URL+"http://www.zhaoapi.cn/home/getHome";
    public static String XBannerUrl=BASE_URL+"http://www.zhaoapi.cn/product/getProductDetail?pid=21";



}
