package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    private WebDriver driver;

    public KeyPresses(WebDriver driver)
    {
        this.driver = driver;
    }

    public void SetString(String str)
    {
        driver.findElement(By.id("target")).sendKeys(str);
    }

    public String getText()
    {
        return driver.findElement(By.id("result")).getText();
    }

    public void writePi()
    {
        driver.findElement(By.id("target")).sendKeys(Keys.chord(Keys.ALT , "p") + "3.14");
    }

}
