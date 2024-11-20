package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JavaScriptAlert {
   private WebDriver driver;
   private By AlertButton = By.xpath("//button[.='Click for JS Alert']");
    private List<WebElement> elements ;

    public JavaScriptAlert(WebDriver driver)
   {
       this.driver = driver;
       elements =  driver.findElements(By.xpath("//button"));
   }
   public void clickButton(int idx)
   {
        elements.get(idx).click();
   }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public String getText()
    {
        return driver.findElement(By.id("result")).getText();
    }

    public void CancelAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public String getALertText()
    {
        return driver.switchTo().alert().getText();
    }

    public void setAlertString(String str)
    {
        driver.switchTo().alert().sendKeys(str);
    }
}
