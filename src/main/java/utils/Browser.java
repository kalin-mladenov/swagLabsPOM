package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {
    public static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void quit() {
        driver.quit();
    }
}
