package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By UserName = By.xpath("//input[@name='username']");
    private By Password = By.id("password");
    private By logninButton = By.xpath("//button[contains(@class,'radius')]");
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public SecureAreaPage Login(String user,String password)
    {
        driver.findElement(UserName).sendKeys(user);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(logninButton).click();
        return new SecureAreaPage(driver);
    }
}
