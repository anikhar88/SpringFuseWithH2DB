/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/context/LogContext.p.vm.java
 */
package com.h2.demo.context;

import org.slf4j.MDC;

/**
 * Used to store to use global info for logging purposes. This method prevents passing all the data you want to see in your logs in all the methods.
 * <p>
 * Please configure logback with the data provided by this class where <code>session_id</code> and <code>login</code> are objects stored in the log context.
 * <p>
 * Example: <br>
 * <code>
 * [%d{ISO8601}] [%-5level] [%X{session_id}] [%X{login}] [%C{3}.%M] %m%n
 * </code>
 */
public final class LogContext {

    private LogContext() {
    }

    /**
     * parameter name that holds logins
     */
    public static final String LOGIN = "login";

    /**
     * parameter name that holds web session ids
     */
    public static final String SESSION_ID = "session_id";

    /**
     * set the given login in the map
     */
    public static void setLogin(String login) {
        put(LOGIN, login);
    }

    /**
     * set the given web session in the map
     */
    public static void setSessionId(String sessionId) {
        put(SESSION_ID, sessionId);
    }

    /**
     * Get the context identified by the key parameter.
     */
    public static Object get(String key) {
        return MDC.get(key);
    }

    /**
     * Put a context value (the o parameter) as identified with the key parameter into the current thread's context map.
     */
    public static void put(String key, Object o) {
        MDC.put(key, o.toString());
    }

    /**
     * Remove the the context identified by the key parameter.
     */
    public static void remove(String key) {
        MDC.remove(key);
    }

    /**
     * Remove all the object put in this thread context.
     */
    public static void resetLogContext() {
        MDC.clear();
    }
}
