package StepDefinition;

import POM.AddressPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class AddressStepdefs {
    AddressPage elements;
    SoftAssert softAssert;
    @Given("User lands on the address page")
    public void userLandsOnTheAddressPage() {
        System.out.println("User wants to fill-up address information");
        elements = new AddressPage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page first section title
        String expectedPageTitle = "Permanent Address";
        String actualPageTitle = elements.getAddressPageFirstSectionTitle().trim();
        //soft assert to check page first section title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
    }

    @When("Select division, district and {string}")
    public void selectDivisionDistrictAndThana(String thana) throws InterruptedException {
        elements.selectDivision();
        Thread.sleep(2000);
        elements.selectDistrict();
        Thread.sleep(2000);
        elements.selectThana(thana);
        Thread.sleep(2000);
    }

    @And("Type {string}, {string} and {string}")
    public void typePostOfficePostCodeAndAddress(String postOffice, String postCode, String address) throws InterruptedException {
        elements.typePostOffice(postOffice);
        Thread.sleep(2000);
        elements.typePostCode(postCode);
        Thread.sleep(2000);
        elements.typeAddress(address);
        Thread.sleep(2000);
        elements.scrollAddress();
    }

    @And("Click on the same as permanent address checkbox")
    public void clickOnTheSameAsPermanentAddressCheckbox() throws InterruptedException {
        elements.clickCheckBox();
        Thread.sleep(2000);
    }

    @And("Proceed to next")
    public void proceedToNext() {
        elements.clickNextBttn();
    }

    @Then("Navigate to education page")
    public void navigateToEducationPage() {
        System.out.println("User navigates to the education page");
    }
}
