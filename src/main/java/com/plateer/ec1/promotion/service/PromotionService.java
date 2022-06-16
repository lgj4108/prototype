package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponVO;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDcVO;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponVO;

public interface PromotionService {

    ResponsePriceDcVO getPriceDiscountApplyData(RequestPromotionVo request);

    ResponseProductCouponVO getProductCouponApplyData(RequestPromotionVo request);

    ResponseCartCouponVO getCartCouponApplyData(RequestPromotionVo request);
}
