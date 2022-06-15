package com.plateer.ec1.order.validation;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;

import java.util.Arrays;
import java.util.function.Predicate;

public enum OrderValidator implements Predicate<OrderValidationDto> {
    FO_GENERAL("FO","general", OrderCommonValidator.commonValidator
            .and(OrderProductValidator.aaa)),
    BO_GENERAL("BO", "general", OrderCommonValidator.commonValidator
            .and(OrderProductValidator.aaa)
            .and(OrderSystemValidator.isAbleBoOrder)),
    FO_ECOUPON("FO", "ecoupon", OrderCommonValidator.commonValidator
            .and(OrderProductValidator.aaa)
            .and(OrderTypeValidator.isAbleEcouponOrder)),
    BO_ECOUPON("BO", "ecoupon", OrderCommonValidator.commonValidator
            .and(OrderProductValidator.aaa)
            .and(OrderTypeValidator.isAbleEcouponOrder)
            .and(OrderSystemValidator.isAbleBoOrder)),
    ;

    private String systemType;
    private String orderType;
    private Predicate<OrderValidationDto> predicate;

    OrderValidator(String systemType, String orderType, Predicate<OrderValidationDto> predicate) {
        this.systemType = systemType;
        this.orderType = orderType;
        this.predicate = predicate;
    }

    public boolean test(OrderValidationDto s) {
        return predicate.test(s);
    }

    public static OrderValidator get(OrderRequest request) {
        return Arrays.stream(OrderValidator.values()).filter((e) -> e.systemType.equals(request.getSystemType()) && e.orderType.equals(request.getOrderType()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(""));
    }
}
