package StepDefinition;

import POM.BasicInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import javax.sound.midi.Soundbank;

import static StepDefinition.JobCircularSelectionStepdefs.driver;

public class BasicInfoStepdefs {
    BasicInfoPage elements;
    SoftAssert softAssert;
    @Given("User lands on the basic info pag")
    public void userLandsOnTheBasicInfoPag() {
        System.out.println("User wants to fill-up basic information");
        elements = new BasicInfoPage(driver);
        softAssert = new SoftAssert();
        //soft assert to verify page first section title
        String expectedPageTitle = "National ID Verify";
        String actualPageTitle = elements.getPageFirstSectionTitle();
        //soft assert to check page first section title
        softAssert.assertTrue(actualPageTitle.contains(expectedPageTitle), "Page title assertion failed");
    }

    @When("Insert {string}")
    public void insertNidNumber(String nidNumber) throws InterruptedException {
        elements.insertNid(nidNumber);
        Thread.sleep(2000);
    }

    @And("Select nid file")
    public void selectNidFile() throws InterruptedException {
        elements.selectNidFile();
    }

    @And("Select Dob")
    public void selectDob() throws InterruptedException {
        elements.selectDob();
    }

    @And("Click on the verify nid button")
    public void clickOnTheVerifyNidButton() {
        elements.clickOnVerifyNid();
    }

    @Then("Personal information are shown")
    public void personalInformationAreShown() throws InterruptedException {
        System.out.println("Additional info shown");
        Thread.sleep(2000);
        elements.scrollVerifyBttn();
    }

    @When("Enter {string} , {string} , and {string}")
    public void enterFatherNameMotherNameAndMobileNumber(String fatherName, String motherName, String mobileNumber ) throws InterruptedException {
        Thread.sleep(2000);
        elements.insertFatherName(fatherName);
        Thread.sleep(2000);
        elements.insertMotherName(motherName);
        Thread.sleep(2000);
        elements.insertMobileNumber(mobileNumber);
    }

    @Then("OTP popups")
    public void otpPopups() {
        System.out.println("Copy otp from the popup dialog box");

    }

    @When("Click on the ok button from the popup dialog box")
    public void clickOnTheOkButtonFromThePopupDialogBox() {
        System.out.println("Click ok on the popup dialog box");
    }

    @And("Enter otp")
    public void enterOtp() throws InterruptedException {
        elements.insertOtp();
    }

    @And("Enter {string}")
    public void enterEmailAddress(String emailAddress) throws InterruptedException {
        elements.insertEmailAddress(emailAddress);
        Thread.sleep(2000);
    }

    @And("Select Marital and religion")
    public void selectMaritalAndReligion() throws InterruptedException {
        elements.selectMaritalStatus();
        Thread.sleep(2000);
        elements.selectReligion();
        Thread.sleep(2000);
        elements.scrollPhotoBrowseBttn();
        Thread.sleep(2000);
    }

    @And("Select photo and signature")
    public void selectPhotoAndSignature() throws InterruptedException {
        elements.selectPhotoFile();
        elements.selectSignatureFile();
    }

    @And("Click on the next button")
    public void clickOnTheNextButton() {
        elements.nextBttnClick();
    }

    @Then("Navigate to the address page")
    public void navigateToTheAddressPage() {
        System.out.println("User navigates to the address page");
    }
}
