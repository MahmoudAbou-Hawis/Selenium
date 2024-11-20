package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomaPage {
    private WebDriver driver;
    public HomaPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage clickFormAuthontication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public ForgetPassword clickForgetPassword()
    {
        clickLink("Forgot Password");
        return new ForgetPassword(driver);
    }

    public DropDownPage clickDropDown()
    {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickHovers()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    private void clickLink(String str)
    {
        driver.findElement(By.linkText(str)).click();
    }

    public KeyPresses clickKeyPresses()
    {
        clickLink("Key Presses");
        return new KeyPresses(driver);
    }

    public JavaScriptAlert clickJavaScriptAlert()
    {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlert(driver);
    }

    public HorizontalSlider clickHorizontalSlider()
    {
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
}
