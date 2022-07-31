package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestingSearchPage {

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/p")
    private WebElement readMoreHybridButton;

    @FindBy(xpath = "/html/body/a")
    private WebElement hybridReturnButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreVirtualButton;

    @FindBy(xpath = "/html/body/a")
    private WebElement virtualReturnButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYouLlLearn;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnFundamentalHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorSection;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorSectionHeader;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollment;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]")
    private WebElement learnTheFundamentals;
    //*[@id="learn-fundamentals"]

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]")
    private WebElement readMoreLearnTheFundamentalsSection;

    @FindBy(xpath = "/html/body/a")
    private WebElement returnLearnTheFundamentals;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]")
    private WebElement learnSeleniumSection;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement readMoreLearnSelenium;

    @FindBy(xpath = "/html/body/a")
    private WebElement returnLearnSelenium;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailAdress;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;



    public TestingSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnHybridButton(){
        this.readMoreHybridButton.click();
    }

    public void clickOnHybridReturnButton(){
        this.hybridReturnButton.click();
    }

    public void clickOnVirtualButton(){
        this.readMoreVirtualButton.click();
    }

    public void clickOnVirtulReturnButton(){
        this.virtualReturnButton.click();
    }
    public void clickOnWhatYouLlLearn(){
        this.whatYouLlLearn.click();
    }

    public void clickOnInstructorsSection(){
        this.instructorSection.click();
    }

    public void clickStartTheEnrollment(){
        this.startTheEnrollment.click();
    }


    public void clickReturnLearnTheFundamentals(){
        this.returnLearnTheFundamentals.click();
    }

    public void clickReadMoreLearnSelenium(){
        this.readMoreLearnSelenium.click();
    }

    public void clickReturnLearnSelenium(){
        this.returnLearnSelenium.click();
    }

    public void clickSubmitButton(){
        this.submitButton.click();
    }

    public WebElement getHybridHeader(){
        return  this.hybridHeader;
    }

    public String getLearnFundamentalsHeaderText(){
        return this.learnFundamentalHeader.getText();
    }

    public String getOurInstructorsHeaderText(){
        return  this.instructorSectionHeader.getText();
    }

    public void setEmailAdress(String email){
        this.emailAdress.sendKeys(email);
    }
    public WebElement getStartTheEnrollmentUrl (){
        return this.startTheEnrollment.findElement(By.xpath("/html/body/div"));

    }

    public WebElement getReadMoreLearnTheFundamentalsSection(){
        return this.readMoreLearnTheFundamentalsSection;
    }
    public WebElement getReturnLearnTheFundamentals(){
        return this.returnLearnTheFundamentals;
    }
    public WebElement getLearnSeleniumSection(){
        return this.learnSeleniumSection;
    }

    public WebElement getReadMoreLearnSelenium(){
        return this.readMoreLearnSelenium;
    }

    public WebElement getReturnLearnSelenium(){
        return this.returnLearnSelenium;
    }



}
