package com.plateer.ec1.promotion.service.impl;

import com.plateer.ec1.promotion.calculator.factory.CalculatorFactory;
import com.plateer.ec1.promotion.code.PromotionType;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponVO;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDcVO;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponVO;
import com.plateer.ec1.promotion.service.PromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromotionServiceImpl implements PromotionService {

    private final CalculatorFactory calculatorFactory;

    @Override
    public ResponsePriceDcVO getPriceDiscountApplyData(RequestPromotionVo request) {
        return (ResponsePriceDcVO) calculatorFactory.getPromotionCalculator(PromotionType.PRICE_DISCOUNT).getCalculationData(request);
    }

    @Override
    public ResponseProductCouponVO getProductCouponApplyData(RequestPromotionVo request) {
        return (ResponseProductCouponVO) calculatorFactory.getPromotionCalculator(PromotionType.PRODUCT_COUPON).getCalculationData(request);
    }

    @Override
    public ResponseCartCouponVO getCartCouponApplyData(RequestPromotionVo request) {
        return (ResponseCartCouponVO) calculatorFactory.getPromotionCalculator(PromotionType.CART_COUPON).getCalculationData(request);
    }
}
