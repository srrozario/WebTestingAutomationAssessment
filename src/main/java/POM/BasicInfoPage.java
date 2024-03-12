package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Set;

public class BasicInfoPage {
    WebDriver driver;

    By nationalId = By.id("national_id");
    By nationalIdAttach = By.xpath("//input[@id='national_id_attachment']");
    By dobField = By.xpath("//input[@id='date_of_birth']");
    By selectMnth = By.xpath("//th[@title='Select Month']");
    By selectYr = By.xpath("//th[@title='Select Year']");
    By selectDecade = By.xpath("//th[@title='Select Decade']");
    By selectDobYr = By.xpath("//span[normalize-space()='1990']");
    By getSelectPreviousDecade = By.xpath("//span[@title='Previous Decade']");
    By selectDobYr95 = By.xpath("//span[normalize-space()='1995']");
    By selectDobMnth = By.xpath("//span[normalize-space()='Aug']");
    By getSelectDobDate = By.xpath("//td[normalize-space()='23']");
    By verifyNid = By.id("nid_verification");
    By fatherNameEl = By.id("father_name");
    By motherNameEl = By.id("mother_name");
    By mobileNumberEl = By.id("mobile");
    By otpEl = By.id("otp");
    By email = By.id("email");
    By martialStatus = By.id("marital_status");
    By religion = By.id("religion");
    By photoEl = By.id("photo");
    By signatureEl = By.id("signature");
    By nextBttn = By.xpath("//button[@value='first']");
    By pageFirstSectionEl = By.xpath("//legend[normalize-space()='National ID Verify']");


    public BasicInfoPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void insertNid(String nidNumber) {
        driver.findElement(nationalId).sendKeys(nidNumber);
    }

    public void selectNidFile() throws InterruptedException {

        String imageUpload1 = System.getProperty("user.dir") + "\\src\\test\\resources\\Images\\example_nid.png";
//        WebElement fileInput = driver.findElement(By.xpath("//input[@id='national_id_attachment']"));
        WebElement fileInput = driver.findElement(nationalIdAttach);
        Thread.sleep(3000);
        fileInput.sendKeys(imageUpload1);
        Thread.sleep(5000);
    }

    public void selectDob() throws InterruptedException {
        driver.findElement(dobField).click();
        Thread.sleep(2000);
        driver.findElement(selectMnth).click();
        Thread.sleep(2000);
        driver.findElement(selectYr).click();
        Thread.sleep(2000);
        driver.findElement(selectDecade).click();
        Thread.sleep(2000);
        driver.findElement(selectDobYr).click();
        Thread.sleep(2000);
        driver.findElement(getSelectPreviousDecade).click();
        Thread.sleep(2000);
        driver.findElement(selectDobYr95).click();
        Thread.sleep(2000);
        driver.findElement(selectDobMnth).click();
        Thread.sleep(2000);
        driver.findElement(getSelectDobDate).click();
        Thread.sleep(2000);
    }

    public String getPageFirstSectionTitle() {
        return driver.findElement(pageFirstSectionEl).getText();
    }

    public void clickOnVerifyNid() {
        driver.findElement(verifyNid).click();
    }

    //Use java script executor to scroll to the element
    public void scrollVerifyBttn() {
        //Use java script executor to scroll to the element
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(verifyNid));
    }

    public void insertFatherName(String fatherName) {
        driver.findElement(fatherNameEl).sendKeys(fatherName);
    }

    public void insertMotherName(String motherName) {
        driver.findElement(motherNameEl).sendKeys(motherName);
    }

    public void insertMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberEl).sendKeys(mobileNumber);
    }

    public void insertOtp() throws InterruptedException {
        Thread.sleep(2000);
        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert
        String alertText = alert.getText();

        // Extract only the digits from the alert text using regular expressions
        String otp = alertText.replaceAll("[^0-9]", "");

        // accept
        driver.switchTo().alert().accept();

        // Enter the extracted OTP into the OTP field
        driver.findElement(otpEl).sendKeys(otp);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    public void insertEmailAddress(String emailAddress) {
        driver.findElement(email).sendKeys(emailAddress);
    }

    public void selectMaritalStatus() {
        new Select(driver.findElement(martialStatus)).selectByVisibleText("SINGLE");
    }

    public void selectReligion() {
        new Select(driver.findElement(religion)).selectByVisibleText("ISLAM");
    }

    public void scrollPhotoBrowseBttn() {
        //Use java script executor to scroll to the element
        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
        jsExecutor2.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(photoEl));
    }

    public void selectPhotoFile() throws InterruptedException {
        String imageUpload2 = System.getProperty("user.dir") + "\\src\\test\\resources\\Images\\photo.jpg";
        WebElement fileInput = driver.findElement(photoEl);
        fileInput.sendKeys(imageUpload2);
        Thread.sleep(5000);
    }

    public void selectSignatureFile() throws InterruptedException {
        String imageUpload3 = System.getProperty("user.dir") + "\\src\\test\\resources\\Images\\test_signature.jpg";
        WebElement fileInput = driver.findElement(signatureEl);
        fileInput.sendKeys(imageUpload3);
        Thread.sleep(5000);
    }

    public void nextBttnClick() {
        driver.findElement(nextBttn).click();
    }

}



