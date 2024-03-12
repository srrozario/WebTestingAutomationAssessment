package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PostVacancyPage {
    WebDriver driver;

    By actionBttnEl = By.cssSelector(".bx.bx-show");
    By postVacancyPageTitleEl = By.xpath("//span[@class='pull-left']");

    public PostVacancyPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void actionBttnClick() throws InterruptedException {
        driver.findElement(actionBttnEl).click();
    }

    public String getpostVacancyPageTitle() {
        return driver.findElement(postVacancyPageTitleEl).getText();
    }
}
