package StepDefinition;

import POM.AddressPage;
import POM.EducationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class EducationStepdefs {
    EducationPage elements;
    SoftAssert softAssert;
    @Given("User lands on the education page")
    public void userLandsOnTheEducationPage() {
        System.out.println("User wants to fill-up education information");
        elements = new EducationPage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page title
        String expectedPageTitle = "Education (From Latest)";
        String actualPageTitle = elements.getEducationPageTitleText().trim();
        //soft assert to check page first section title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
    }

    @When("Select hsc exam, {string}, {string}, {string}, {string} and {string}")
    public void selectHscExamHscSubHscBoardHscPassingYrGpaScaleHscAndHscResult(String hscSub, String hscBoard, String hscPassingYr, String gpaScaleHsc, String hscResult) throws InterruptedException {
        elements.selectExamHsc();
        Thread.sleep(2000);
        elements.selectHscSub(hscSub);
        Thread.sleep(2000);
        elements.selectHscBoard(hscBoard);
        elements.typeHscPassingYr(hscPassingYr);
        elements.hscResult(gpaScaleHsc, hscResult);
    }

    @And("Select ssc exam, {string}, {string}, {string}, {string} and {string}")
    public void selectSscExamSscSubSscBoardSscPassingYrGpaScaleSscAndSscResult(String sscSub, String sscBoard, String sscPassingYr, String gpaScaleSsc, String sscResult) throws InterruptedException {
        elements.selectExamSsc();
        Thread.sleep(2000);
        elements.selectSscSub(sscSub);
        Thread.sleep(2000);
        elements.selectSscBoard(sscBoard);
        elements.typeSscPassingYr(sscPassingYr);
        elements.sscResult(gpaScaleSsc, sscResult);
    }

    @And("Click on next button")
    public void clickOnNextButton() {
        elements.nxtBttnClick();
    }

    @Then("Navigate to job experience page")
    public void navigateToJobExperiencePage() {
        System.out.println("User navigates to the job experience page");
    }
}
