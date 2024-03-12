package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class JobExperiencePage {
    WebDriver driver;

    By orgEl = By.xpath("//input[@id='jobexperience_0_organization']");
    By clickDesignationEl = By.xpath("//span[@id='select2-jobexperience_0_designation-container']");
    By typeDesignationEl = By.xpath("//input[@role='textbox']");
    By jobStartDateEl = By.xpath("//input[@id='jobexperience_0_start_date']");
    By crrntDateEl = By.xpath("//input[contains(@name,'jobexperience[0][current]')]");
    By jobEndDateEl = By.xpath("//input[@id='jobexperience_0_end_date']");
    By jobAddressEl = By.xpath("//input[@id='jobexperience_0_address']");
    By buttonNextEl = By.xpath("//button[@class='btn btn-secondary jobExpNext nextBtn']");
    By jobExpTitleEl = By.xpath("//legend[contains(text(),'Job Experience (From Latest)')]");

    public JobExperiencePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public String getJobExpPageTitleText() {
        return driver.findElement(jobExpTitleEl).getText();
    }

    public void typeOrgName(String orgName) throws InterruptedException {
        driver.findElement(orgEl).sendKeys(orgName);
    }

    public void selectDesignation(String designation) throws InterruptedException {
        driver.findElement(clickDesignationEl).click();
        Thread.sleep(2000);
        driver.findElement(typeDesignationEl).sendKeys(designation, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void typeJobAddress(String jobAddress) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(jobAddressEl).sendKeys(jobAddress);
        Thread.sleep(2000);
    }

    public void SelectStartDate(String startDate) throws InterruptedException {
        WebElement startDateEl = driver.findElement(jobStartDateEl);
        Actions actions = new Actions(driver);
        startDateEl.clear();
        startDateEl.click();
        actions.sendKeys(startDate).perform();
    }


    public void selectEndDate() {
        driver.findElement(crrntDateEl).click();
    }

    public void proceedToNext() {
        driver.findElement(buttonNextEl).click();
    }

}
