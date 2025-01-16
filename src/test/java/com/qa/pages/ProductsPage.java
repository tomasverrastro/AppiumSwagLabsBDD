package com.qa.pages;


import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductsPage extends MenuPage {

    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement msgPageTitle;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private List<WebElement> visibleProductTitles;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/priceTV")
    private List<WebElement> visibleProductPrices;

    public String getTitle(){
        return getText(msgPageTitle, "Product page title is:");
    }

    public String getProductTitle(String title) throws Exception {
                return getText(andScrollToElementUsingUiScrollable("text", title), "Product title is: " + title);
    }

    /* Doesn't work if you need scroll

    public ProductDetailsPage pressProduct(String productName){
        click(By.xpath("//android.widget.ImageView[@content-desc=\""+ productName + "\"]"), "Clicking product with name " + productName);
        return new ProductDetailsPage();
    }
    */
    public ProductDetailsPage pressProduct(String productName) {
        click(andScrollToElementUsingUiScrollable("description", productName), "press " + productName + " link");
        return new ProductDetailsPage();
    }

    public List<String> getAllProductTitles() {
        List<String> allTitles = new ArrayList<>();
        int previousSize = 0;

        while (true) {
            for (WebElement product : visibleProductTitles) {
                String title = product.getText();
                if (!allTitles.contains(title)) { // Avoid duplicates but maintain the product order
                    allTitles.add(title);
                }
            }

            // Check if it isn't new products
            if (allTitles.size() == previousSize) {
                break;
            }
            previousSize = allTitles.size();
            scrollDown();
        }

        System.out.println("Complete obtained product list: " + allTitles);
        return allTitles;
    }

    public List<Double> getAllProductPrices() {
        List<Double> prices = new ArrayList<>();
        int previousSize = 0;

        while (true) {
            // Add visible prices with no duplicates
            for (WebElement priceElement : visibleProductPrices) {
                String priceText = priceElement.getText().replace("$ ", ""); // Quit "$ "
                double price = Double.parseDouble(priceText); // Convert to double

                // Avoid duplicates if its already on the list
                if (!prices.contains(price)) {
                    prices.add(price);
                }
            }

            // Check if there is new products
            if (prices.size() == previousSize) {
                break; // If not new products, finish scroll
            }
            previousSize = prices.size();

            scrollDown();
        }

        System.out.println("Complete price list: " + prices);
        return prices;
    }

    public ProductDetailsPage pressProductOnPosition(int pos) {
        click(By.xpath("(//android.widget.ImageView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productIV\"])[" + pos + "]"), "Clicking product on position " + pos);
        return new ProductDetailsPage();
    }
}
