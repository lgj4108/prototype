package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.dto.ClaimDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractClaimProcessor {
    protected void doValidationProcess(ClaimDto claimDto){
        log.info("AbstractClaimProcessor.doValidationProcess : {}", claimDto);
    }
    protected abstract void doClaimDataManipulateProcess(ClaimDto claimDto);

    protected void verifyAmount(ClaimDto claimDto) {
        log.info("AbstractClaimProcessor.verifyAmount : {}", claimDto);
    }

    public abstract void doProcess(ClaimDto claimDto);
}
