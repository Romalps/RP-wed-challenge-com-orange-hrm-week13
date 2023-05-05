package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");
By userProfileLogo = By.xpath("//img[@class='oxd-userdropdown-img']");
By logoutLink = By.xpath("//a[normalize-space()='Logout']");



    public String getDashboardText(){
        return getTextFromElement(dashboardText);
    }

    public void clickOnUserProfileLogo() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(userProfileLogo);
    }
    public void mouseHoverOnLogoutAndClick() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(logoutLink);
    }
}
