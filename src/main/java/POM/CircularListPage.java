package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CircularListPage {

    WebDriver driver;

    By firstCircularEl = By.xpath("//a[text()='14/2023']");
    By circularPageTitleEl = By.xpath("//h4[normalize-space()='Circular List']");

    public CircularListPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void firstCircularClick() {
        driver.findElement(firstCircularEl).click();
    }

    public String getPageTitleText() {
        return driver.findElement(circularPageTitleEl).getText();
    }
}
