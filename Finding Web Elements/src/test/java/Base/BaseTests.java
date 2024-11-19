package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver =  new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement element = driver.findElement(By.linkText("Inputs"));
        element.click();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'/shifting_content')]"));
        element.click();

        element = driver.findElement(By.xpath("//a[contains(@href,'/shifting_content/menu')]"));
        element.click();

        List<WebElement> elements = driver.findElements(By.tagName("li"));

        System.out.println("The Number of elemnts = " + elements.size());

        driver.quit();
    }
    public static void main(String[] args) {
            BaseTests test = new BaseTests();
            test.SetUp();
    }
}

