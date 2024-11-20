package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoading {
    private WebDriver driver;
    private By exampleButton = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoading(WebDriver driver)
    {
        this.driver = driver;
    }
    public ExamplePage clickExamplePage()
    {
        driver.findElement(exampleButton).click();
        return new ExamplePage(driver);
    }


    public class ExamplePage
    {
        private WebDriver driver;
        private By statButton = By.xpath("//button");
        public ExamplePage(WebDriver driver)
        {
            this.driver = driver;
        }

        public String getResultText()
        {
            driver.findElement(statButton).click();
            WebDriverWait wait = new WebDriverWait(driver,7);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
            return driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        }

    }
}
