package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    WebDriver driver;
    private By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public FigureCaption hoverOverFigure(int idx)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("(//div[@class='figure'])" + '[' + idx +']')));
        actions.perform();
        return new FigureCaption(driver.findElements(boxCaption).get(idx - 1));
    }

    public class FigureCaption
    {
        private WebElement caption;
        private By Header = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaption(WebElement caption)
        {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed()
        {
            return caption.isDisplayed();
        }
        public String getTitle()
        {
            return caption.findElement(Header).getText();
        }

        public String getLink()
        {
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText()
        {
            return caption.findElement(link).getText();
        }
    }
}
