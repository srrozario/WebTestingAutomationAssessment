package StepDefinition;

import POM.CertificatePage;
import POM.JobExperiencePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class CertificateStepdefs {
    CertificatePage elements;
    SoftAssert softAssert;

    @Given("User lands on the certificate page")
    public void userLandsOnTheCertificatePage() {
        System.out.println("User wants to fill-up certification information");
        elements = new CertificatePage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page title
        String expectedPageTitle = "Training Certificate (From Latest) (Min: 3 Year/s)";
        String actualPageTitle = elements.getCertificatePageTitleText().trim();
        //soft assert to check page first section title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
    }

    @When("Select {string} and duration type")
    public void selectDurationAndDurationType(String duration) throws InterruptedException {
        elements.typeDuration(duration);
        Thread.sleep(2000);
        elements.selectDurationType();
        Thread.sleep(2000);
    }

    @And("Proceed forward")
    public void proceedForward() {
        elements.nxtBttnClick();
    }

    @Then("Navigate to declaration page")
    public void navigateToDeclarationPage() {
        System.out.println("User navigates to the declaration page");
    }


}
