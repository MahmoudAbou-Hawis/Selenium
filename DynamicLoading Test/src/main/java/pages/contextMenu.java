package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class contextMenu {
    private WebDriver driver;
    private By box = By.id("hot-spot");

    public contextMenu(WebDriver driver)
    {
        this.driver = driver;
    }

    public void RightClickInBOx()
    {
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(box));
        action.perform();
    }

    public String getAlertText()
    {
       return driver.switchTo().alert().getText();
    }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
}
