/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/permission/Permission.e.vm.java
 */
package com.h2.demo.web.permission;

import javax.inject.Named;
import javax.inject.Singleton;

import com.h2.demo.domain.AuditLog;
import com.h2.demo.web.permission.support.GenericPermission;

@Named
@Singleton
public class AuditLogPermission extends GenericPermission<AuditLog> {
    public AuditLogPermission() {
        super(AuditLog.class);
    }
}