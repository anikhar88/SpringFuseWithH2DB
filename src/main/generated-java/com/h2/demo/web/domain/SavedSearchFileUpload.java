/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/FileUpload.e.vm.java
 */
package com.h2.demo.web.domain;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.h2.demo.domain.SavedSearch;

public class SavedSearchFileUpload {
    private SavedSearch savedSearch;

    public SavedSearchFileUpload(SavedSearch savedSearch) {
        this.savedSearch = savedSearch;
    }

    /**
     * Primefaces support for formContent file upload
     */
    public void onFormContentFileUpload(FileUploadEvent fileUploadEvent) {
        UploadedFile uploadedFile = fileUploadEvent.getFile(); //application code
        savedSearch.setFormContent(uploadedFile.getContents());
    }
}