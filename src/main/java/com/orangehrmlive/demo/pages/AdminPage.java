package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By userManagementLink = By.xpath("//span[normalize-space()='User Management']");
    By jobLink = By.xpath("//span[normalize-space()='Job']");
    By organizationLink = By.xpath("//span[normalize-space()='Organization']");


    public void clickOnUserManagementLink() {
        clickOnElement(userManagementLink);
    }

    public void clickOnJobLink() {
        clickOnElement(jobLink);
    }

    public void clickOnOrganizationLink() {
        clickOnElement(organizationLink);
    }

}
