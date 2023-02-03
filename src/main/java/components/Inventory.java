package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utils.Browser.driver;

public class Inventory {
    private final static By HEADER_TITLE =  By.className("title");
    private final static By BACKPACK_ADD_TO_CART = By.id("add-to-cart-sauce-labs-backpack");
    private final static By CART_ICON = By.className("shopping_cart_link");
    public static void verifyProductsPage(String expectedTitle, String messageOnFailure) {
       String actualTitle = driver.findElement(HEADER_TITLE).getText();
        Assert.assertEquals(actualTitle, expectedTitle, messageOnFailure);
    }


    public static void addToCartBackpack() {
        driver.findElement(BACKPACK_ADD_TO_CART).click();
    }

    public static void goToCart() {
        driver.findElement(CART_ICON).click();
    }
}
