package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTests {


    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage =homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(),"You successfully clicked an alert"
                ,"Result is incorrect");
    }
    @Test
    public void testGetTextFromAlert(){

        AlertsPage alertsPage =homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        Assert.assertEquals(text,"I am a JS Confirm"
                ,"Text is incorrect");
    }
    @Test
    public void testSetInputAlert(){
        AlertsPage alertsPage =homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text ="hello";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(),"You entered: " + text,"text is incorrect");


    }
}
