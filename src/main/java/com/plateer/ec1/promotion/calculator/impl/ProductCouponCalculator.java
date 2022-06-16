package com.plateer.ec1.promotion.calculator.impl;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.code.PromotionType;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponVO;
import org.springframework.stereotype.Component;

@Component
public class ProductCouponCalculator implements Calculator<ResponseProductCouponVO> {

    @Override
    public PromotionType getType() {
        return PromotionType.PRODUCT_COUPON;
    }

    @Override
    public Long calculateDcAmt(RequestPromotionVo request) {
        return null;
    }

    @Override
    public ResponseProductCouponVO getCalculationData(RequestPromotionVo request) {
        ResponseProductCouponVO result = new ResponseProductCouponVO();
        result.setProducCoupon("productCoupon");
        return result;
    }

    @Override
    public ResponseProductCouponVO calculateMaxBenefit(ResponseProductCouponVO responseProductCouponVO, RequestPromotionVo request) {
        return Calculator.super.calculateMaxBenefit(responseProductCouponVO, request);
    }
}
