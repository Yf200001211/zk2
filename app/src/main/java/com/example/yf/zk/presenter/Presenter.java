package com.example.yf.zk.presenter;

import com.example.yf.zk.fragment.HomeFragnent;

public class Presenter implements IPresenter {
    private final HomeFragnent homeFrangmen;
    private final Object HomeModel;

    public  Presenter(HomeFragnent homeFrangmen){
        this.homeFrangmen = homeFrangmen;
        HomeModel = new HomeModel();
    }
    public void getPersenterData() {

    }

    private class HomeModel {
    }
}
