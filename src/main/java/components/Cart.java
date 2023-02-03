package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utils.Browser.driver;

public class Cart {
    private static final By HEADER_TITLE = By.xpath("//span[text()='Your Cart']");
    private static final By BACKPACK_INVENTORY_NAME = By.xpath("//div[text()='Sauce Labs Backpack']");
    private static final By CHECKOUT_BUTTON = By.id("checkout");
    public static void verifyCartPage(String expectedTitle, String messageOnFailure) {
        String actualHeaderTitle = driver.findElement(HEADER_TITLE).getText();
        Assert.assertEquals(actualHeaderTitle, expectedTitle, messageOnFailure);
    }

    public static void verifyAddedItem(String expectedBackpackName, String messageOnFailure) {
        String actualBackpackName = driver.findElement(BACKPACK_INVENTORY_NAME).getText();
        Assert.assertEquals(actualBackpackName, expectedBackpackName, messageOnFailure);
    }

    public static void checkout() {
        driver.findElement(CHECKOUT_BUTTON).click();
    }
}
