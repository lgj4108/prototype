package com.plateer.ec1.payment.dto;

import lombok.Data;

@Data
public class CancelReqVO {
    private String type;
    private OriginalOrder order;
}
