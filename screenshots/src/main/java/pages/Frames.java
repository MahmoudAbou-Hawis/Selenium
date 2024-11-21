package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class Frames {
    private WebDriver driver;
    private By NestedFrames = By.linkText("Nested Frames");
    public Frames(WebDriver driver)
    {
        this.driver = driver;
    }

    public NestedFrames ClickNestedFrames()
    {
        driver.findElement(NestedFrames).click();
        return new NestedFrames(driver);
    }



    public class NestedFrames
    {
        private WebDriver driver;
        List<WebElement> elements ;
        public NestedFrames(WebDriver driver)
        {
            this.driver = driver;
        }
        public String getLeftFrameText(String name,String frame)
        {
            String result;
            if(frame.equals("up"))
            {
                EnterFrame("frame-top");
            }
            EnterFrame("frame-" + name);
            result = driver.findElement(By.tagName("body")).getText();
            ExitFrame();
            if(frame.equals("up"))
            {
                ExitFrame();;
            }
            return result;
        }

        public void  EnterFrame(String FrameName)
        {
            driver.switchTo().frame(FrameName);
        }
        public void ExitFrame()
        {
            driver.switchTo().parentFrame();
        }
    }
}
