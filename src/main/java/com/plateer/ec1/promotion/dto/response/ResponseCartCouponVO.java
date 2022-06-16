package com.plateer.ec1.promotion.dto.response;

import com.plateer.ec1.promotion.dto.base.ResponseBaseVO;
import lombok.Data;

@Data
public class ResponseCartCouponVO extends ResponseBaseVO {
    private String cart;
}
