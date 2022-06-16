package com.plateer.ec1.promotion.calculator.factory;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.code.PromotionType;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class CalculatorFactory {
    private Map<PromotionType, Calculator> calculatorMap = new LinkedHashMap<>();
    private final List<Calculator> calculators;

    public CalculatorFactory(List<Calculator> calculators) {
        this.calculators = calculators;
    }

    @PostConstruct
    public void init() {
        calculators.forEach(c -> calculatorMap.put(c.getType(), c));
    }

    public Calculator getPromotionCalculator(PromotionType type) {
        return calculatorMap.get(type);
    }
}
