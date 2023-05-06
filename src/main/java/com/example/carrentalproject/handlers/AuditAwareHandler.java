package com.example.carrentalproject.handlers;

import org.springframework.data.domain.AuditorAware;
import utils.Constants;

import java.util.Optional;

public class AuditAwareHandler implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() /*Set the value for CreatedBy & LastModified by*/ {
        return Optional.of(Constants.Audit.DEFAULT_AUDITOR);
    }
}
