package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HorizontalSlider {
    private WebDriver driver;
    By range = By.xpath("//input[@type='range']");
    By Text = By.id("range");
    public HorizontalSlider(WebDriver driver)
    {
        this.driver = driver;
    }
    public void selectTheBar()
    {
        driver.findElement(range).click();
    }
    public void changeValue()
    {
        driver.findElement(range).sendKeys(Keys.RIGHT);
    }

    public String getText()
    {
        return  driver.findElement(Text).getText();
    }
}
