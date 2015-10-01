package com.QA;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Asif Shaik on 30/09/2015.
 */
public class ContactUs_StepDefinations {
    public static WebDriver driver;
@Before
public void openBrowser(){
    driver= new FirefoxDriver();


}

    @Given("^user is on QAWorks page$")
    public void user_is_on_QAWorks_page() throws Throwable {
        driver.get("http://www.qaworks.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("^user clicks on TabName$")
    public void user_clicks_on_TabName() throws Throwable {
        driver.findElement(By.linkText("Contact")).click();

    }

    @Then("^user should navigate to contact page$")
    public void user_should_navigate_to_contact_page() throws Throwable {
        Assert.assertTrue(driver.findElement(By.id("ContactHead")).isDisplayed());


    }

    @When("^user enters the \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_the_and(String name, String emailAddress, String message) throws Throwable {
        driver.findElement(By.id("ctl00_MainContent_NameBox")).sendKeys(name);
        driver.findElement(By.id("ctl00_MainContent_EmailBox")).sendKeys(emailAddress);
        driver.findElement(By.id("ctl00_MainContent_MessageBox")).sendKeys((message));

    }
    @After
    public void closeBrowser(){
        driver.quit();
    }

}
