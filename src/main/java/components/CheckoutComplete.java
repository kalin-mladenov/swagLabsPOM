package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utils.Browser.driver;

public class CheckoutComplete {
    private static final By COMPLETE_ORDER_MSG = By.className("complete-header");

    /**
     *
     * @param expectedMessage Assert that provided header title is as expected
     * @param messageOnFailure The message that will appear in case of failure
     */

    public static void verifyOrder(String expectedMessage, String messageOnFailure) {
        String actualMessage = driver.findElement(COMPLETE_ORDER_MSG).getText();
        Assert.assertEquals(actualMessage, expectedMessage, messageOnFailure);
    }
}
