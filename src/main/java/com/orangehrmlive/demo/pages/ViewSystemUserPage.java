package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {

    By systemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    By usernameField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRollDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By statusDropDown = By.xpath("(//div[contains(text(),'-- Select --')])[2]");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By resetButton = By.xpath("//button[normalize-space()='Search']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By deleteButton = By.xpath("//i[@class='oxd-icon bi-trash']");
    By resultList = By.xpath("//div[@class='oxd-table-card']//div[2]//div[1]");
By checkboxLink = By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    public String getSystemUsersText() {
        return getTextFromElement(systemUsersText);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void selectUserRollFromDropDown() {
        selectByVisibleTextFromDropDown(userRollDropDown, "-- Select --");
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
    }

    public void selectStatusFromDropDown() {
        selectByVisibleTextFromDropDown(statusDropDown, "-- Select --");
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public void clickOnResetButton() {
        clickOnElement(resetButton);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
    }

    public String getResultListText(){
        return getTextFromElement(resultList);
    }
public void clickOnCheckbox(){
    clickOnElement(checkboxLink);
    }

}
