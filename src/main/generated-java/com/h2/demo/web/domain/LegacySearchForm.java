/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package com.h2.demo.web.domain;

import static com.h2.demo.repository.support.PropertySelector.newPropertySelector;

import javax.inject.Named;

import com.h2.demo.domain.Legacy;
import com.h2.demo.domain.LegacyPk;
import com.h2.demo.domain.Legacy_;
import com.h2.demo.repository.support.PropertySelector;
import com.h2.demo.repository.support.SearchParameters;
import com.h2.demo.web.domain.support.GenericSearchForm;
import com.h2.demo.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Legacy}.
 * It exposes a {@link Legacy} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class LegacySearchForm extends GenericSearchForm<Legacy, LegacyPk, LegacySearchForm> {
    private static final long serialVersionUID = 1L;
    protected Legacy legacy = new Legacy();
    protected PropertySelector<Legacy, String> extraInfoSelector = newPropertySelector(Legacy_.extraInfo);

    public Legacy getLegacy() {
        return legacy;
    }

    @Override
    protected Legacy getEntity() {
        return getLegacy();
    }

    @Override
    public LegacySearchForm newInstance() {
        return new LegacySearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.distinct(false); // we must force to false to cirvumvent a bug in H2 or Hibernate. TODO: report the bug
        sp.property(extraInfoSelector);
        return sp;
    }

    @Override
    public void resetWithOther(LegacySearchForm other) {
        this.legacy = other.getLegacy();
        this.extraInfoSelector = other.getExtraInfoSelector();
    }

    // Property selectors
    public PropertySelector<Legacy, String> getExtraInfoSelector() {
        return extraInfoSelector;
    }
}