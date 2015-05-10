/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/repository/Repository.e.vm.java
 */
package com.h2.demo.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.h2.demo.domain.AuditLog;
import com.h2.demo.repository.support.GenericRepository;

/**
 * {@link GenericRepository} for {@link AuditLog} 
 */
@Named
@Singleton
public class AuditLogRepository extends GenericRepository<AuditLog, Integer> {

    public AuditLogRepository() {
        super(AuditLog.class);
    }

    @Override
    public AuditLog getNew() {
        return new AuditLog();
    }

    @Override
    public AuditLog getNewWithDefaults() {
        return getNew().withDefaults();
    }
}