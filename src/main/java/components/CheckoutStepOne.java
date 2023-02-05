package components;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utils.Browser.driver;

public class CheckoutStepOne {
    private static final By HEADER_TITLE = By.xpath("//span[text()='Checkout: Your Information']");
    private static final By FIRST_NAME = By.id("first-name");
    private static final By LAST_NAME = By.id("last-name");
    private static final By ZIP_POSTAL_CODE = By.id("postal-code");
    private static final By CONTINUE_BUTTON =By.id("continue");

    /**
     *
     * @param expectedTitle Assert that provided header title is as expected
     * @param messageOnFailure The message that will appear in case of failure
     */
    public static void verifyPage(String expectedTitle, String messageOnFailure) {
        String actualHeaderTitle = driver.findElement(HEADER_TITLE).getText();
        Assert.assertEquals(expectedTitle, actualHeaderTitle, messageOnFailure);
    }

    /**
     *
     * @param firstName  the first name you would like to enter
     * @param lastName   the last name you would like to enter
     * @param postalCode the postal code you would like to enter
     */
    public static void fillYourInformation(String firstName, String lastName, String postalCode) {
        driver.findElement(FIRST_NAME).sendKeys(firstName);
        driver.findElement(LAST_NAME).sendKeys(lastName);
        driver.findElement(ZIP_POSTAL_CODE).sendKeys(postalCode);
    }

    /**
     * click on continue button
     */
    public static void clickContinue() {
        driver.findElement(CONTINUE_BUTTON).click();
    }
}
