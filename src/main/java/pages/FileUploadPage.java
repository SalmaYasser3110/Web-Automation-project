package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUploadPage {
    private WebDriver driver;
    private By uploadField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.className("panel text-center");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadFile(String absolutePathFile){
        driver.findElement(uploadField).sendKeys(absolutePathFile);
        clickUploadButton();
    }
    private void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFiles(){
        //return driver.findElement(uploadedFiles).getText();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(uploadedFiles))).getText();
    }

}
