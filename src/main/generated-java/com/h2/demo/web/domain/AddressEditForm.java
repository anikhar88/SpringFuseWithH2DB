/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package com.h2.demo.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.h2.demo.domain.Address;
import com.h2.demo.repository.AddressRepository;
import com.h2.demo.web.domain.support.GenericEditForm;
import com.h2.demo.web.faces.ConversationContextScoped;

/**
 * View Helper/Controller to edit {@link Address}.
 */
@Named
@ConversationContextScoped
public class AddressEditForm extends GenericEditForm<Address, Integer> {
    @Inject
    protected AddressController addressController;

    @Inject
    public AddressEditForm(AddressRepository addressRepository) {
        super(addressRepository);
    }

    /**
     * The entity to edit/view.
     */
    public Address getAddress() {
        return getEntity();
    }

    public String print() {
        return addressController.print(getAddress());
    }
}
