/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/printer/Printer.e.vm.java
 */
package com.h2.demo.printer;

import java.util.Locale;

import javax.inject.Named;
import javax.inject.Singleton;

import com.h2.demo.domain.Account;
import com.h2.demo.domain.Account_;
import com.h2.demo.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link Account} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class AccountPrinter extends GenericPrinter<Account> {
    public AccountPrinter() {
        super(Account.class, Account_.login, Account_.firstName, Account_.lastName);
    }

    @Override
    public String print(Account account, Locale locale) {
        if (account == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, account.getLogin());
        appendIfNotEmpty(ret, account.getFirstName());
        appendIfNotEmpty(ret, account.getLastName());
        return ret.toString();
    }
}