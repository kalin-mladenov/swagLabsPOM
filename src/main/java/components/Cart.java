package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utils.Browser.driver;

public class Cart {
    private static final By HEADER_TITLE = By.xpath("//span[text()='Your Cart']");
    private static final By BACKPACK_INVENTORY_NAME = By.xpath("//div[text()='Sauce Labs Backpack']");
    private static final By CHECKOUT_BUTTON = By.id("checkout");

    /**
     *
     * @param expectedTitle Assert that provided header title is as expected
     * @param messageOnFailure The message that will appear in case of failure
     */
    public static void verifyCartPage(String expectedTitle, String messageOnFailure) {
        String actualHeaderTitle = driver.findElement(HEADER_TITLE).getText();
        Assert.assertEquals(actualHeaderTitle, expectedTitle, messageOnFailure);
    }

    /**
     *
     * @param expectedBackpackName Asserts that backpack inventory name is present in cart
     * @param messageOnFailure The message that will appear in case of failure
     */
    public static void verifyAddedItem(String expectedBackpackName, String messageOnFailure) {
        String actualBackpackName = driver.findElement(BACKPACK_INVENTORY_NAME).getText();
        Assert.assertEquals(actualBackpackName, expectedBackpackName, messageOnFailure);
    }

    /**
     * Clicks on checkout button
     */
    public static void checkout() {
        driver.findElement(CHECKOUT_BUTTON).click();
    }
}
