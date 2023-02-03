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
    public static void verifyPage(String expectedTitle, String messageOnFailure) {
        String actualHeaderTitle = driver.findElement(HEADER_TITLE).getText();
        Assert.assertEquals(expectedTitle, actualHeaderTitle, messageOnFailure);
    }

    public static void fillYourInformation(String firstName, String lastName, String postalCode) {
        driver.findElement(FIRST_NAME).sendKeys(firstName);
        driver.findElement(LAST_NAME).sendKeys(lastName);
        driver.findElement(ZIP_POSTAL_CODE).sendKeys(postalCode);
    }

    public static void clickContinue() {
        driver.findElement(CONTINUE_BUTTON).click();
    }
}
