package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartTheEnrollmentPage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement signUp_FirstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement signUp_LastName;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement signUp_UserName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement signUp_Password;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement signUp_ConfirmPassword;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement signUp_NextForSignUp;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]")
    private WebElement personalInformationForm;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]")
    private WebElement contactInformationForm;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement contactInformation_email;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement contactInformation_phone;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement contactInformation_contry;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement contactInformation_city;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement contactInformation_postCode;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptions;

    @FindBy(xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement courseOptionsFirstChoise;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement courseOptionsNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformation;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement paymentInformation_cardHolderName;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement paymentInformation_cardNumber;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement paymentInformation_cvc;

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement paymentInformation_expiryDateMonth;

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement paymentInformation_expiryDateYear;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement successPageReturnToHomepageButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement successpage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/div")
    private WebElement signUp_FirstNameIsRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[2]/div")
    private WebElement signUp_LastNameIsRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[3]/div")
    private WebElement signUp_UserNameIsRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[4]/div")
    private WebElement signUp_PasswordIsRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[5]/div")
    private WebElement signUp_ConfirmPasswordIsRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/div/div[2]")
    private WebElement paymentInformation_MonthAndYearNotSelected;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement paymentInformation_nextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement contactInformation_NextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[1]/div")
    private WebElement contactInformation_EmailRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[2]/div")
    private WebElement contactInformation_PhoneNumberRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[3]/div")
    private WebElement contactInformation_CountryRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[4]/div")
    private WebElement contactInformation_CityRequired;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[5]/div")
    private WebElement contactInformation_PostCodeRequired;


    public StartTheEnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void fill_personalInformation_LastName(String lastName){
        this.signUp_LastName.sendKeys(lastName);
    }
    public void fill_personalInformation_FirstName(String firstName){
        this.signUp_FirstName.sendKeys(firstName);
    }

    public void fill_personalInformation_UserName(String userName){
        this.signUp_UserName.sendKeys(userName);
    }

    public void fill_personalInformation_Password(String password){
        this.signUp_Password.sendKeys(password);
    }
    public void fill_personalInformation_ConfirmPassword(String confirmPassword){
        this.signUp_ConfirmPassword.sendKeys(confirmPassword);
    }
    public void click_signUp_NextForSignUp(){
        this.signUp_NextForSignUp.click();
    }

    public void clear_PaymentInformation_cvc(){
        this.paymentInformation_cvc.clear();

    }

    public void fill_ContactInformation_Email(String email){
        this.contactInformation_email.sendKeys(email);
    }
    public void fill_ContactInformation_Phone(String phone){
        this.contactInformation_phone.sendKeys(phone);
    }
    public void fill_ContactInformation_Contry(String contry){
        this.contactInformation_contry.sendKeys(contry);
    }
    public void fill_ContactInformation_City(String city){
        this.contactInformation_city.sendKeys(city);
    }
    public void fill_ContactInformation_PostCode(String postCode){
        this.contactInformation_postCode.sendKeys(postCode);
    }

    public void fill_PaymentInformation_CardHolderName(String cardHolderName){
        this.paymentInformation_cardHolderName.sendKeys(cardHolderName);
    }
    public void fill_PaymentInformation_CardNumber(String cardNumber){
        this.paymentInformation_cardNumber.sendKeys(cardNumber);
    }
    public void fill_PaymentInformation_CVC(String CVC){
        this.paymentInformation_cvc.sendKeys(CVC);
    }
    public void fill_PaymentInformation_expiryDateMonth(String month){
        this.paymentInformation_expiryDateMonth.sendKeys(month);
    }
    public void fill_PaymentInformation_expiryDateYear(String year){
        this.paymentInformation_expiryDateYear.sendKeys(year);
    }

    public void clickOnPaymentInformation_nextButton(){
        this.paymentInformation_nextButton.click();
    }

    public WebElement getPersonalInformationForm(){
        return this.personalInformationForm;
    }
    public  WebElement getContactInformationForm(){
        return this.contactInformationForm;
    }

    public WebElement getCourseOptions(){
        return this.courseOptions;
    }


    public WebElement getPaymentInformation(){
        return this.paymentInformation;
    }
    public void clickOnCourseOptionsFirstChoise(){
        this.courseOptionsFirstChoise.click();
    }
    public void clickOnCourseOptionsNextButton()
    {
        this.courseOptionsNextButton.click();
    }

    public WebElement getSuccesspage(){
        return this.successpage;
    }

    public void clickOnSuccessPageReturnToHomepageButton()
    {
        this.successPageReturnToHomepageButton.click();
    }

    public WebElement getsignUp_FirstNameIsRequired(){
        return this.signUp_FirstNameIsRequired;
    }

    public WebElement getsignUp_LastNameIsRequired(){
        return this.signUp_LastNameIsRequired;
    }

    public WebElement getsignUp_UserNameIsRequired(){
        return this.signUp_UserNameIsRequired;
    }

    public WebElement getsignUp_PasswordIsRequired(){
        return this.signUp_PasswordIsRequired;
    }

    public WebElement getsignUp_ConfirmPasswordIsRequired(){
        return this.signUp_ConfirmPasswordIsRequired;
    }

    public WebElement getcontactInformation_EmailRequired(){
        return this.contactInformation_EmailRequired;
    }

    public WebElement getcontactInformation_PhoneNumberRequired(){
        return this.contactInformation_PhoneNumberRequired;
    }

    public void clickOnContactInformation_NextButton(){
        this.contactInformation_NextButton.click();
    }

    public WebElement getcontactInformation_CountryRequired(){
        return this.contactInformation_CountryRequired;
    }

    public WebElement getcontactInformation_CityRequired(){
        return this.contactInformation_CityRequired;
    }
    public WebElement getcontactInformation_PostCodeRequired(){
        return this.contactInformation_PostCodeRequired;
    }

}

