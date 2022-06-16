package com.plateer.ec1.claim.processor.impl;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.processor.AbstractClaimProcessor;
import com.plateer.ec1.claim.service.ClaimService;

public class AcceptWithdrawalProcessor extends AbstractClaimProcessor {

    private ClaimService service;

    private String data;

    private AcceptWithdrawalProcessor(ClaimService service) {
        this.service = service;
    }

    public static AbstractClaimProcessor getInstance(ClaimService service) {
        return new AcceptWithdrawalProcessor(service);
    }

    @Override
    protected void doClaimDataManipulateProcess(ClaimDto claimDto) {

    }

    @Override
    public void doProcess(ClaimDto claimDto) {

    }
}
