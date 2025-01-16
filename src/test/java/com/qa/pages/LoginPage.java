package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends MenuPage{

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/loginTV")
    private WebElement msgPageTitle;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement txtUsername;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    private WebElement txtPassword;

    @AndroidFindBy(accessibility = "Tap to login with given credentials")
    private WebElement btnLogin;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameErrorTV")
    private WebElement msgRequiredUsername;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordErrorTV")
    private WebElement msgRequiredPassword;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordErrorTV")
    private WebElement msgLockedUser;


    public String getPageTitle() {
        return getText(msgPageTitle, "Page Title is: ");
    }

    public LoginPage enterUserName(String username) throws InterruptedException {
        clear(txtUsername);
        sendKeys(txtUsername, username, "Login with username: " + username);
        return this;
    }

    public LoginPage enterPassword(String password) throws InterruptedException {
        clear(txtPassword);
        sendKeys(txtPassword, password, "Login with password: " + password);
        return this;
    }

    public ProductsPage pressLoginBtnToProducts() {
        click(btnLogin, "press login button");
        return new ProductsPage();
    }

    public CheckoutPage pressLoginBtnToCheckout() {
        click(btnLogin, "press login button");
        return new CheckoutPage();
    }

    public boolean isUsernameRequiredMsgDisplayed() {
        try {
            waitForVisibility(msgRequiredUsername);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getRequiredUsernameErrorTxt() {
        return getText(msgRequiredUsername, "Required Username error is:  ");
    }

    public String getRequiredPasswordErrorTxt() {
        return getText(msgRequiredPassword, "Required Password error is:  ");
    }
}
