package fileUpload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        FileUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\downloadss\\chromedriver");
        Assert.assertEquals(uploadPage.getUploadedFiles(),"chromedriver-win64.zip","uploaded File is incorrect");
    }
}
