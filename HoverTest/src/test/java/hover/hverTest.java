package hover;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class hverTest extends BaseTests {

    @Test
    public void testHoverUser1()
    {
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","caption not correct");
        assertEquals(caption.getLinkText(),"View profile","link text not right");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link not correct");
    }
}
