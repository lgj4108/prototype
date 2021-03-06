package com.plateer.ec1.order.context;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.history.OrderHistoryService;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataCreateStrategy;
import com.plateer.ec1.order.validation.OrderValidator;
import com.plateer.ec1.payment.PayService;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.UUID;

@Slf4j
public class OrderContext {
    private OrderHistoryService historyService;
    private PayService payService;
    private OrderRepository orderRepository;

    public OrderContext(OrderHistoryService historyService, PayService payService, OrderRepository orderRepository) {
        this.historyService = historyService;
        this.payService = payService;
        this.orderRepository = orderRepository;
    }

    public void excute(DataCreateStrategy create, AfterStrategy after, OrderRequest request) {
        log.info("OrderContext.excute: {}", UUID.randomUUID().toString().substring(0,7));
        Long historyNo = historyService.insertOrderHistory(request);
        OrderDto dto = null;
        try {
            // validation
            OrderValidator.get(request).test(new OrderValidationDto(request, Arrays.asList(new OrderProductView())));

            // 데이터 생성
            dto = create.create(request, Arrays.asList(new OrderProductView()));

            // 주문 데이터 입력
            insertOrderData(dto);

            // 결제 처리
            payService.approvePay(request.getPayInfo());

            // 금액검증
            amountValidation(request.getOrderNo());

            // 후처리
            after.call(request, dto);
        } catch (Exception ex) {
            log.info("error: {}", ex);
        } finally {
            historyService.updateOrderHistory(historyNo, dto);
        }
    }

    private void insertOrderData(OrderDto dto) {
        log.info("OrderContext.insertOrderData request: {}", dto);
        orderRepository.insertOrderBase(dto);
        orderRepository.insertOrderProduct(dto);
        orderRepository.insertOrderClaim(dto);

    }

    private void amountValidation(String orderNo) {
        log.info("OrderContext.amountValidation request: {}", orderNo);
    }
}
