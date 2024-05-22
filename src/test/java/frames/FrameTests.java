package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditor;

public class FrameTests extends BaseTests {
    @Test
    public void testWyswing(){
        WYSIWYGEditor editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();
        String text = "Hello world";
        editorPage.setTextArea(text);
        Assert.assertEquals(editorPage.getTexFromEditor(),text,"text is incorrect");
    }
}
