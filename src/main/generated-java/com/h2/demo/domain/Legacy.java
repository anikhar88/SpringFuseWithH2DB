/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.h2.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "LEGACY", uniqueConstraints = { @UniqueConstraint(name = "PRIMARY_KEY_8", columnNames = { "NAME", "CODE", "DEPT" }) })
public class Legacy implements Identifiable<LegacyPk>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Legacy.class);

    // Composite primary key
    private LegacyPk id = new LegacyPk();

    // Raw attributes
    private String extraInfo;

    // -----------------------
    // Composite Primary Key
    // -----------------------

    /**
     * Returns the composite primary key.
     */
    @Override
    @EmbeddedId
    public LegacyPk getId() {
        return id;
    }

    /**
     * Set the composite primary key.
     * @param id the composite primary key.
     */
    @Override
    public void setId(LegacyPk id) {
        this.id = id;
    }

    public Legacy id(LegacyPk id) {
        setId(id);
        return this;
    }

    /**
     * Tells whether or not this instance has a non empty composite primary key set.
     * @return true if a non empty primary key is set, false otherwise
     */
    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return getId() != null && getId().areFieldsSet();
    }

    // -- [extraInfo] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "EXTRA_INFO", nullable = false, length = 100)
    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Legacy extraInfo(String extraInfo) {
        setExtraInfo(extraInfo);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Legacy withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Legacy && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Legacy instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("extraInfo", getExtraInfo()) //
                .toString();
    }
}