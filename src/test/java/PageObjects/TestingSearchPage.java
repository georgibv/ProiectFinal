package PageObjects;

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

    public WebElement getHybridHeader(){
        return  this.hybridHeader;
    }

    public String getLearnFundamentalsHeaderText(){
        return this.learnFundamentalHeader.getText();
    }

    public String getOurInstructorsHeaderText(){
        return  this.instructorSectionHeader.getText();
    }



}
