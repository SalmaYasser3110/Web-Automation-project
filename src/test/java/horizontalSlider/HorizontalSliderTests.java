package horizontalSlider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSliderRightTo4(){
        String  sliderValue ="4";
        HorizontalSliderPage horizontalSliderPage= homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSliderRight(sliderValue);
        Assert.assertEquals(horizontalSliderPage.getRangeValue(),sliderValue
                ,"Range number is incorrect");
    }
}
