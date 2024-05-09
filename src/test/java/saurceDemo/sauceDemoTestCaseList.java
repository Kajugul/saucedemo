package saurceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Cart;
import pages.Checkout;
import pages.Inventory;
import pages.Login;

public class sauceDemoTestCaseList
{
    WebDriver driver = null;
    @BeforeClass
    public void initBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void test_01_login()
    {
        Login login = new Login(driver);
        login.enterUserName();
        login.enterPassword();
        login.clickOnSubmitButton();
    }

    @AfterClass
    public void quitBrowser()
    {
        driver.quit();
    }

}
