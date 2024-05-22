package dorpdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import java.util.List;

public class dropdownTests extends BaseTests {
    @Test
    public void testSelectedOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        String option ="Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String > selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"option not selected");
    }
}
