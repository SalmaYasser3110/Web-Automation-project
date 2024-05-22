package forgotPass;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPassPage;

public class ForgotPassTests extends BaseTests {
    @Test
    public void testRetrievePassword(){
        ForgotPassPage forgotPasswordPage = homePage.clickForgotPassword();
        EmailSentPage emailSentPage = forgotPasswordPage.retrievePassword("test@example,com");
        Assert.assertEquals(emailSentPage.getMessage(),"Your e-mail's been sent!","Message is incorrect");
    }
}
