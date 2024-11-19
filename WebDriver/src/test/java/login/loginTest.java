package login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class loginTest extends BaseTests {
    @Test
    public void testSuccessfulLogin()
    {
       LoginPage loginPage =  homePage.clickFormAuthontication();
       SecureAreaPage areaPage = loginPage.Login("tomsmith","SuperSecretPassword!");
       assertEquals(areaPage.getAlertMsg(),"You logged into a secure area!\n" +
               "×","Result = " + areaPage.getAlertMsg());
    }
}
