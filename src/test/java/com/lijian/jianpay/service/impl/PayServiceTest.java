package com.lijian.jianpay.service.impl;

import com.lijian.jianpay.JianpayApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PayServiceTest extends JianpayApplicationTests {


    @Autowired
    private PayService payService;

    @Test
    public void create() {
        payService.create("34324241324123423", BigDecimal.valueOf(0.01));

    }
}
