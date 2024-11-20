package testKeyPresses;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPresses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyPressesTest extends BaseTests {

    @Test
    public void BackSpaceTest()
    {
        var KeyPresses =  homePage.clickKeyPresses();
        KeyPresses.SetString("A" + Keys.BACK_SPACE);
        assertEquals(KeyPresses.getText(),"You entered: BACK_SPACE","Backspace msg not appeared");
    }
    @Test
    public void PiTest()
    {
        var keyPage = homePage.clickKeyPresses();
        keyPage.writePi();
    }
}
