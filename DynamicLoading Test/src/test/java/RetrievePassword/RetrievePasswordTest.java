package RetrievePassword;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgetPassword;

import static org.testng.Assert.assertEquals;

public class RetrievePasswordTest extends BaseTests
{
    @Test
    public void RetrievePassword()
    {
        ForgetPassword password = homePage.clickForgetPassword();
        password.RetrievePassword("ahmed");
        assertEquals(password.getMsg(),"email sent","Not Expected");
    }
}
