package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By userRoleDropDown = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    By userRoleAdmin = By.linkText("Admin");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By userNameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By statusDropDown = By.xpath("(//div[contains(text(),'-- Select --')])[2]");
    By statusDisable = By.xpath("//div[contains(text(),'Disabled')]");
    By statusEnable = By.cssSelector("div:nth-child(4) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1)");
    By passwordField = By.cssSelector("div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']");
    By confirmPasswordField = By.xpath("(//input[@type='password'])[2]");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");

    public String getAddUserText() {
        return getTextFromElement(addUserText);
    }

    public void selectUserRoleAdminFromDropDown() throws InterruptedException {
        //selectByContainsTextFromDropDown(userRoleDropDown, userRole);
        clickOnElement(userRoleDropDown);
        Thread.sleep(2000);
        clickOnElement(userRoleAdmin);
    }

    public void enterEmployeeName(String employeeName) {
        sendTextToElement(employeeNameField, employeeName);
    }

    public void enterUsername(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void selectStatusDisableFromDropDown() throws InterruptedException {
        //  selectByContainsTextFromDropDown(statusDropDown, status);
        clickOnElement(statusDropDown);
        Thread.sleep(2000);
        clickOnElement(statusDisable);
    }

    public void selectStatusEnableFromDropDown() throws InterruptedException {
        //  selectByContainsTextFromDropDown(statusDropDown, status);
        clickOnElement(statusDropDown);
        Thread.sleep(2000);
        clickOnElement(statusEnable);
    }

    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
    }

    public void clickOnCancelButton() {
        clickOnElement(cancelButton);
    }

}
