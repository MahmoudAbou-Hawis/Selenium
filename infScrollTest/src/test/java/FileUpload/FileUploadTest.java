package FileUpload;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void FileUpload()
    {
        var page = homePage.clickFileUpload();
        page.uploadFile("C:\\Users\\Mahmoud Sofar\\Downloads\\CV.pdf");
        assertEquals(page.getText(),"CV.pdf","Error in uploadFile");
    }
}
