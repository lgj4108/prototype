package com.plateer.ec1.payment;

import com.plateer.ec1.payment.dto.PaymentDto;
import com.plateer.ec1.payment.dto.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentService {
    public PaymentDto pay(PaymentRequest request) {
        log.info("payment request : {}", request);
        return new PaymentDto();
    }
}
