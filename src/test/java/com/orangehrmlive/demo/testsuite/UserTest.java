package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    HomePage homePage = new HomePage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessfully() throws InterruptedException {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        // acceptAlert();
        homePage.clickOnAdminLink();
        Assert.assertEquals(viewSystemUserPage.getSystemUsersText(), "System Users");
        viewSystemUserPage.clickOnAddButton();
        Assert.assertEquals(addUserPage.getAddUserText(), "Add User");
        addUserPage.selectUserRoleAdminFromDropDown();
        addUserPage.enterEmployeeName("Paul Collings");
        addUserPage.enterUsername("prime891");
        addUserPage.selectStatusDisableFromDropDown();
        addUserPage.enterPassword("Tester89@");
        addUserPage.enterConfirmPassword("Tester89@");
        addUserPage.clickOnSaveButton();
       //  Assert.assertEquals(,"Successfully Saved");

    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        homePage.clickOnAdminLink();
        Assert.assertEquals(viewSystemUserPage.getSystemUsersText(), "System Users");
        addUserPage.enterUsername("Admin");
        addUserPage.selectUserRoleAdminFromDropDown();
        addUserPage.selectStatusEnableFromDropDown();
        viewSystemUserPage.clickOnSearchButton();
        Assert.assertEquals(viewSystemUserPage.getResultListText(), "Admin");
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessfully() throws InterruptedException {

        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        homePage.clickOnAdminLink();
        Assert.assertEquals(viewSystemUserPage.getSystemUsersText(), "System Users");
        addUserPage.enterUsername("Admin");
        addUserPage.selectUserRoleAdminFromDropDown();
        addUserPage.selectStatusEnableFromDropDown();
        viewSystemUserPage.clickOnSearchButton();
        Assert.assertEquals(viewSystemUserPage.getResultListText(), "Admin");
        viewSystemUserPage.clickOnCheckbox();// Get xpath
        viewSystemUserPage.clickOnDeleteButton();//Get xpath
       // switchToAlert();
        //System.out.println(getTextFromAlert());
        Thread.sleep(2000);
        //acceptAlert();
        //Assert.assertEquals(getTextFromElement(),"Successfully Deleted");
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        homePage.clickOnAdminLink();
        Assert.assertEquals(viewSystemUserPage.getSystemUsersText(), "System Users");
        addUserPage.enterUsername("Admin");
        addUserPage.selectUserRoleAdminFromDropDown();
        addUserPage.selectStatusEnableFromDropDown();
        viewSystemUserPage.clickOnSearchButton();
        //Assert.assertEquals(getTextFromElement(),"No Records Found");

    }
}
