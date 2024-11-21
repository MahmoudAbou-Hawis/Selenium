package Base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomaPage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class BaseTests {
    private EventFiringWebDriver driver;
    protected HomaPage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver =  new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
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

    public WindowManager getWindowManger()
    {
        return new WindowManager(driver);
    }


    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png" ));
                System.out.println(screenshot.getAbsoluteFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

        private ChromeOptions getChromeOptions()
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-info");
            options.setHeadless(true);
            return options;
        }

        protected void SetCookie()
        {
            Cookie cookie = new Cookie.Builder("password","123456789")
                    .domain("https://the-internet.herokuapp.com").build();
            driver.manage().addCookie(cookie);
        }

        protected Set<Cookie> getCookies()
        {
            return  driver.manage().getCookies();
        }

        protected void deleteCookies(String name)
        {
            driver.manage().deleteCookieNamed(name);
        }
}

