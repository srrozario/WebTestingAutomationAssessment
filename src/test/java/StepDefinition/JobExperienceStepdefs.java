package StepDefinition;

import POM.JobExperiencePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class JobExperienceStepdefs {
    JobExperiencePage elements;
    SoftAssert softAssert;

    @Given("User lands on the ob experience page")
    public void userLandsOnTheObExperiencePage() {
        System.out.println("User wants to fill-up job experience information");
        elements = new JobExperiencePage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page title
        String expectedPageTitle = "Job Experience (From Latest)  (Min: 6 Year/s)";
        String actualPageTitle = elements.getJobExpPageTitleText().trim();
        //soft assert to check page first section title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
    }

    @When("Type {string}")
    public void typeOrgName(String orgName) throws InterruptedException {
        elements.typeOrgName(orgName);
    }

    @And("Select {string}, {string}")
    public void selectDesignationStartDate(String designation, String startDate) throws InterruptedException {
        elements.selectDesignation(designation);
        Thread.sleep(2000);
        elements.SelectStartDate(startDate);
        Thread.sleep(2000);
        elements.selectEndDate();
    }

    @And("Put {string}")
    public void putJobAddress(String jobAddress) throws InterruptedException {
        elements.typeJobAddress(jobAddress);
        Thread.sleep(2000);
    }

    @Then("Navigate to certificate page")
    public void navigateToCertificatePage() {
        elements.proceedToNext();
        System.out.println("User navigates to the certificate page");
    }


}
