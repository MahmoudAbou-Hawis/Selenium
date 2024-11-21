package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public  WindowManager(WebDriver driver)
    {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack()
    {
        navigate.back();;
    }

    public void goForward()
    {
        navigate.forward();
    }

    public void refreshPage()
    {
        navigate.refresh();
    }

    public void goTo(String url)
    {
        navigate.to(url);
    }

    public void goToWindow(int idx)
    {
        var windows = driver.getWindowHandles();
        int index = 0;
        for(String window  : windows)
        {
            if(index == idx)
            {
                driver.switchTo().window(window);
                break;
            }
            index++;
        }
    }
}
