package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScroll {
    private WebDriver driver;

    public InfiniteScroll(WebDriver driver) {
        this.driver = driver;
    }

    public String getParagraph(int idx)
    {
         String script = "window.scrollTo(0, document.body.scrollHeight)";
         var js = (JavascriptExecutor)driver;
         int number = getNumberOfParagraphs();
         while(number< idx)
         {
             js.executeScript(script);
             number = getNumberOfParagraphs();
         }
         return driver.findElements(By.className("jscroll-added")).get(idx - 1).getText();
    }
    private int getNumberOfParagraphs()
    {
        return driver.findElements(By.className("jscroll-added")).size();
    }

}
