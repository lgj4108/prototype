package com.plateer.ec1.claim.define;

import com.plateer.ec1.claim.processor.AbstractClaimProcessor;
import com.plateer.ec1.claim.processor.impl.AcceptWithdrawalProcessor;
import com.plateer.ec1.claim.service.ClaimService;

import java.util.Arrays;
import java.util.List;

public enum ClaimType {
//    GCC(AcceptWithdrawalProcessor(new ClaimService()))

    ;

    ClaimType(AbstractClaimProcessor claimProcessor, List<String> validStatusList, List<String> productTypeList, boolean claimNoFlag, String claimCode, String orderStateCode, List<String> deliveryCodeList) {
        this.claimProcessor = claimProcessor;
//        this.validStatusList = validStatusList;
//        this.productTypeList = productTypeList;
//        this.claimNoFlag = claimNoFlag;
//        this.claimCode = claimCode;
//        this.orderStateCode = orderStateCode;
//        this.deliveryCodeList = deliveryCodeList;
    }

    private AbstractClaimProcessor claimProcessor;
    private List<String> validStatusList;
    private List<String> productTypeList;
    private boolean claimNoFlag;
    private String claimCode;
    private String orderStateCode;
    private List<String> deliveryCodeList;

    ClaimType(AbstractClaimProcessor instance) {
        this.claimProcessor = instance;
    }
}
