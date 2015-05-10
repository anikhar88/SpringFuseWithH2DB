/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/RepositoryIT.e.vm.java
 */
package com.h2.demo.repository;

import static com.google.common.collect.Sets.newHashSet;
import static com.h2.demo.repository.support.PropertySelector.newPropertySelector;
import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Set;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.serializer.DefaultDeserializer;
import org.springframework.core.serializer.DefaultSerializer;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.h2.demo.domain.Role;
import com.h2.demo.domain.Role_;
import com.h2.demo.repository.support.SearchParameters;

/**
 * Integration test on RoleRepository
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class RoleRepositoryIT {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(RoleRepositoryIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private RoleRepository roleRepository;

    @Inject
    private RoleGenerator roleGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        Role role = roleGenerator.getRole();

        // add it to a Set before saving (force equals/hashcode)
        Set<Role> set = newHashSet(role, role);
        assertThat(set).hasSize(1);

        roleRepository.save(role);
        entityManager.flush();

        // reload it from cache and check equality
        Role model = new Role();
        model.setId(role.getId());
        assertThat(role).isEqualTo(roleRepository.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // since you use a business key, equality must be preserved.
        assertThat(role).isEqualTo(roleRepository.get(model));
    }

    @Test
    @Rollback
    public void saveAndGetWithPropertySelector() {
        Role role = roleGenerator.getRole();

        // add it to a Set before saving (force equals/hashcode)
        Set<Role> set = newHashSet(role, role);
        assertThat(set).hasSize(1);

        roleRepository.save(role);
        entityManager.flush();

        // reload it from cache and check equality
        SearchParameters searchParameters = new SearchParameters();
        searchParameters.property(newPropertySelector(Role_.id).selected(role.getId()));

        // clear cache to force reload from db
        entityManager.clear();

        SearchParameters ser = null;
        try {
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            new DefaultSerializer().serialize(searchParameters, stream);
            byte[] bytes = stream.toByteArray();
            ser = (SearchParameters) new DefaultDeserializer().deserialize(new ByteArrayInputStream(bytes));
        } catch (Exception e) {
            fail();
        }

        // pk are equals...
        assertThat(role).isEqualTo(roleRepository.findUnique(ser));
    }

}