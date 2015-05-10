/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.h2.demo.repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.inject.Named;
import javax.inject.Singleton;

import com.h2.demo.domain.MoreTypesDemo;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class MoreTypesDemoGenerator {

    /**
     * Returns a new MoreTypesDemo instance filled with random values.
     */
    public MoreTypesDemo getMoreTypesDemo() {
        MoreTypesDemo moreTypesDemo = new MoreTypesDemo();

        // simple attributes follows
        moreTypesDemo.setNumberInt(1);
        moreTypesDemo.setNumberLong(1l);
        moreTypesDemo.setNumberDouble(1d);
        moreTypesDemo.setNumberFloat(1f);
        moreTypesDemo.setNumberBigInteger(BigInteger.ONE);
        moreTypesDemo.setNumberBigDecimal(BigDecimal.ONE);
        moreTypesDemo.setDateJavaTemporalDate(new Date());
        moreTypesDemo.setDateJavaTemporalTimestamp(new Date());
        moreTypesDemo.setDateJoda(new Date());
        moreTypesDemo.setDateTimeJoda(new Date());
        return moreTypesDemo;
    }

}