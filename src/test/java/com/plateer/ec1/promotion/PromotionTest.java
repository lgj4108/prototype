package com.plateer.ec1.promotion;

import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponVO;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDcVO;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponVO;
import com.plateer.ec1.promotion.service.PromotionService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PromotionTest {
    @Autowired
    PromotionService promotionService;

    @Test
    void promotionTest() {
        RequestPromotionVo request = new RequestPromotionVo();
        ResponseCartCouponVO cart = promotionService.getCartCouponApplyData(request);
        log.info("cart : {}", cart);
        ResponseProductCouponVO product = promotionService.getProductCouponApplyData(request);
        log.info("product : {}", product);
        ResponsePriceDcVO price = promotionService.getPriceDiscountApplyData(request);
        log.info("price : {}", price);
    }
}
