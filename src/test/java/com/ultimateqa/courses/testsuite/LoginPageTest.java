package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnSignInLink();
        Assert.assertEquals(loginPage.getWelcomeMessage(), "Welcome Back!", "Login Page not displayed");
    }

    @Test

    public void verifyTheErrorMessage() {
        loginPage.clickOnSignInLink();
        loginPage.enterEmailId("testing13@gail.com");
        loginPage.enterPassword("test34");
        loginPage.clickOnSignInButton();
        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid email or password.", "Error message not displayed");

    }
}