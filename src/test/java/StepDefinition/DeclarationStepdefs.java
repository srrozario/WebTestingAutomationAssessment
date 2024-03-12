package StepDefinition;

import POM.CertificatePage;
import POM.DeclarationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class DeclarationStepdefs {
    DeclarationPage elements;
    SoftAssert softAssert;
    @Given("User lands on the declaration page")
    public void userLandsOnTheDeclarationPage() {
        System.out.println("User wants to confirm the provided information");
        elements = new DeclarationPage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page title
        String expectedPageTitle = "Declaration";
        String actualPageTitle = elements.getDeclarationPageTitleText().trim();
        //soft assert to check page first section title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
    }

    @When("Click on the checkbox")
    public void clickOnTheCheckbox() throws InterruptedException {
        elements.accptCheckBoxClick();
        Thread.sleep(2000);
    }

    @And("Confirm")
    public void confirm() throws InterruptedException {
        elements.completeClick();
        Thread.sleep(2000);
    }

    @Then("Navigate to payment page")
    public void navigateToPaymentPage() throws InterruptedException {
        elements.confirmClick();
        Thread.sleep(2000);
        //soft assert to verify toast message text
        String expectedText = "Application submitted.";
        String actualText = elements.getToastMessageText().trim();
        //soft assert to check page first section title
        softAssert.assertTrue(actualText.contains(expectedText), "Toast text assertion failed");
    }
}
