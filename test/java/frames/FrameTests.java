package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyng(){
        var editorPage = homePage.clickWysiwyngEditor();
        editorPage.clearTextArea();
        String text1 = "hello";
        String text2 = "Madrid";
        editorPage.setTextArea(text1);
        editorPage.increaseIndentButton();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Texts do not match");
    }
}
