package com.example.yf.zk.model;

public interface IModel {
    void getData(String url,ModelIntetface modelintetface);

    interface ModelIntetface {
        void success(String data);
        void Failed();
    }
}
