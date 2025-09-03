package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsStepDef {
    @When("User clicks on product with text {string}")
    public void userClicksOnProductWithText(String text) {
        new ProductsPage().pressProduct(text);
    }

    @Then("User should view product description as {string}")
    public void userShouldViewProductDescriptionAs(String desc) {
        System.out.println("Expected description is: " + desc);
        Assert.assertEquals(new ProductDetailsPage().getProductDescription(), desc);
    }

    @When("User clicks on Sorting button")
    public void userClicksOnSortingButton() {
        new MenuPage().pressSortingBtn();
    }

    @And("User clicks on Sort By Descending Name button")
    public void userClicksOnSortByDescendingNameButton() {
        new MenuPage().pressSortByDescendingNameBtn();
    }


    @Then("User should view products ordered by Descending Name")
    public void userShouldViewProductsOrderedByDescendingName() {
        List<String> actualProductTitles = new ProductsPage().getAllProductTitles();

        // Copy the list and order in descendant
        List<String> expectedProductTitles = new ArrayList<>(actualProductTitles);
        expectedProductTitles.sort(Collections.reverseOrder());

        // Debugging: Show both lists
        System.out.println("Obtained list from the app (not ordered): " + actualProductTitles);
        System.out.println("Expected list (Ordered by descendant): " + expectedProductTitles);

        Assert.assertEquals("Products are not in descendant order", expectedProductTitles, actualProductTitles);
    }

    @And("User clicks on Sort By Ascendant Price button")
    public void userClicksOnSortByAscendantPriceButton() {
        new MenuPage().pressSortByAscendingPriceBtn();
    }

    @Then("User should view products ordered by Ascendant Price")
    public void userShouldViewProductsOrderedByAscendantPrice() {
        List<Double> actualPrices = new ProductsPage().getAllProductPrices();
        List<Double> expectedPrices = new ArrayList<>(actualPrices);

        // Ordering expected list on ascendant order
        expectedPrices.sort(Double::compareTo);

        System.out.println("Obtained prices from the app: " + actualPrices);
        System.out.println("Expected prices on ascendant order: " + expectedPrices);

        Assert.assertEquals("Products are not ordered by ascendant price", expectedPrices, actualPrices);
    }

    @And("User clicks on Add to Cart button")
    public void userClicksOnAddToCartButton() throws Exception {
        new ProductDetailsPage().pressAddToCardBtn();
    }

    @And("User press Back button")
    public void userPressBackButton() {
        new BasePage().pressBackButton();
    }


    @And("User clicks on Cart button")
    public void userClicksOnCartButton() {
        new MenuPage().pressCartBtn();
    }

    @And("User clicks on Proceed to checkout button")
    public void userClicksOnProceedToCheckoutButton() {
        new CartPage().pressCheckout();
    }

    @When("User clicks on the product on the position {int}")
    public void userClicksOnTheProductOnThePosition(int i) {
        new ProductsPage().pressProductOnPosition(i);
    }

    @And("User clicks on five star rating button")
    public void userClicksOnFiveStarRatingButton() {
        new ProductDetailsPage().pressRateBtn();
    }

    @Then("User should view a popup message as {string}")
    public void userShouldViewAPopupMessageAs(String msg) {
        System.out.println("Expected message is: " + msg);
        Assert.assertEquals(new ProductDetailsPage().getSuccessfulReviewText(), msg);
        new ProductDetailsPage().pressOkSuccessfulReview();
    }

    @And("User clicks on Remove Item")
    public void userClicksOnRemoveItem() throws Exception {
        new CartPage().pressRemoveItem();
    }

    @Then("User should view empty cart with text {string}")
    public void userShouldViewEmptyCartWithText(String txt) {
        System.out.println("Expected text is: " + txt);
        Assert.assertEquals(new CartPage().getPageName(), txt);
    }

    @And("User clicks on Drawing slide button")
    public void userClicksOnDrawingSlideButton() {
        new SettingsPage().pressDrawingBtn();
    }

    @And("User makes some drawing")
    public void userMakesSomeDrawing() throws InterruptedException {
        new DrawingPage().drawSimpleLine();
    }

    @And("User presses Save button")
    public void userPressesSaveButton() {
        new DrawingPage().pressSaveDrawingBtn();
    }

    @Then("User should view Successful Alert with text {string}")
    public void userShouldViewSuccessfulAlertWithText(String text) {
        System.out.println("Expected text is: " + text);
        Assert.assertEquals(new DrawingPage().getSuccessfulSaveMsg(), text);
        new DrawingPage().pressOkSaveDrawingBtn();
    }

    @And("User allows access to app")
    public void userAllowsAccessToApp() {
        new DrawingPage().pressAllowPermissionBtn();
    }

    @And("User clicks on Reset App State Slider Button")
    public void userClicksOnResetAppStateSliderButton() {
        new SettingsPage().pressResetAppBtn();
    }

    @And("User clicks on Reset App Confirm Button")
    public void userClicksOnResetAppConfirmButton() {
        new SettingsPage().pressConfirmResetBtn();
    }

    @Then("User should view Successful App Reset Alert As {string}")
    public void userShouldViewSuccessfulAppResetAlertAs(String txt) {
        System.out.println("Expected text is: " + txt);
        Assert.assertEquals(new SettingsPage().getSuccessfulResetTxt(), txt);
        new SettingsPage().pressOkSuccessfulResetBtn();
    }
}
