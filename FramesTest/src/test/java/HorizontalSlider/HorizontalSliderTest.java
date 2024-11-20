package HorizontalSlider;

import Base.BaseTests;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void HorizontalSlider() throws InterruptedException {
        var Herozintal = homePage.clickHorizontalSlider();
        Herozintal.selectTheBar();
        for (int i = 0 ; i < 3 ; i++)
        {
            Herozintal.changeValue();
        }

        assertEquals(Herozintal.getText(),"4","slider value not equal to 4");
    }
}
