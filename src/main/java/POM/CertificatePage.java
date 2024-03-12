package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CertificatePage {
    WebDriver driver;

    By certificateDurationEl = By.xpath("//input[@id='training_0_duration']");
    By certificateDurationTypeEl = By.xpath("//select[@id='training_0_type']");
    By nxtBttnEl = By.xpath("//button[@class='btn btn-secondary trainingExpNext nextBtn']");
    By certificatePageTitleEl = By.xpath("//legend[normalize-space()='Training Certificate (From Latest) (Min: 3 Year/s)']");

    public CertificatePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public String getCertificatePageTitleText() {
        return driver.findElement(certificatePageTitleEl).getText();
    }
    public void typeDuration(String duration) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(certificateDurationEl).sendKeys(duration);
        Thread.sleep(2000);
    }

    public void selectDurationType() {
        new Select(driver.findElement(certificateDurationTypeEl)).selectByVisibleText("YEAR");
    }

    public void nxtBttnClick() {
        driver.findElement(nxtBttnEl).click();
    }
}
