package com.qa.pages;


import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsPage extends MenuPage {

    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement msgPageTitle;

    public String getTitle(){
        return getText(msgPageTitle, "Product page title is:");
    }

    public String getProductTitle(String title) throws Exception {
                return getText(andScrollToElementUsingUiScrollable("text", title), "Product title is: " + title);
    }

    public ProductDetailsPage pressProduct(String productName){
        click(By.xpath("//android.widget.ImageView[@content-desc=" + productName + "])"), "Clicking product with name " + productName);
        return new ProductDetailsPage();
    }
}
