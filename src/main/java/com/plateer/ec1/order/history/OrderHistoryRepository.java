package com.plateer.ec1.order.history;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrderHistoryRepository {
    public Long insertOrderHistory(OrderRequest request) {
        log.info("OrderHistoryRepository.insertOrderHistory request: {}", request);
        return Double.valueOf(Math.random()).longValue();
    }

    public void updateOrderHistory(Long historyNo, OrderDto dto) {
        log.info("OrderHistoryRepository.updateOrderHistory request: {}, {}", historyNo, dto);
    }
}
