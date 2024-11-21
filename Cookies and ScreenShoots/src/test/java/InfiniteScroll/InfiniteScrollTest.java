package InfiniteScroll;

import Base.BaseTests;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTests {

    @Test
    public void InfiniteScrollTest()
    {
        var page = homePage.clickInfScroll();
        System.out.println(page.getParagraph(6));
    }
}
