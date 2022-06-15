package com.plateer.ec1.order;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.service.OrderService;
import com.plateer.ec1.payment.dto.PayInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderTest {
    @Autowired
    OrderService orderService;

    @Test
    public void foGeneralOrder() {
        PayInfo payInfo = new PayInfo();
        payInfo.setType("inicis");
        payInfo.setPayRequest("request");

        OrderRequest request = new OrderRequest();
        request.setOrderNo("O20220615");
        request.setSystemType("FO");
        request.setOrderType("general");
        request.setPayInfo(payInfo);

        orderService.order(request);
    }

    @Test
    public void boGeneralOrder() {
        PayInfo payInfo = new PayInfo();
        payInfo.setType("point");
        payInfo.setPayRequest("request");

        OrderRequest request = new OrderRequest();
        request.setOrderNo("O20220615");
        request.setSystemType("BO");
        request.setOrderType("general");
        request.setPayInfo(payInfo);

        orderService.order(request);
    }

    @Test
    public void foEcouponOrder() {
        OrderRequest request = new OrderRequest();
        request.setOrderNo("O20220615");
        request.setSystemType("FO");
        request.setOrderType("ecoupon");
        orderService.order(request);
    }

    @Test
    public void BoEcouponOrder() {
        OrderRequest request = new OrderRequest();
        request.setOrderNo("O20220615");
        request.setSystemType("BO");
        request.setOrderType("ecoupon");
        orderService.order(request);
    }
}
