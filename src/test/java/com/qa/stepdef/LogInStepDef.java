package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.MenuPage;
import com.qa.pages.ProductsPage;
import com.qa.pages.SettingsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogInStepDef {

    @When("User taps on slide menu")
    public void userTapsOnSlideMenu() {
        new MenuPage().pressSettingsBtn();
    }

    @When("User taps on Log In slide button")
    public void userTapsOnLogInSlideButton() {
        new SettingsPage().pressLoginBtn();
    }

    @When("User enters username as {string}")
    public void userEntersUsernameAs(String username) throws InterruptedException {
        new LoginPage().enterUserName(username);
    }

    @When("User enters password as {string}")
    public void userEntersPasswordAs(String password) throws InterruptedException {
        new LoginPage().enterPassword(password);
    }

    @When("User taps on Login button")
    public void userTapsOnLoginButton() {
        new LoginPage().pressLoginBtnToProducts();
    }

    @Then("User should view the products page with title {string}")
    public void userShouldViewTheProductsPageWithTitle(String title) {
        Assert.assertEquals(new ProductsPage().getTitle(), title);
    }
}
