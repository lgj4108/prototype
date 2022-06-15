package com.plateer.ec1.order.strategy.after.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FoAfterStrategy implements AfterStrategy {
    @Override
    public void call(OrderRequest request, OrderDto dto) {
        log.info("fo after strategy : {}, {}", request, dto);
    }
}
