package org.example;

import PageObjects.TestingSearchPage;
import io.cucumber.core.cli.Main;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
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


    public StepDefinitions (){
        driver.manage().window().maximize();
        testingSearchPage = new TestingSearchPage(driver);
    }

    @Given("I am the first page of the website")
    public void i_am_the_first_page_of_the_website() {
        driver.get("file:///C:/Users/Georgiana/Desktop/Github/Testing-Env/index.html");

    }
    @Given("I scroll to the Hibrid section")
    public void i_scroll_to_the_hibrid_section() {
        Utils.scrollToElement(driver, testingSearchPage.getHybridHeader());

    }
    @When("I click the Read More button")
    public void i_click_the_read_more_button() {
        driver.findElement(By.xpath("/html/body/section[3]/div/div/div[2]/div/div/a")).click();
    }
    @When("I click the button Return")
    public void i_click_the_button_return() {
        driver.findElement(By.xpath("/html/body/a")).click();
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
        driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[1]/a")).click();

    }
    @Then("the button it should take me down of the page")
    public void the_button_it_should_take_me_down_of_the_page() {
        Assert.assertEquals("Learn The Fundamentals",testingSearchPage.getLearnFundamentalsHeaderText());

    }
    @When("I click on the section  Instructors")
    public void i_click_on_the_section_instructors() {
        driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[3]/a")).click();
    }
    @Then("the button it will show me the instructors")
    public void the_button_it_will_show_me_the_instructors() {
        Assert.assertEquals("Our Instructors", testingSearchPage.getOurInstructorsHeaderText());

    }

    @When("I click on the button  Start the Enrollment")
    public void i_click_on_the_button_start_the_enrollment() {
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/a")).click();
    }
    @Then("It should open the sign  up page")
    public void it_should_open_the_sign_up_page() {
        Assert.assertTrue(driver.getCurrentUrl().equals("file:///C:/Users/Georgiana/Desktop/Github/Testing-Env/routes/enrollment.html"));

    }

    @Given("I scroll to the Learn The Fundamental section")
    public void i_scroll_to_the_learn_the_fundamental_section() {
        Utils.scrollToElement(driver, testingSearchPage.getReadMoreLearnTheFundamentalsSection());
    }

    @When("I click the Read More link")
    public void i_click_the_read_more_link() {
        driver.findElement(By.xpath("//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")).click();

    }
    @When("I click the button Learn The Fundamental Return")
    public void i_click_the_button_learn_the_fundamental_return() {
        driver.findElement(By.xpath("/html/body/a")).click();

    }
    @Then("I click the return button I go to the first page of the website")
    public void i_click_the_return_button_i_go_to_the_first_page_of_the_website() {
      Assert.assertTrue(driver.getCurrentUrl(), equals("file:///C:/Users/Georgiana/Desktop/Github/Testing-Env/index.html"));
    }

    @Given("I scroll to the Learn Selenium  section")
    public void i_scroll_to_the_learn_selenium_section() {
        Utils.scrollToElement(driver, testingSearchPage.getLearnSeleniumSection());
    }
    @When("I click the Read More link Learn Selenium")
    public void i_click_the_read_more_link_learn_selenium() {
        driver.findElement(By.xpath("//*[@id=\"learn-selenium\"]/div/div/div[1]/a")).click();

    }
    @When("I click the button Learn Selenium Return")
    public void i_click_the_button_learn_selenium_return() {
        driver.findElement(By.xpath("/html/body/a")).click();
    }

    @When("I introduce a valid email addres")
    public void i_introduce_a_valid_email_addres() {
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/input")).sendKeys("geo@gmail.com");
        //testingSearchPage.setEmailAdress("geo@gmail.com");
    }
    @When("I click the Submit  button")
    public void i_click_the_submit_button() {
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/button")).click();

    }
    @Then("The pop up it should open with a message")
    public void the_pop_up_it_should_open_with_a_message() {
       Assert.assertTrue(
               Utils.checkPopupWithTextAlert(driver,
                       "Email saved - you will now receive our monthly newsletter. Thank you!")
            );
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
