package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlert;

import static org.testng.Assert.assertEquals;

public class Alerts extends BaseTests
{
    @Test
    public void TestAlert()
    {
        JavaScriptAlert page = homePage.clickJavaScriptAlert();
        page.clickButton(0);
        page.acceptAlert();
        assertEquals(page.getText(),"You successfully clicked an alert","wrong msg");
    }

    @Test
    public void testGetTextFromAlert()
    {
        var alert = homePage.clickJavaScriptAlert();
        alert.clickButton(1);
        String text = alert.getALertText();
        alert.CancelAlert();
        assertEquals(text,"I am a JS Confirm", "alert msg error");
        assertEquals(alert.getText(),"You clicked: Cancel","Error in result");
    }
    @Test
    public void promptAlertTest()
    {
        var alert = homePage.clickJavaScriptAlert();
        alert.clickButton(2);
        alert.setAlertString("Mahmoud Sofar");
        alert.acceptAlert();
        assertEquals(alert.getText(),"You entered: Mahmoud Sofar","error in entered msg");
    }
}
