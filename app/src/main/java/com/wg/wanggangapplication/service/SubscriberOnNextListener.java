package com.wg.wanggangapplication.service;

/**
 * 描述:  ${TODO}
 * 作者:  wangg@13322.com
 * 时间:  2016/7/27 16:54
 */
public interface SubscriberOnNextListener<T> {
    void onNext(T t);

    void onError();
}
