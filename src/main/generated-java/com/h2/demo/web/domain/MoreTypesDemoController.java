/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/Controller.e.vm.java
 */
package com.h2.demo.web.domain;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.h2.demo.domain.MoreTypesDemo;
import com.h2.demo.printer.MoreTypesDemoPrinter;
import com.h2.demo.repository.MoreTypesDemoRepository;
import com.h2.demo.web.domain.support.GenericController;
import com.h2.demo.web.permission.MoreTypesDemoPermission;

/**
 * Stateless controller for {@link MoreTypesDemo} conversation start.
 */
@Named
@Singleton
public class MoreTypesDemoController extends GenericController<MoreTypesDemo, BigDecimal> {
    public static final String MORETYPESDEMO_EDIT_URI = "/domain/moreTypesDemoEdit.faces";
    public static final String MORETYPESDEMO_SELECT_URI = "/domain/moreTypesDemoSelect.faces";

    @Inject
    public MoreTypesDemoController(MoreTypesDemoRepository moreTypesDemoRepository, MoreTypesDemoPermission moreTypesDemoPermission,
            MoreTypesDemoPrinter moreTypesDemoPrinter) {
        super(moreTypesDemoRepository, moreTypesDemoPermission, moreTypesDemoPrinter, MORETYPESDEMO_SELECT_URI, MORETYPESDEMO_EDIT_URI);
    }
}