/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.h2.demo.domain;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "DOCUMENT")
public class Document implements Identifiable<String>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Document.class);

    // Raw attributes
    private String id;
    private byte[] documentBinary;
    private String documentFileName;
    private String documentContentType;
    private Integer documentSize;
    private Integer version;

    // Many to one
    private Account account;

    // -- [id] ------------------------

    @Override
    @Column(name = "ID", length = 36)
    @GeneratedValue(generator = "strategy-uuid2")
    @GenericGenerator(name = "strategy-uuid2", strategy = "uuid2")
    @Id
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Document id(String id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null && !id.isEmpty();
    }

    // -- [documentBinary] ------------------------

    @Basic(fetch = LAZY)
    @Column(name = "DOCUMENT_BINARY")
    @Lob
    public byte[] getDocumentBinary() {
        return documentBinary;
    }

    public void setDocumentBinary(byte[] documentBinary) {
        this.documentBinary = documentBinary;
    }

    public Document documentBinary(byte[] documentBinary) {
        setDocumentBinary(documentBinary);
        return this;
    }

    // -- [documentFileName] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "DOCUMENT_FILE_NAME", nullable = false, length = 100)
    public String getDocumentFileName() {
        return documentFileName;
    }

    public void setDocumentFileName(String documentFileName) {
        this.documentFileName = documentFileName;
    }

    public Document documentFileName(String documentFileName) {
        setDocumentFileName(documentFileName);
        return this;
    }

    // -- [documentContentType] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "DOCUMENT_CONTENT_TYPE", nullable = false, length = 100)
    public String getDocumentContentType() {
        return documentContentType;
    }

    public void setDocumentContentType(String documentContentType) {
        this.documentContentType = documentContentType;
    }

    public Document documentContentType(String documentContentType) {
        setDocumentContentType(documentContentType);
        return this;
    }

    // -- [documentSize] ------------------------

    @Digits(integer = 10, fraction = 0)
    @NotNull
    @Column(name = "DOCUMENT_SIZE", nullable = false, precision = 10)
    public Integer getDocumentSize() {
        return documentSize;
    }

    public void setDocumentSize(Integer documentSize) {
        this.documentSize = documentSize;
    }

    public Document documentSize(Integer documentSize) {
        setDocumentSize(documentSize);
        return this;
    }

    // -- [version] ------------------------

    @Column(name = "VERSION", precision = 10)
    @Version
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Document version(Integer version) {
        setVersion(version);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: Document.account ==> Account.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "ACCOUNT_ID", nullable = false)
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public Account getAccount() {
        return account;
    }

    /**
     * Set the {@link #account} without adding this Document instance on the passed {@link #account}
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    public Document account(Account account) {
        setAccount(account);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Document withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Document && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Document instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("documentBinary", getDocumentBinary()) //
                .add("documentFileName", getDocumentFileName()) //
                .add("documentContentType", getDocumentContentType()) //
                .add("documentSize", getDocumentSize()) //
                .add("version", getVersion()) //
                .toString();
    }
}