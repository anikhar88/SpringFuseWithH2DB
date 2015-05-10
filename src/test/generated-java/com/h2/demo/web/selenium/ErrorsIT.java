/*
 * (c) Copyright 2005-2015 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/ErrorsIT.p.vm.java
 */
package com.h2.demo.web.selenium;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.h2.demo.web.selenium.page.HomePage;
import com.h2.demo.web.selenium.support.Page;
import com.h2.demo.web.selenium.support.SeleniumTest;

public class ErrorsIT extends SeleniumTest {
    @Test
    public void invalidLoginOrPassword() {
        englishHomePage();
        webClient.step("Login as unknown_user, and verify it is not valid");
        anonymousHomePage.connexion();
        loginPage.login("unknownUser", "invalidPassword");
        loginPage.hasMessage("Invalid credentials");
    }

    @Page
    public static class AjaxErrors extends HomePage {
        @FindBy(id = "form:debug_button")
        public WebElement debugButton;
        @FindBy(xpath = "//span[text()='Throw exception']")
        public WebElement throwException;
        @FindBy(xpath = "//span[text()='Throw data access exception']")
        public WebElement throwDataAccessException;
    }

    AjaxErrors ajaxErrors;

    @Test
    public void catchException() {
        englishHomePage();
        webClient.click(ajaxErrors.debugButton);
        webClient.click(ajaxErrors.throwException);
        ajaxErrors.hasText("Just testing RuntimeException from ExceptionUtil");
    }

    @Test
    public void catchDataException() {
        englishHomePage();
        webClient.click(ajaxErrors.debugButton);
        webClient.click(ajaxErrors.throwDataAccessException);
        ajaxErrors.hasMessage("We have detected a concurrent modification");
    }
}
