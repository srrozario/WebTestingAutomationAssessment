package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddressPage {
    WebDriver driver;

    By divisionEl = By.xpath("//select[@id='permanent_division']");
    By districtEl = By.xpath("//select[@id='permanent_district']");
    By thanaEl = By.xpath("//span[@id='select2-permanent_thana-container']");
    By thanaEl2 = By.xpath("//input[@role='textbox']");
    By postOfficeEl = By.xpath("//input[@id='permanent_post_office_name']");
    By postCodeEl = By.xpath("//input[@id='permanent_post_code']");
    By addressEl = By.xpath("//input[@id='permanent_address']");
    By sameAsEl = By.xpath("//label[@for='same_as_permanent_address']");
    By nextBttnEl = By.xpath("//div[@id='enable_after_district_verification']//button[@type='button'][normalize-space()='Next']");
    By addressPageFirstSectionEl = By.xpath("//legend[normalize-space()='Permanent Address']");

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public String getAddressPageFirstSectionTitle() {
        return driver.findElement(addressPageFirstSectionEl).getText();
    }

    public void selectDivision() {
        new Select(driver.findElement(divisionEl)).selectByVisibleText("DHAKA");
    }

    public void selectDistrict() {
        new Select(driver.findElement(districtEl)).selectByVisibleText("DHAKA");
    }

    public void selectThana(String thana) throws InterruptedException {
        driver.findElement(thanaEl).click();
        Thread.sleep(3000);
        driver.findElement(thanaEl2).sendKeys(thana, Keys.ENTER);
        Thread.sleep(3000);
    }

    public void typePostOffice(String postOffice) {
        driver.findElement(postOfficeEl).sendKeys(postOffice);
    }

    public void typePostCode(String postCode) {
        driver.findElement(postCodeEl).sendKeys(postCode);
    }

    public void typeAddress(String address) {
        driver.findElement(addressEl).sendKeys(address);
    }

    public void scrollAddress() throws InterruptedException {
        Thread.sleep(2000);
        //Use java script executor to scroll to the element
        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
        jsExecutor2.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(addressEl));
    }

    public void clickCheckBox() {
        driver.findElement(sameAsEl).click();
    }

    public void clickNextBttn() {
        driver.findElement(nextBttnEl).click();
    }

}

