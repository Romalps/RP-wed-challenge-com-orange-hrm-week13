package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    HomePage homePage = new HomePage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();
DashboardPage dashboardPage= new DashboardPage();
    @Test
    public void verifyUserShouldLoginSuccessfully(){
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        //Assert.assertEquals(getTextFromElement(),"Dashboard");

    }
    @Test
    public void verifyThatTheLogoDisplayOnLoginPage(){
Assert.assertTrue(loginPage.isHRForAllLogoDisplayed());
    }
    @Test
    public void verifyUserShouldLogoutSuccessfully() throws InterruptedException {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        dashboardPage.clickOnUserProfileLogo();
        dashboardPage.mouseHoverOnLogoutAndClick();
        Assert.assertEquals(loginPage.getLoginPanelText(),"Login");
    }
}
