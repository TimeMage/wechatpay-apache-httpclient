package com.wechat.pay.contrib.apache.httpclient.auth;

import com.wechat.pay.contrib.apache.httpclient.Validator;

import org.apache.http.client.methods.CloseableHttpResponse;

public class ValidatorTrue implements Validator {

    @Override
    public boolean validate(CloseableHttpResponse response) {
        return true;
    }
}
