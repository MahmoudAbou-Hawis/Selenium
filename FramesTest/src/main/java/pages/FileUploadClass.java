package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadClass {
    private WebDriver driver;
    private By ChooseFile = By.id("file-upload");
    private By uploadFile = By.id("file-submit");
    private By TextElement = By.id("uploaded-files");
    public FileUploadClass(WebDriver driver)
    {
        this.driver = driver;
    }

    public void uploadFile(String path)
    {
        driver.findElement(ChooseFile).sendKeys(path);
        driver.findElement(uploadFile).click();
    }
    public String getText()
    {
        return driver.findElement(TextElement).getText();
    }
}
