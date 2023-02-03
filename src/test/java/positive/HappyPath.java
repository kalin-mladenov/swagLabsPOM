package positive;

import components.*;
import org.testng.annotations.*;
import utils.Browser;

import static components.CheckoutComplete.verifyOrder;


public class HappyPath {

    @BeforeMethod
    public void setup() {
        Browser.openBrowser();


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        Browser.quit();
    }

    @Test
    public void successfulLogin() {
        Login.openPage();
        Login.userLogin("standard_user", "secret_sauce");
        Inventory.verifyProductsPage("PRODUCTS", " Unsuccessful login");
    }

    @Test
    public void addToCartBackpack() {
        successfulLogin();
        Inventory.addToCartBackpack();
        Inventory.goToCart();
        Cart.verifyCartPage("YOUR CART", "Cart page not loaded");
        Cart.verifyAddedItem("Sauce Labs Backpack", "Item not found in the Cart");
    }

    @Test
    public void checkout() {
        addToCartBackpack();
        Cart.checkout();
        CheckoutStepOne.verifyPage("CHECKOUT: YOUR INFORMATION", "Checkout page one not loaded");
    }

    @Test
    public void yourInformation() {
        checkout();
        CheckoutStepOne.fillYourInformation("Kalin", "Mladenov", "11111");
        CheckoutStepOne.clickContinue();
        CheckoutStepTwo.verifyPage("CHECKOUT: OVERVIEW", "Checkout page two not loaded");
    }

    @Test
    public void finish() {
        yourInformation();
        CheckoutStepTwo.clickFinish();


    }

    @Test
    public void verifyOrderComplete() {
        finish();
        verifyOrder("THANK YOU FOR YOUR ORDER", "Error with order completion");


    }

    @DataProvider
    public Object[][] testData() {
        String[][] testData = {
                {"111", "CHECKOUT: OVERVIEW"},
                {"222", "CHECKOUT: OVERVIEW"},
                {"4", "CHECKOUT: OVERVIEW"},
                {"5", "CHECKOUT: OVERVIEW"},
                {"6", "..."},
                {"333", "CHECKOUT: OVERVIEW"},
                {"333", "CHECKOUT: OVERVIEW"},
        };
        return testData;
    }

    @Test(dataProvider = "testData")
    public void dataDriven(String post, String expect) {
        checkout();
        CheckoutStepOne.fillYourInformation("Kalin", "Mladenov", post);
        CheckoutStepOne.clickContinue();
        CheckoutStepTwo.verifyPage(expect, "Checkout page two not loaded");
    }
}