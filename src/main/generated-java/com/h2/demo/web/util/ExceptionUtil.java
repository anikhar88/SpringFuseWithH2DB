/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/util/ExceptionUtil.p.vm.java
 */
package com.h2.demo.web.util;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.OptimisticLockException;

@Named
@Singleton
public class ExceptionUtil {

    /**
     * Use it during development as an action to throw exceptions and thus verify that your
     * error handling code is correct.
     */
    public void throwRuntimeException() {
        throw new RuntimeException("Just testing RuntimeException from ExceptionUtil ...");
    }

    public void throwDataAccessException() {
        throw new OptimisticLockException("Just testing OptimisticLockException from ExceptionUtil ...");
    }

    public static boolean isCausedBy(Throwable e, Class<?> cause) {
        Throwable current = e;
        while (current != null) {
            if (cause.isAssignableFrom(current.getClass())) {
                return true;
            }
            current = current.getCause();
        }
        return false;
    }
}