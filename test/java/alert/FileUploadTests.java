package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUpload = homePage.clickFileUploader();
        String absolutePathOfFile = "C:/Users/lilit/Downloads/pic1.png";
        fileUpload.uploadFile(absolutePathOfFile);
        assertEquals(fileUpload.getUploadedFiles(), "pic1.png", "File names doesn't match");
    }
}
