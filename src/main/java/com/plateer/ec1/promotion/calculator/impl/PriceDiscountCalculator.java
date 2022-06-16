package com.plateer.ec1.promotion.calculator.impl;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.code.PromotionType;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.base.ResponseBaseVO;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDcVO;
import org.springframework.stereotype.Component;

@Component
public class PriceDiscountCalculator implements Calculator<ResponsePriceDcVO> {
    @Override
    public PromotionType getType() {
        return PromotionType.PRICE_DISCOUNT;
    }

    @Override
    public Long calculateDcAmt(RequestPromotionVo request) {
        return null;
    }

    @Override
    public ResponsePriceDcVO getCalculationData(RequestPromotionVo request) {
        ResponsePriceDcVO result = new ResponsePriceDcVO();
        result.setPriceDc("price");
        return result;
    }
}
