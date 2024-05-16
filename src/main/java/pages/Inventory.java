package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventory
{
    WebDriver driver = null;

    public Inventory(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement backPack;

    public void selectBackPack()
    {
        backPack.click();
    }

    public void clickOnCart()
    {

    }


}
