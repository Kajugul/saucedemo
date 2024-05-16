package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
    WebDriver driver;

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement pass;

    @FindBy(xpath = ".//input[@id='login-button']")
    private WebElement loginButton;

    public Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName()
    {
        username.sendKeys("standard_user");
    }

    public void enterPassword()
    {
        pass.sendKeys("secret_sauce");
    }

    public void clickOnSubmitButton()
    {
        loginButton.click();
    }

}
