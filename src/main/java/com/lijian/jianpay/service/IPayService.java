package com.lijian.jianpay.service;

import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

public interface IPayService {

    /**
     * 发起支付
     */
    public PayResponse create(String orderId, BigDecimal amount);


    /**
     * 异步通知
     */
    public String asyncNotify(String notifyData);

}
