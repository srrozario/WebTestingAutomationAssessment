package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DeclarationPage {
    WebDriver driver;

    By accptCheckBoxEl = By.xpath("//label[@for='accepted']");
    By completeEl = By.xpath("//button[normalize-space()='Complete']");
    By confirmBttnEl = By.xpath("//button[normalize-space()='Yes']");
    By declarationPageEl = By.xpath("//h5[normalize-space()='Declaration']");
    By submitConfirmEl = By.xpath("//div[@class='swal2-popup swal2-modal swal2-icon-success swal2-show']");
    public DeclarationPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public String getDeclarationPageTitleText() {
        return driver.findElement(declarationPageEl).getText();
    }
    public void accptCheckBoxClick() {
        driver.findElement(accptCheckBoxEl).click();
    }

    public void completeClick() {
        driver.findElement(completeEl).click();
    }

    public void confirmClick() {
        driver.findElement(confirmBttnEl).click();
    }

    public String getToastMessageText() {
        return driver.findElement(submitConfirmEl).getText();
    }
}
