package com.plateer.ec1.payment.factory.service.impl;

import com.plateer.ec1.payment.dto.ApproveResVO;
import com.plateer.ec1.payment.dto.NetCancelReqVO;
import com.plateer.ec1.payment.dto.OriginalOrder;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.factory.service.PaymentService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Inicis implements PaymentService {
    @Override
    public void validateAuth(PayInfo payInfo) {
        log.info("Inicis.validateAuth : {}", payInfo);
    }

    @Override
    public ApproveResVO approvePay(PayInfo payInfo) {
        log.info("Inicis.approvePay : {}", payInfo);
        return null;
    }

    @Override
    public void cancelPay(OriginalOrder order) {
        log.info("Inicis.cancelPay : {}", order);
    }

    @Override
    public void netCancel(NetCancelReqVO netCancelReqVO) {
        log.info("Inicis.netCancel : {}", netCancelReqVO);
    }
}
