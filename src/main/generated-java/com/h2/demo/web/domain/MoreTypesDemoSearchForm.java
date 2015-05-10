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
import static com.h2.demo.repository.support.Range.newRange;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.inject.Named;

import com.h2.demo.domain.MoreTypesDemo;
import com.h2.demo.domain.MoreTypesDemo_;
import com.h2.demo.repository.support.PropertySelector;
import com.h2.demo.repository.support.Range;
import com.h2.demo.repository.support.SearchParameters;
import com.h2.demo.web.domain.support.GenericSearchForm;
import com.h2.demo.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link MoreTypesDemo}.
 * It exposes a {@link MoreTypesDemo} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class MoreTypesDemoSearchForm extends GenericSearchForm<MoreTypesDemo, BigDecimal, MoreTypesDemoSearchForm> {
    private static final long serialVersionUID = 1L;
    protected MoreTypesDemo moreTypesDemo = new MoreTypesDemo();
    protected Range<MoreTypesDemo, Integer> numberIntRange = newRange(MoreTypesDemo_.numberInt);
    protected Range<MoreTypesDemo, Long> numberLongRange = newRange(MoreTypesDemo_.numberLong);
    protected Range<MoreTypesDemo, Double> numberDoubleRange = newRange(MoreTypesDemo_.numberDouble);
    protected Range<MoreTypesDemo, Float> numberFloatRange = newRange(MoreTypesDemo_.numberFloat);
    protected Range<MoreTypesDemo, BigInteger> numberBigIntegerRange = newRange(MoreTypesDemo_.numberBigInteger);
    protected Range<MoreTypesDemo, BigDecimal> numberBigDecimalRange = newRange(MoreTypesDemo_.numberBigDecimal);
    protected Range<MoreTypesDemo, Date> dateJavaTemporalDateRange = newRange(MoreTypesDemo_.dateJavaTemporalDate);
    protected Range<MoreTypesDemo, Date> dateJavaTemporalTimestampRange = newRange(MoreTypesDemo_.dateJavaTemporalTimestamp);
    protected Range<MoreTypesDemo, Date> dateJodaRange = newRange(MoreTypesDemo_.dateJoda);
    protected Range<MoreTypesDemo, Date> dateTimeJodaRange = newRange(MoreTypesDemo_.dateTimeJoda);
    protected PropertySelector<MoreTypesDemo, Integer> numberIntSelector = newPropertySelector(MoreTypesDemo_.numberInt);
    protected PropertySelector<MoreTypesDemo, Long> numberLongSelector = newPropertySelector(MoreTypesDemo_.numberLong);
    protected PropertySelector<MoreTypesDemo, Double> numberDoubleSelector = newPropertySelector(MoreTypesDemo_.numberDouble);
    protected PropertySelector<MoreTypesDemo, Float> numberFloatSelector = newPropertySelector(MoreTypesDemo_.numberFloat);
    protected PropertySelector<MoreTypesDemo, BigInteger> numberBigIntegerSelector = newPropertySelector(MoreTypesDemo_.numberBigInteger);
    protected PropertySelector<MoreTypesDemo, BigDecimal> numberBigDecimalSelector = newPropertySelector(MoreTypesDemo_.numberBigDecimal);

    public MoreTypesDemo getMoreTypesDemo() {
        return moreTypesDemo;
    }

    @Override
    protected MoreTypesDemo getEntity() {
        return getMoreTypesDemo();
    }

    @Override
    public MoreTypesDemoSearchForm newInstance() {
        return new MoreTypesDemoSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(numberIntRange, numberLongRange, numberDoubleRange, numberFloatRange, numberBigIntegerRange, numberBigDecimalRange, dateJavaTemporalDateRange,
                dateJavaTemporalTimestampRange, dateJodaRange, dateTimeJodaRange);
        sp.property(numberIntSelector, numberLongSelector, numberDoubleSelector, numberFloatSelector, numberBigIntegerSelector, numberBigDecimalSelector);
        return sp;
    }

    @Override
    public void resetWithOther(MoreTypesDemoSearchForm other) {
        this.moreTypesDemo = other.getMoreTypesDemo();
        this.numberIntRange = other.getNumberIntRange();
        this.numberLongRange = other.getNumberLongRange();
        this.numberDoubleRange = other.getNumberDoubleRange();
        this.numberFloatRange = other.getNumberFloatRange();
        this.numberBigIntegerRange = other.getNumberBigIntegerRange();
        this.numberBigDecimalRange = other.getNumberBigDecimalRange();
        this.dateJavaTemporalDateRange = other.getDateJavaTemporalDateRange();
        this.dateJavaTemporalTimestampRange = other.getDateJavaTemporalTimestampRange();
        this.dateJodaRange = other.getDateJodaRange();
        this.dateTimeJodaRange = other.getDateTimeJodaRange();
        this.numberIntSelector = other.getNumberIntSelector();
        this.numberLongSelector = other.getNumberLongSelector();
        this.numberDoubleSelector = other.getNumberDoubleSelector();
        this.numberFloatSelector = other.getNumberFloatSelector();
        this.numberBigIntegerSelector = other.getNumberBigIntegerSelector();
        this.numberBigDecimalSelector = other.getNumberBigDecimalSelector();
    }

    // Ranges
    public Range<MoreTypesDemo, Integer> getNumberIntRange() {
        return numberIntRange;
    }

    public Range<MoreTypesDemo, Long> getNumberLongRange() {
        return numberLongRange;
    }

    public Range<MoreTypesDemo, Double> getNumberDoubleRange() {
        return numberDoubleRange;
    }

    public Range<MoreTypesDemo, Float> getNumberFloatRange() {
        return numberFloatRange;
    }

    public Range<MoreTypesDemo, BigInteger> getNumberBigIntegerRange() {
        return numberBigIntegerRange;
    }

    public Range<MoreTypesDemo, BigDecimal> getNumberBigDecimalRange() {
        return numberBigDecimalRange;
    }

    public Range<MoreTypesDemo, Date> getDateJavaTemporalDateRange() {
        return dateJavaTemporalDateRange;
    }

    public Range<MoreTypesDemo, Date> getDateJavaTemporalTimestampRange() {
        return dateJavaTemporalTimestampRange;
    }

    public Range<MoreTypesDemo, Date> getDateJodaRange() {
        return dateJodaRange;
    }

    public Range<MoreTypesDemo, Date> getDateTimeJodaRange() {
        return dateTimeJodaRange;
    }

    // Property selectors
    public PropertySelector<MoreTypesDemo, Integer> getNumberIntSelector() {
        return numberIntSelector;
    }

    public PropertySelector<MoreTypesDemo, Long> getNumberLongSelector() {
        return numberLongSelector;
    }

    public PropertySelector<MoreTypesDemo, Double> getNumberDoubleSelector() {
        return numberDoubleSelector;
    }

    public PropertySelector<MoreTypesDemo, Float> getNumberFloatSelector() {
        return numberFloatSelector;
    }

    public PropertySelector<MoreTypesDemo, BigInteger> getNumberBigIntegerSelector() {
        return numberBigIntegerSelector;
    }

    public PropertySelector<MoreTypesDemo, BigDecimal> getNumberBigDecimalSelector() {
        return numberBigDecimalSelector;
    }
}
