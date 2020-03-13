package com.mpush.api.service;
/**定义服务端启动状态接口，定义服务启动事件*/
public interface Listener {
    void onSuccess(Object... args);

    void onFailure(Throwable cause);
}