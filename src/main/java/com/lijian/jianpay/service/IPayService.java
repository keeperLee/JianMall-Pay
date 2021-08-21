package com.lijian.jianpay.service;

import java.math.BigDecimal;

public interface IPayService {

    /**
     * 发起支付
     */
    public void create(String orderId, BigDecimal amount);
}
