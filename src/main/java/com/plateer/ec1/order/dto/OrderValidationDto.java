package com.plateer.ec1.order.dto;

import java.util.List;

public class OrderValidationDto {
    private OrderRequest request;
    private List<OrderProductView> product;

    public OrderValidationDto(OrderRequest request, List<OrderProductView> product) {
        this.request = request;
        this.product = product;
    }
}
