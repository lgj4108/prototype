package com.plateer.ec1.order.strategy.data;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;

import java.util.List;

public interface DataCreateStrategy {
    OrderDto create(OrderRequest request, List<OrderProductView> productView);
}
