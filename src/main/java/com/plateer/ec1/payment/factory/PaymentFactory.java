package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.factory.service.PaymentService;
import com.plateer.ec1.payment.factory.service.impl.Inicis;
import com.plateer.ec1.payment.factory.service.impl.Point;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Slf4j
public class PaymentFactory {
    private Map<String, PaymentService> paymentServiceMap = new LinkedHashMap<>();

    public PaymentFactory() {
        paymentServiceMap.put("point", new Point());
        paymentServiceMap.put("inicis", new Inicis());
    }

    public PaymentService getPaymentService(String type) {
        log.info("PaymentFactory.getPaymentService : {}", type);
        return paymentServiceMap.get(type);
    }
}
