package com.plateer.ec1.promotion.dto.response;

import com.plateer.ec1.promotion.dto.ProductCouponVo;
import com.plateer.ec1.promotion.dto.base.ResponseBaseVO;
import lombok.Data;

import java.util.List;

@Data
public class ResponseProductCouponVO extends ResponseBaseVO {
    private String producCoupon;
//    private List<ProductCouponVo> productCouponVoList;
}
