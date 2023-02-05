package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utils.Browser.driver;

public class CheckoutStepTwo {
    private static final By HEADER_TITLE = By.xpath("//span[text()='Checkout: Overview']");
    private static final By FINISH_BUTTON = By.id("finish");

    /**
     *
     * @param expectedTitle Assert that provided header title is as expected
     * @param messageOnFailure The message that will appear in case of failure
     */
    public static void verifyPage(String expectedTitle, String messageOnFailure) {
        String actualTitle = driver.findElement(HEADER_TITLE).getText();
        Assert.assertEquals(actualTitle, expectedTitle, messageOnFailure);
    }

    /**
     * Clicks on finnish button
     */
    public static void clickFinish() {
        driver.findElement(FINISH_BUTTON).click();
    }
}
