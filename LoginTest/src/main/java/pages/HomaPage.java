package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomaPage {
    private By formAuthenticatioLink = By.xpath("//a[.='Form Authentication']");
    private WebDriver driver;
    public HomaPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage clickFormAuthontication()
    {
        driver.findElement(formAuthenticatioLink).click();
        return new LoginPage(driver);
    }
}
