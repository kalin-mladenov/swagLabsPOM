package components;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class Login {
    private final static String LOGIN_PAGE_URL = "https://www.saucedemo.com/";
    private final static By USERNAME_INPUT_FIELD =  By.id("user-name");
    private final static By PASSWORD_INPUT_FIELD =  By.id("password");
    private final static By LOGIN_BUTTON =  By.id("login-button");


    public static void openPage() {
        driver.get(LOGIN_PAGE_URL);
    }
    public static void userLogin(String username, String password) {
        driver.findElement(USERNAME_INPUT_FIELD).sendKeys(username);
        driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

    }


}
