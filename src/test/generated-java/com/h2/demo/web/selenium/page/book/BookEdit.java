/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.h2.demo.web.selenium.page.book;

import com.h2.demo.web.selenium.support.Page;
import com.h2.demo.web.selenium.support.elements.CustomWebElement;
import com.h2.demo.web.selenium.support.elements.EditAction;
import com.h2.demo.web.selenium.support.elements.EntityAction;
import com.h2.demo.web.selenium.support.elements.IntegerInput;
import com.h2.demo.web.selenium.support.elements.Messages;
import com.h2.demo.web.selenium.support.elements.NoInverseManyToOne;
import com.h2.demo.web.selenium.support.elements.StringInput;

@Page
public class BookEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public BookEditForm form;
    public BookEditTabs tabs;

    public static class BookEditForm extends CustomWebElement {
        public StringInput title = new StringInput("form:title");
        public IntegerInput numberOfPages = new IntegerInput("form:numberOfPages");

        public NoInverseManyToOne account = new NoInverseManyToOne("form:account");
    };

    public static class BookEditTabs extends CustomWebElement {
    };
}