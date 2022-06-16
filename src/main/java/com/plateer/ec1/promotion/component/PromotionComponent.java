package com.plateer.ec1.promotion.component;

import com.plateer.ec1.promotion.dao.PromotionDao;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PromotionComponent {

    private final PromotionDao promotionDao;

    public Promotion getAvailablePromotionData(RequestPromotionVo request) {

        return promotionDao.getPromotionData(request);
    }
}
