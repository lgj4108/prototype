package com.plateer.ec1.order.strategy.data.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.strategy.data.DataCreateStrategy;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class EcouponDataCreateStrategy implements DataCreateStrategy {
    @Override
    public OrderDto create(OrderRequest request, List<OrderProductView> productView) {
        log.info("EcouponDataCreateStrategy : {}, {}", request, productView);
        return new OrderDto();
    }
}
