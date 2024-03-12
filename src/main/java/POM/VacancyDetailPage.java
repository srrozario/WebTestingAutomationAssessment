package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class VacancyDetailPage {

    WebDriver driver;

    By applyNowBttn = By.xpath("//strong[contains(text(),'Apply')]");
    By continueWithoutLoginBttn = By.xpath("//a[normalize-space()='Continue without Login']");

    public VacancyDetailPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void applyNowBttnClick() throws InterruptedException {
        driver.findElement(applyNowBttn).click();
    }

    public void continueWithoutLoginBttnClick() throws InterruptedException {
        driver.findElement(continueWithoutLoginBttn).click();
    }
}
