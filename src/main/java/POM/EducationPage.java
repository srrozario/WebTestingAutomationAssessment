package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class EducationPage {
    WebDriver driver;

    By selectHscEl = By.xpath("//select[@id='education_0_exam']");
    By clickHscSubEl = By.xpath("//span[@id='select2-education_0_subject-container']");
    By typeHscSubEl = By.xpath("//input[@role='textbox']");
    By clickHscBoardEl = By.xpath("//span[@id='select2-education_0_exam_body-container']");
    By typeHscBoardEl = By.xpath("//input[@role='textbox']");
    By passingYrHscEl = By.xpath("//input[@id='education_0_passing_year']");
    By clickResultHscEl = By.xpath("//span[@id='select2-education_0_result_type-container']");
    By selectResultTypeHscEl = By.xpath("//input[@role='textbox']");
    By typeResultHscEl = By.xpath("//input[@id='education_0_result']");
    By selectSscEl = By.xpath("//select[@id='education_1_exam']");
    By clickSscSubEl = By.xpath("//span[@id='select2-education_1_subject-container']");
    By typeSscSubEl = By.xpath("//input[@role='textbox']");
    By clickSscBoardEl = By.xpath("//span[@id='select2-education_1_exam_body-container']");
    By typeSscBoardEl = By.xpath("//input[@role='textbox']");
    By passingYrSscEl = By.xpath("//input[@id='education_1_passing_year']");
    By clickResultSscEl = By.xpath("//span[@id='select2-education_1_result_type-container']");
    By selectResultTypeSscEl = By.xpath("//input[@role='textbox']");
    By typeResultSscEl = By.xpath("//input[@id='education_1_result']");
    By nextBttnEl = By.xpath("//div[@id='nextButtonContainer']//button[@type='button'][normalize-space()='Next']");
    By educationTitleEl = By.xpath("//legend[normalize-space()='Education (From Latest)']");

    public EducationPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public String getEducationPageTitleText() {
        return driver.findElement(educationTitleEl).getText();
    }

    public void selectExamHsc() {
        new Select(driver.findElement(selectHscEl)).selectByVisibleText("HSC");
    }

    public void selectHscSub(String hscSub) throws InterruptedException {
        driver.findElement(clickHscSubEl).click();
        Thread.sleep(2000);
        driver.findElement(typeHscSubEl).sendKeys(hscSub, Keys.ENTER);
    }

    public void selectHscBoard(String hscBoard) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(clickHscBoardEl).click();
        Thread.sleep(2000);
        driver.findElement(typeHscBoardEl).sendKeys(hscBoard, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void typeHscPassingYr(String hscPassingYr) {
        driver.findElement(passingYrHscEl).sendKeys(hscPassingYr);
    }

    public void hscResult(String gpaScaleHsc, String hscResult) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(clickResultHscEl).click();
        Thread.sleep(2000);
        driver.findElement(selectResultTypeHscEl).sendKeys(gpaScaleHsc, Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(typeResultHscEl).sendKeys(hscResult);
        Thread.sleep(2000);
    }

    public void selectExamSsc() {
        new Select(driver.findElement(selectSscEl)).selectByVisibleText("SSC");
    }

    public void selectSscSub(String sscSub) throws InterruptedException {
        driver.findElement(clickSscSubEl).click();
        Thread.sleep(2000);
        driver.findElement(typeSscSubEl).sendKeys(sscSub, Keys.ENTER);
    }

    public void selectSscBoard(String sscBoard) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(clickSscBoardEl).click();
        Thread.sleep(2000);
        driver.findElement(typeSscBoardEl).sendKeys(sscBoard, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void typeSscPassingYr(String sscPassingYr) {
        driver.findElement(passingYrSscEl).sendKeys(sscPassingYr);
    }

    public void sscResult(String gpaScaleSsc, String sscResult) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(clickResultSscEl).click();
        Thread.sleep(2000);
        driver.findElement(selectResultTypeSscEl).sendKeys(gpaScaleSsc, Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(typeResultSscEl).sendKeys(sscResult);
        Thread.sleep(2000);
    }

    public void nxtBttnClick() {
        driver.findElement(nextBttnEl).click();
    }
}
