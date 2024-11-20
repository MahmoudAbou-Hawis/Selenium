package DynamicLoadingTest;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTest extends BaseTests {

    @Test
    public void DynamicTest()
    {
        var page = homePage.clickDynamicLoading();
        var Example = page.clickExamplePage();
        String result = Example.getResultText();
        assertEquals(result,"Hello World!", "Hello World Doesn't appear");
    }
}
