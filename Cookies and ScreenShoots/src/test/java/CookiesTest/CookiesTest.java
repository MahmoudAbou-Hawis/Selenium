package CookiesTest;

import Base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CookiesTest extends BaseTests {

    @Test
    public void TestCookie()
    {
        deleteCookies("optimizelyBuckets");
        boolean flag  = true;
        for(Cookie cookie : getCookies())
        {
            if(cookie.getValue().equals("optimizelyBuckets"))
            {
                flag = false;
                break;
            }
        }
        assertTrue(flag,"Cookie " +"optimizelyBuckets not deleted");
    }
}
