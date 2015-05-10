/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/domain/ModelTest.e.vm.java
 */
package com.h2.demo.domain;

import static org.fest.assertions.Assertions.assertThat;

import java.io.*;
import java.util.*;

import org.junit.Test;

import com.h2.demo.util.ValueGenerator;

/**
 * Basic tests for Book
 */
@SuppressWarnings("unused")
public class BookTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        Book model = new Book();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        Book model = new Book();
        model.setId(ValueGenerator.getUniqueInteger());
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    //-------------------------------------------------------------
    // Many to One:  Book.account ==> Account.id
    //-------------------------------------------------------------

    @Test
    public void manyToOne_setAccount() {
        Book many = new Book();

        // init
        Account one = new Account();
        one.setId(ValueGenerator.getUniqueString(36));
        many.setAccount(one);

        // make sure it is propagated properly
        assertThat(many.getAccount()).isEqualTo(one);

        // now set it to back to null
        many.setAccount(null);

        // make sure null is propagated properly
        assertThat(many.getAccount()).isNull();
    }

    /*
     public void equalsUsingPk() {
     Book model1 = new Book();
     Book model2 = new Book();

     Integer id = ValueGenerator.getUniqueInteger();
     model1.setId(id);
     model2.setId(id);

     model1.setTitle("a");
     model2.setTitle("a");

     model1.setNumberOfPages(1);
     model2.setNumberOfPages(1);

     model1.setVersion(1);
     model2.setVersion(1);
     assertThat(model1.isIdSet()).isTrue();
     assertThat(model2.isIdSet()).isTrue();
     assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
     assertThat(model1).isEqualTo(model2);
     assertThat(model2).isEqualTo(model1);
     }
     */
}