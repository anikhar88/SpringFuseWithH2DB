/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/repository/Repository.e.vm.java
 */
package com.h2.demo.repository;

import java.math.BigDecimal;

import javax.inject.Named;
import javax.inject.Singleton;

import com.h2.demo.domain.MoreTypesDemo;
import com.h2.demo.repository.support.GenericRepository;

/**
 * {@link GenericRepository} for {@link MoreTypesDemo} 
 */
@Named
@Singleton
public class MoreTypesDemoRepository extends GenericRepository<MoreTypesDemo, BigDecimal> {

    public MoreTypesDemoRepository() {
        super(MoreTypesDemo.class);
    }

    @Override
    public MoreTypesDemo getNew() {
        return new MoreTypesDemo();
    }

    @Override
    public MoreTypesDemo getNewWithDefaults() {
        return getNew().withDefaults();
    }
}