package DropDown;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectOption()
    {
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.setFromDropDown("Option 1");
        var selection = dropDownPage.getSelectedOptions();
        assertEquals(selection.size(),1,"Incorrect number of selection");
    }
}
