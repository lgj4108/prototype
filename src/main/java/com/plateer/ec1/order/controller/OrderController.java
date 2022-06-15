package com.plateer.ec1.order.controller;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService orderService;


    @GetMapping("/order")
    public ResponseEntity<String> order(@RequestParam String orderNo, String systemCode, String orderType) {
        log.info("OrderController.order  start ===> {}, {}, {}", orderNo, systemCode, orderType);
        OrderRequest request = new OrderRequest();
        request.setOrderNo(orderNo);
        request.setSystemType(systemCode);
        request.setOrderType(orderType);

        log.info("OrderController ===> {}", request);
        orderService.order(request);
        return new ResponseEntity<>("test", HttpStatus.OK);
    }
}
