package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {

By usernameLink= By.xpath("//input[@placeholder='Username']");
By passwordLink = By.xpath("//input[@placeholder='Password']");
By loginButtonLink = By.xpath("//button[normalize-space()='Login']");
By hrForAllLogoText =By.xpath("//div[@class='orangehrm-login-logo']");
By loginPanelTextLocator = By.xpath("//h5[normalize-space()='Login']");

public void enterUsername(){
    sendTextToElement(usernameLink,"Admin");
}
public void enterPassword(){
    sendTextToElement(passwordLink,"admin123");
}
public void clickOnLoginButton(){
    clickOnElement(loginButtonLink);
}
public boolean isHRForAllLogoDisplayed(){
    WebElement logo = driver.findElement(hrForAllLogoText);
    return logo.isDisplayed();
}
public String getLoginPanelText(){
  return getTextFromElement(loginPanelTextLocator);
}













}
