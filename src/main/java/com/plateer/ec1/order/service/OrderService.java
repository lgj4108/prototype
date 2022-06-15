package com.plateer.ec1.order.service;

import com.plateer.ec1.order.context.OrderContext;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.history.OrderHistoryService;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.after.impl.BoAfterStrategy;
import com.plateer.ec1.order.strategy.after.impl.FoAfterStrategy;
import com.plateer.ec1.order.strategy.data.DataCreateStrategy;
import com.plateer.ec1.order.strategy.data.impl.EcouponDataCreateStrategy;
import com.plateer.ec1.order.strategy.data.impl.GeneralDataCreateStrategy;
import com.plateer.ec1.payment.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final OrderHistoryService historyService;
    private final PaymentService paymentService;
    private final OrderRepository orderRepository;

    public void order(OrderRequest orderRequest) {
        log.info("OrderService.order request: {}", orderRequest);
        OrderContext context = new OrderContext(historyService, paymentService, orderRepository);
        context.excute(getDataStrategy(orderRequest), getAfterStrategy(orderRequest), orderRequest);
    }

    private DataCreateStrategy getDataStrategy(OrderRequest request) {
        log.info("OrderService.getDataStrategy request: {}", request);
        DataCreateStrategy strategy = null;
        if("general".equals(request.getOrderType())) {
            strategy = new GeneralDataCreateStrategy();
        } else if ("ecoupon".equals(request.getOrderType())) {
            strategy = new EcouponDataCreateStrategy();
        }

        return strategy;
    }

    private AfterStrategy getAfterStrategy(OrderRequest request) {
        log.info("OrderService.getAfterStrategy request: {}", request);
        AfterStrategy strategy = null;
        if("FO".equals(request.getSystemType())) {
            strategy = new FoAfterStrategy();
        } else if ("BO".equals(request.getSystemType())) {
            strategy = new BoAfterStrategy();
        }

        return strategy;
    }
}
