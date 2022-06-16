package com.plateer.ec1.promotion.dao;


import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import org.springframework.stereotype.Repository;

@Repository
public class PromotionDao {
    public Promotion getPromotionData(RequestPromotionVo vo) {
        
        return new Promotion();
    }
}
