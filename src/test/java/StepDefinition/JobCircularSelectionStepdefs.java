package StepDefinition;

import Core.Helper;
import POM.CircularListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class JobCircularSelectionStepdefs {
    public static WebDriver driver;
    CircularListPage elements;
    SoftAssert softAssert;
    @Given("User lands on the job circular list page")
    public void userLandsOnTheJobCircularListPage() throws InterruptedException {
        Helper helper = new Helper();
        driver = helper.FirefoxTest();
        System.out.println("User selects a job circular");
        Thread.sleep(4000);
        elements = new CircularListPage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page title
        String expectedPageTitle = "Circular List";
        String actualPageTitle = elements.getPageTitleText().trim();
        //soft assert to check page title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
    }

    @When("User selects a job circular")
    public void userSelectsAJobCircular() {
        //elements = new CircularListPage(driver);
        elements.firstCircularClick();
    }

    @Then("Navigate to post vacancy page")
    public void navigateToPostVacancyPage() {
        System.out.println("User navigates to the post vacancy page");
    }
}
