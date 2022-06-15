package com.plateer.ec1.payment.factory.service;

import com.plateer.ec1.payment.dto.ApproveResVO;
import com.plateer.ec1.payment.dto.NetCancelReqVO;
import com.plateer.ec1.payment.dto.OriginalOrder;
import com.plateer.ec1.payment.dto.PayInfo;

public interface PaymentService {
    default void validateAuth(PayInfo payInfo) {}
    ApproveResVO approvePay(PayInfo payInfo);
    void cancelPay(OriginalOrder order);
    void netCancel(NetCancelReqVO netCancelReqVO);
}
