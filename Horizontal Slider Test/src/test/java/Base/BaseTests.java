package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomaPage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomaPage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver =  new ChromeDriver();
        homePage = new HomaPage(driver);
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void EndTest()
    {
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

}

