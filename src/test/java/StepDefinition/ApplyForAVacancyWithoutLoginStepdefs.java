package StepDefinition;

import POM.PostVacancyPage;
import POM.VacancyDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class ApplyForAVacancyWithoutLoginStepdefs {
    VacancyDetailPage elements;
    @Given("User lands on a particular vacancy details page")
    public void userLandsOnAParticularVacancyDetailsPage() {
        System.out.println("User wants to apply a vacancy without login");
    }

    @When("User clicks on the apply now button")
    public void userClicksOnTheApplyNowButton() throws InterruptedException {
        Thread.sleep(2000);
        elements = new VacancyDetailPage(driver);
        elements.applyNowBttnClick();
            }

    @And("User clicks on the continue without login")
    public void userClicksOnTheContinueWithoutLogin() throws InterruptedException {
        Thread.sleep(2000);
        elements.continueWithoutLoginBttnClick();
    }

    @Then("Navigate to the job application page")
    public void navigateToTheJobApplicationPage() {
        System.out.println("User navigates to the job application page");
    }
}
