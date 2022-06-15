package com.plateer.ec1.order.dto;

import lombok.Data;

@Data
public class OrderRequest {
    private String orderNo;
    private String systemType;
    private String orderType;
}
