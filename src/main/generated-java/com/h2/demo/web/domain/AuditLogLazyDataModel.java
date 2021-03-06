/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/LazyDataModel.e.vm.java
 */
package com.h2.demo.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;

import com.h2.demo.domain.AuditLog;
import com.h2.demo.repository.AuditLogRepository;
import com.h2.demo.web.domain.support.GenericLazyDataModel;
import com.h2.demo.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link AuditLog}
 */
@Named
@ConversationContextScoped
public class AuditLogLazyDataModel extends GenericLazyDataModel<AuditLog, Integer, AuditLogSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public AuditLogLazyDataModel(AuditLogRepository auditLogRepository, AuditLogController auditLogController, AuditLogSearchForm auditLogSearchForm,
            AuditLogExcelExporter auditLogExcelExporter) {
        super(auditLogRepository, auditLogController, auditLogSearchForm, auditLogExcelExporter);
    }
}