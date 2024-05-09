package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login
{
    WebDriver driver;
    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = ".//input[@id='login-button']")
    private WebElement loginButton;


    public void enterUserName()
    {
        driver.findElement((By) username).sendKeys("standard_user");
    }

    public void enterPassword()
    {
        driver.findElement((By) password).sendKeys("secret_sauce");
    }

    public void clickOnSubmitButton()
    {
        driver.findElement((By) loginButton);
    }

}
