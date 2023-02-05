package components;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class Login {
    private final static String LOGIN_PAGE_URL = "https://www.saucedemo.com/";
    private final static By USERNAME_INPUT_FIELD =  By.id("user-name");
    private final static By PASSWORD_INPUT_FIELD =  By.id("password");
    private final static By LOGIN_BUTTON =  By.id("login-button");

    /**
     * Opens the login page of https://www.saucedemo.com/
     */
    public static void openPage() {
        driver.get(LOGIN_PAGE_URL);
    }

    /**
     *
     * @param username the username you would like to log in
     * @param password the password you would like to log in
     * and click the login button
     */
    public static void userLogin(String username, String password) {
        driver.findElement(USERNAME_INPUT_FIELD).sendKeys(username);
        driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

    }


}
