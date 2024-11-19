package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPassword {
    private WebDriver driver;
    public ForgetPassword(WebDriver driver)
    {
        this.driver = driver;
    }

    public void RetrievePassword(String email)
    {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.xpath("//button[@class='radius']")).click();
    }

    public String getMsg()
    {
        return driver.findElement(By.tagName("h1")).getText();
    }
}
