/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/SearchPage.e.vm.java
 */
package com.h2.demo.web.selenium.page.document;

import com.h2.demo.web.selenium.support.Page;
import com.h2.demo.web.selenium.support.elements.Autocomplete;
import com.h2.demo.web.selenium.support.elements.CustomWebElement;
import com.h2.demo.web.selenium.support.elements.EntityAction;
import com.h2.demo.web.selenium.support.elements.Messages;
import com.h2.demo.web.selenium.support.elements.OrderBy;
import com.h2.demo.web.selenium.support.elements.SearchForm;
import com.h2.demo.web.selenium.support.elements.Table;

@Page
public class DocumentSearch {
    public Table table;
    public EntityAction entity;
    public Messages messages;
    public DocumentSearchOrders orders;
    public DocumentSearchForm form;

    public static class DocumentSearchOrders extends CustomWebElement {
        public OrderBy accountId = new OrderBy("document_accountId");
    }

    public static class DocumentSearchForm extends SearchForm {
        public Autocomplete account = new Autocomplete("form:accountSelector");
    }
}