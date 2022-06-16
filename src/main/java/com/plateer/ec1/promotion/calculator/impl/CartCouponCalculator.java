package com.plateer.ec1.promotion.calculator.impl;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.code.PromotionType;
import com.plateer.ec1.promotion.component.PromotionComponent;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CartCouponCalculator implements Calculator<ResponseCartCouponVO> {

    private final PromotionComponent promotionComponent;

    @Override
    public PromotionType getType() {
        return PromotionType.CART_COUPON;
    }

    @Override
    public Long calculateDcAmt(RequestPromotionVo request) {
        return null;
    }

    @Override
    public ResponseCartCouponVO getCalculationData(RequestPromotionVo request) {
        promotionComponent.getAvailablePromotionData(request);
        ResponseCartCouponVO result = new ResponseCartCouponVO();
        result.setCart("cart");
        return result;
    }

    @Override
    public ResponseCartCouponVO calculateMaxBenefit(ResponseCartCouponVO responseCartCouponVO, RequestPromotionVo request) {
        return Calculator.super.calculateMaxBenefit(responseCartCouponVO, request);
    }
}
