package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.code.PromotionType;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.base.ResponseBaseVO;

public interface Calculator <T extends ResponseBaseVO> {
    PromotionType getType();
    Long calculateDcAmt(RequestPromotionVo request);
    T getCalculationData(RequestPromotionVo request);
    default T calculateMaxBenefit(T t, RequestPromotionVo request) {
        return t;
    }
}
