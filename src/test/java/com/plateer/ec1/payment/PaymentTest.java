package com.plateer.ec1.payment;

import com.plateer.ec1.payment.dto.CancelReqVO;
import com.plateer.ec1.payment.dto.OriginalOrder;
import com.plateer.ec1.payment.dto.PayInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentTest {
    @Autowired
    private PayService service;

    @Test
    public void approvePoint() {
        PayInfo payInfo = new PayInfo();
        payInfo.setType("point");
        payInfo.setPayRequest("request");
        service.approvePay(payInfo);
    }

    @Test
    public void approveInicis() {
        PayInfo payInfo = new PayInfo();
        payInfo.setType("inicis");
        payInfo.setPayRequest("request");
        service.approvePay(payInfo);
    }

    @Test
    public void cancelPoint() {
        CancelReqVO reqVO = new CancelReqVO();
        reqVO.setType("point");
        reqVO.setOrder(new OriginalOrder());
        service.cancel(reqVO);
    }

    @Test
    public void cancelInicis() {
        CancelReqVO reqVO = new CancelReqVO();
        reqVO.setType("inicis");
        reqVO.setOrder(new OriginalOrder());
        service.cancel(reqVO);
    }

    @Test
    public void netCancelPoint() {
//        service.approvePay()
    }

    @Test
    public void netCancelInicis() {
//        service.approvePay()
    }
}
