package com.plateer.ec1.payment;

import com.plateer.ec1.payment.dto.*;
import com.plateer.ec1.payment.factory.PaymentFactory;
import com.plateer.ec1.payment.factory.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PayService {

    private final PaymentFactory paymentFactory;

    public ApproveResVO approvePay(PayInfo payInfo) {
        log.info("PayService.approvePay : {}", payInfo);
        PaymentService service = paymentFactory.getPaymentService(payInfo.getType());
        service.validateAuth(payInfo);
        return service.approvePay(payInfo);
    }

    public void cancel(CancelReqVO reqVO) {
        log.info("PayService.cancel : {}", reqVO);
        paymentFactory.getPaymentService(reqVO.getType()).cancelPay(reqVO.getOrder());
    }

    public void netCancel(NetCancelReqVO netCancelReqVO) {
        log.info("PayService.netCancel : {}", netCancelReqVO);
        paymentFactory.getPaymentService(netCancelReqVO.getType()).netCancel(netCancelReqVO);
    }
}
