package au.com.towbulls.stepdef;

import au.com.towbulls.BaseTest;
import au.com.towbulls.pages.*;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;

import static au.com.towbulls.pages.BasePage.*;

/**
 * Created by att.jacobg on 24/06/2018.
 */
public class TowBullsStepdefs extends BaseTest {

    GooglePage googleHomePage = new GooglePage();

    SoftwareQualityAssurancePage softwareQualityAssurancePage = new SoftwareQualityAssurancePage();

    AutomationPracticeLoginPage autoPracticeLoginPage = new AutomationPracticeLoginPage();

    AutomationPracticeMyAccountPage autoPracticeMyAccPage = new AutomationPracticeMyAccountPage();

    private Scenario scenario;
    @Before
    public void beforeTest(Scenario scenario) {
        this.scenario = scenario;
        System.out.println("Test Start time is " + new Date());
    }

    @After
    public void afterTest() {
        System.out.println("Test End time is " + new Date());
        scenario.write("Test End time is " + new Date());
        driver.quit();
    }

    @Given("^I navigate to Google home$")
    public void iNavigateToGoogle() {
        googleHomePage.goHome();
    }

    @When("^I click \"(.*)\" link$")
    public void iClickLink(String link) throws Throwable {
        googleHomePage.clickLinkText(link);
    }

    @Then("^I am on \"(.*)\" page$")
    public void iAmOnPage(String pageTitle) throws Throwable {
        BasePage.verifyPageTitle(pageTitle);
    }

    @And(("^Page \"Software quality assurance - Wikipedia\" contains link to \"Quality assurance\"$"))
    public void pageSoftwareQualityAssuranceContainsLinkToQualityAssurance(){
        softwareQualityAssurancePage.assertLinkToQualityAssurancePresent();
    }

    @When("^I search for text \"(.*)\"$")
    public void iSearchForText(String text) throws Throwable {
        googleHomePage.searchForText(text);
    }

    @Given("^I navigate to automationpractice$")
    public void iNavigateToAutomationPractice() {
        autoPracticeLoginPage.goHome();
    }

    @And("^I wait for ([0-9]*) sec$")
    public void iWaitForNSec( int sec) throws InterruptedException {
        Thread.sleep(sec*1000);
    }


    @Given("^I start browser$")
    public void iStartBrowser() throws Throwable {
        scenario.write("Test Start time is " + new Date());
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
    }

    @When("^I Sing In using (.*)/(.*)$")
    public void iSingInUsingTestPixafyCom(String iUser, String iPass) throws Throwable {
        autoPracticeLoginPage.login(iUser, iPass);
    }

    @Then("^I am signed in$")
    public void iAmSignedIn() throws Throwable {
        autoPracticeMyAccPage.verifyLogin();
    }
}


