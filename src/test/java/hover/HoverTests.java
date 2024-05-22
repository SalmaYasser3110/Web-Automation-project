package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        HoversPage hoverPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoverPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed()
                ,"Caption is not displayed");
        Assert.assertEquals(caption.getTitle(),"name: user1"
                ,"Caption title is incorrect");
        Assert.assertEquals(caption.getLinkText(),"View profile"
                ,"Caption link text is incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1")
                ,"Link is incorrect");
    }
}
