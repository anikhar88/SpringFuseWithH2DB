/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/ExcelExporter.e.vm.java
 */
package com.h2.demo.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.h2.demo.domain.Account;
import com.h2.demo.web.domain.support.GenericExcelExporter;
import com.h2.demo.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link Account} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class AccountExcelExporter extends GenericExcelExporter<Account> {
    @Inject
    protected AccountSearchForm sf;

    public AccountExcelExporter() {
        super("account_login", "account_password", "account_email", "account_isEnabled", "account_civility", "account_firstName");
    }

    @Override
    protected void fillResultItem(int row, Account item) {
        int col = 0;
        setValue(row, col++, item.getLogin());
        setValue(row, col++, item.getPassword());
        setValue(row, col++, item.getEmail());
        setValue(row, col++, item.getIsEnabled());
        setValue(row, col++, item.getCivility());
        setValue(row, col++, item.getFirstName());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelector(row++, 0, "account_login", sf.getLoginSelector());
        setSelector(row++, 0, "account_password", sf.getPasswordSelector());
        setSelector(row++, 0, "account_email", sf.getEmailSelector());
        setSelector(row++, 0, "account_isEnabled", sf.getIsEnabledSelector());
        setSelector(row++, 0, "account_civility", sf.getCivilitySelector());
        setSelector(row++, 0, "account_firstName", sf.getFirstNameSelector());
        setSelector(row++, 0, "account_lastName", sf.getLastNameSelector());
        setRangeDateTime(row++, 0, "account_birthDate", sf.getBirthDateRange());
        setSelector(row++, 0, "account_description", sf.getDescriptionSelector());
        setSelectedEntities(row++, 0, "account_address", sf.getAddressSelector().getSelected());
        setSelectedEntities(row++, 0, "account_roles", sf.getAccount().getRoles());
    }
}