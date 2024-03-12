package StepDefinition;

import POM.CircularListPage;
import POM.PostVacancyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.util.Set;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class PostVacancyStepdefs {

    PostVacancyPage elements;
    SoftAssert softAssert;

    @Given("User lands on the post vacancy page")
    public void userLandsOnThePostVacancyPage() {
        System.out.println("User wants to select a vacancy");

    }

    @When("User selects a vacancy")
    public void userSelectsAVacancy() throws InterruptedException {
        Thread.sleep(4000);
        // Get the handles of all open windows
        Set<String> windowHandles = driver.getWindowHandles();
        // Switch to the new window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        elements = new PostVacancyPage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page title
        String expectedPageTitle = "Post vacancy";
        String actualPageTitle = elements.getpostVacancyPageTitle();
        //soft assert to check page title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
        elements.actionBttnClick();
    }

    @Then("Navigate to the vacancy details page")
    public void navigateToTheVacancyDetailsPage() {
        System.out.println("User navigates to the vacancy details page");
    }
}
