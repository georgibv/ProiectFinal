package org.example;

import PageObjects.StartTheEnrollmentPage;
import PageObjects.TestingSearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();
    TestingSearchPage testingSearchPage;
    StartTheEnrollmentPage startTheEnrollmentPage;


    public StepDefinitions() {
        driver.manage().window().maximize();
        testingSearchPage = new TestingSearchPage(driver);
        startTheEnrollmentPage = new StartTheEnrollmentPage(driver);
    }

    @Given("I scroll to the Hibrid section")
    public void i_scroll_to_the_hibrid_section() {
        Utils.scrollToElement(driver, testingSearchPage.getHybridHeader());

    }

    @When("I click the virtual Read More button")
    public void i_click_the_virtual_read_more_button() {
       testingSearchPage.clickOnReadMoreVirtualButton();
    }

    @When("I click the hybrid Read More button")
    public void i_click_the_hybrid_read_more_button() {
       testingSearchPage.clickOnReadMoreHybridButton();
    }

    @When("I click the button virtual Return")
    public void i_click_the_button_virtual_return() {
        testingSearchPage.clickOnVirtulReturnButton();

    }

    @When("I click the button hybrid Return")
    public void i_click_the_button_hybrid_return() {
        testingSearchPage.clickOnHybridReturnButton();

    }

    @Then("I return to the first page of the website")
    public void i_return_to_the_first_page_of_the_website() {
        Assert.assertTrue(driver.getCurrentUrl().equals("file:///C:/Users/Georgiana/Desktop/Github/Testing-Env/index.html"));

    }

    @Given("I am on the first page of the website")
    public void i_am_on_the_first_page_of_the_website() {
        driver.get("file:///C:/Users/Georgiana/Desktop/Github/Testing-Env/index.html");
    }

    @Given("I scroll to the Virtual section")
    public void i_scroll_to_the_virtual_section() {
        Utils.scrollToElement(driver, testingSearchPage.getHybridHeader());
    }

    @When("I click on the section  What You ll Learn")
    public void i_click_on_the_section_what_you_ll_learn() {
        testingSearchPage.clickOnWhatYouLlLearn();

    }

    @Then("the button it should take me down of the page")
    public void the_button_it_should_take_me_down_of_the_page() {
        Assert.assertEquals("Learn The Fundamentals", testingSearchPage.getLearnFundamentalsHeaderText());

    }

    @When("I click on the section  Instructors")
    public void i_click_on_the_section_instructors() {
        testingSearchPage.clickOnInstructorsSection();
    }

    @Then("the button it will show me the instructors")
    public void the_button_it_will_show_me_the_instructors() {
        Assert.assertEquals("Our Instructors", testingSearchPage.getOurInstructorsHeaderText());

    }

    @When("I click on the button  Start the Enrollment")
    public void i_click_on_the_button_start_the_enrollment() {
       testingSearchPage.clickStartTheEnrollment();
    }

    @Then("It should open the sign  up page")
    public void it_should_open_the_sign_up_page() {
        Assert.assertTrue(driver.getCurrentUrl().equals("file:///C:/Users/Georgiana/Desktop/Github/Testing-Env/routes/enrollment.html"));

    }

    @Given("I scroll to the Learn The Fundamental section")
    public void i_scroll_to_the_learn_the_fundamental_section() {
        Utils.scrollToElement(driver, testingSearchPage.getReadMoreLearnTheFundamentalsSection());
    }

    @When("I click the fundamental Read More link")
    public void i_click_the_fundamental_read_more_link() {
        testingSearchPage.clickOnReadMoreFundamentalsButton();
    }

    @When("I click the button Learn The Fundamental Return")
    public void i_click_the_button_learn_the_fundamental_return() {
        testingSearchPage.clickReturnLearnTheFundamentals();
    }

    @Given("I scroll to the Learn Selenium  section")
    public void i_scroll_to_the_learn_selenium_section() {
        Utils.scrollToElement(driver, testingSearchPage.getLearnSeleniumSection());
    }

    @When("I click the Read More link Learn Selenium")
    public void i_click_the_read_more_link_learn_selenium() {
        testingSearchPage.clickReadMoreLearnSelenium();
    }

    @When("I click the button Learn Selenium Return")
    public void i_click_the_button_learn_selenium_return() {
        testingSearchPage.clickReturnLearnSelenium();
    }

    @When("I introduce a valid email addres")
    public void i_introduce_a_valid_email_addres() {
        testingSearchPage.setEmailAdress("geo@gmail.com");
    }

    @When("I click the signup newsletter Submit button")
    public void i_click_the_signup_newletter_submit_button() {
        testingSearchPage.clickNewsletterSubmitButton();
    }

    @Then("The pop up it should open with a message")
    public void the_pop_up_it_should_open_with_a_message() {
        Assert.assertTrue(
                Utils.checkPopupWithTextAlert(driver,
                        "Email saved - you will now receive our monthly newsletter. Thank you!")
        );
    }
    @Given("I scroll to the Our Instructors section")
    public void i_scroll_to_the_our_instructors_section() {
        Utils.scrollToElement(driver, testingSearchPage.getInstructorsSocialMediaPageHeader());
    }


    @When("I click to the social media link")
    public void i_click_to_the_social_media_link() {
        testingSearchPage.clicksocialMediaButton();

    }

    @Then("The link should take the user page")
    public void the_link_should_take_the_user_page() {
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));

    }

    @Given("I click  to Start The Enrollment button")
    public void i_click_to_start_the_enrollment_button() {
        testingSearchPage.clickStartTheEnrollment();
    }

    @When("I click on personal information form Next button")
    public void i_click_on_personal_information_next_button() {
        startTheEnrollmentPage.click_signUp_NextForSignUp();
    }

    @Then("I am on the personal information form")
    public void i_am_on_the_personal_information_form() {
        Assert.assertTrue(startTheEnrollmentPage.getPersonalInformationForm().isDisplayed());
    }

    @Then("I stay on the personal information form")
    public void i_stay_on_the_personal_information_form() {
        Assert.assertTrue(startTheEnrollmentPage.getPersonalInformationForm().isDisplayed());
    }
    @Then("I am on the contact information form")
    public void i_am_on_the_contact_information_form() {
        Assert.assertTrue(startTheEnrollmentPage.getContactInformationForm().isDisplayed());
    }

    @When("I click on next on contact information form")
    public void i_click_on_next_on_contact_information_form() {
        startTheEnrollmentPage.clickOnContactInformation_NextButton();
    }

    @Then("I am on the course option form")
    public void i_am_on_the_course_option_form() {
        Assert.assertTrue(startTheEnrollmentPage.getCourseOptions().isDisplayed());
    }

    @Then("I select first option")
    public void i_select_first_option() {
        startTheEnrollmentPage.clickOnCourseOptionsFirstChoise();
    }

    @When("I click on course option form next button")
    public void i_click_on_option_form_next() {
        startTheEnrollmentPage.clickOnCourseOptionsNextButton();
    }

    @Then("I am on the payment information form")
    public void i_am_on_the_payment_information_form() {
        Assert.assertTrue(startTheEnrollmentPage.getPaymentInformation().isDisplayed());

    }

    @When("I click on payment information next button")
    public void i_click_on__payment_information_next() {
        startTheEnrollmentPage.clickOnPaymentInformation_nextButton();
    }

    @Then("I view the success form")
    public void i_view_the_success_form() {
        Assert.assertTrue(startTheEnrollmentPage.getSuccesspage().isDisplayed());
    }

    @Then("I click on return to homepage from success form")
    public void i_click_on_return_to_homepage_from_success_form() {
        startTheEnrollmentPage.clickOnSuccessPageReturnToHomepageButton();

    }

    @Then("I do not fill anything")
    public void i_do_not_fill_anything() {

    }

    @Then("I get missing fields validation messages")
    public void i_get_missing_fields_validation_messages() {
        Assert.assertTrue(startTheEnrollmentPage.getsignUp_FirstNameIsRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getsignUp_LastNameIsRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getsignUp_UserNameIsRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getsignUp_PasswordIsRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getsignUp_ConfirmPasswordIsRequired().isDisplayed());
    }


    @Then("I stay on the payment information form")
    public void i_stay_on_the_payment_information_form() {
        Assert.assertTrue(startTheEnrollmentPage.getPaymentInformation().isDisplayed());
    }


    @When("I click on Next button of Contact Information")
    public void i_click_on_next_button_of_contact_information() {
        startTheEnrollmentPage.clickOnContactInformation_NextButton();
    }

    @Then("I get missing fields validation messages contact information")
    public void i_get_missing_fields_validation_messages_contact_information() {
        Assert.assertTrue(startTheEnrollmentPage.getcontactInformation_EmailRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getcontactInformation_PhoneNumberRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getcontactInformation_CountryRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getcontactInformation_CityRequired().isDisplayed());
        Assert.assertTrue(startTheEnrollmentPage.getcontactInformation_PostCodeRequired().isDisplayed());

    }

    @Then("I clear CVC")
    public void i_clear_cvc() {
        startTheEnrollmentPage.clear_PaymentInformation_cvc();
    }


    @And("I enter {string} as First Name")
    public void iEnterAsFirstName(String firstName) {
        startTheEnrollmentPage.fill_personalInformation_FirstName(firstName);
    }

    @And("I enter {string} as Last Name")
    public void iEnterAsLastName(String lastName) {
        startTheEnrollmentPage.fill_personalInformation_LastName(lastName);
    }

    @And("I enter {string} as Username")
    public void iEnterMariaAsUsername(String username) {
        startTheEnrollmentPage.fill_personalInformation_UserName(username);
    }

    @And("I enter {string} as Password")
    public void iEnterAsPassword(String password) {
        startTheEnrollmentPage.fill_personalInformation_Password(password);
    }

    @And("I enter {string} as Confirm password")
    public void iEnterAsConfirmPassword(String confirmPassword) {
        startTheEnrollmentPage.fill_personalInformation_ConfirmPassword(confirmPassword);
    }

    @And("I enter {string} at email")
    public void iEnterAtEmail(String email) {
        startTheEnrollmentPage.fill_ContactInformation_Email(email);
    }

    @And("I enter {string} at the Phone")
    public void iEnterAtThePhone(String phone) {
        startTheEnrollmentPage.fill_ContactInformation_Phone(phone);
    }

    @And("I enter {string} at the Country")
    public void iEnterAtTheCountry(String contry) {
        startTheEnrollmentPage.fill_ContactInformation_Contry(contry);
    }

    @And("I enter {string} at the City")
    public void iEnterAtTheCity(String city) {
        startTheEnrollmentPage.fill_ContactInformation_City(city);
    }
    @And("I enter {string} at the Post Code")
    public void iEnterAtThePostCode(String postCode) {
        startTheEnrollmentPage.fill_ContactInformation_PostCode(postCode);
    }
    @And("I enter {string} as Card holder name")
    public void iEnterAsCardHolderName(String cardHolderName) {
        startTheEnrollmentPage.fill_PaymentInformation_CardHolderName(cardHolderName);
    }
    @And("I enter {string} as Card number")
    public void iEnterAsCardNumber(String cardNumber) {
        startTheEnrollmentPage.fill_PaymentInformation_CardNumber(cardNumber);
    }
    @And("I enter {string} as CVC")
    public void iEnterAsCVC(String CVC) {
        startTheEnrollmentPage.fill_PaymentInformation_CVC(CVC);
    }
    @And("I select the {string} month")
    public void iSelectTheMonth(String month) {
        startTheEnrollmentPage.fill_PaymentInformation_expiryDateMonth(month);
    }
    @And("I select the {string} year")
    public void iSelectTheYear(String year) {
        startTheEnrollmentPage.fill_PaymentInformation_expiryDateYear(year);
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }
}



