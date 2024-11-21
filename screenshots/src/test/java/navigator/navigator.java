package navigator;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class navigator extends BaseTests {

    @Test
    public void navigateTest()
    {
        var page = homePage.clickDynamicLoading().OpenExamplePageInNewTap();
         getWindowManger().goToWindow(1);
        assertTrue(page.isButtonDisplayed(),"Button Not Displayed");
    }
}
