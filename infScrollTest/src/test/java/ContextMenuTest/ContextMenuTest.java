package ContextMenuTest;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {

    @Test
    public void ContextMenu()
    {
        var page = homePage.clickContextMenu();
        page.RightClickInBOx();
        String msg = page.getAlertText();
        page.acceptAlert();
        assertEquals(msg,"You selected a context menu","Error in Alert in context page");
    }

}
