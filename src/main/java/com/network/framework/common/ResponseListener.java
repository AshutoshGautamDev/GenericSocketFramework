package com.network.framework.common;
public interface ResponseListener
{
public void onError(String error);
public void onException(Throwable throwable);
public void onResponse(Object object);
}
