package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signinLink = By.linkText("Sign In");
    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By signinButton = By.xpath("//input[@type='submit']");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");
    //By errorMessage = By.xpath("//li[@role='alert']");


    public void clickOnSignInLink() {
        clickOnElement(signinLink);
    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        clickOnElement(signinButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
