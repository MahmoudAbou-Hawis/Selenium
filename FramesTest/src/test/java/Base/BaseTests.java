package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
        goHome();
    }

    @AfterClass
    public void EndTest()
    {
        driver.quit();
    }

    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }

}

