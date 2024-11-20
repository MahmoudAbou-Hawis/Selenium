package FrameTest;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.Frames;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTests {

    @Test
    public void NestedFrame()
    {
        var page = homePage.clickFrames();
        var NestedPage = page.ClickNestedFrames();
        String LeftName = NestedPage.getLeftFrameText("left","up");
        String BottomName = NestedPage.getLeftFrameText("bottom","down");
        assertEquals(LeftName ,"LEFT","the  left  frame string not equal 'LEFT'");
        assertEquals(BottomName,"BOTTOM","the bottom frame string not equal 'Bottom'");
    }

}
