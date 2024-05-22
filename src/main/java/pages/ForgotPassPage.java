package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage {
    private WebDriver driver;
    private By emailField = By.id("email");      //there is a problem here
    private By retrivePassButton = By.id("form_submit");
    public ForgotPassPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public EmailSentPage clickRetrievePassword(){
        driver.findElement(retrivePassButton).click();
        return new EmailSentPage(driver);
    }
    public EmailSentPage retrievePassword(String email){
        enterEmail(email);
        return clickRetrievePassword();
    }

}
