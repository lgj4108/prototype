package com.plateer.ec1.payment.factory.service.impl;

import com.plateer.ec1.payment.dto.ApproveResVO;
import com.plateer.ec1.payment.dto.NetCancelReqVO;
import com.plateer.ec1.payment.dto.OriginalOrder;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.factory.service.PaymentService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Point implements PaymentService {
    @Override
    public ApproveResVO approvePay(PayInfo payInfo) {
        log.info("Point.approvePay : {}", payInfo);
        return null;
    }

    @Override
    public void cancelPay(OriginalOrder order) {
        log.info("Point.cancelPay : {}", order);
    }

    @Override
    public void netCancel(NetCancelReqVO netCancelReqVO) {
        log.info("Point.netCancel : {}", netCancelReqVO);
    }
}
