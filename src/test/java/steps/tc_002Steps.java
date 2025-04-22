package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver = new ChromeDriver();
    tc_002Page loginPage = new tc_002Page(driver);

    @Given("a user is on the login page")
    public void user_is_on_login_page() {
        driver.get("https://example.com/login");
    }

    @When("the user enters an incorrect username and password")
    public void user_enters_incorrect_credentials() {
        loginPage.enterUsername("incorrectUser");
        loginPage.enterPassword("incorrectPass");
        loginPage.clickLoginButton();
    }

    @Then("an error message is displayed")
    public void error_message_is_displayed() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @Then("the user is not logged in")
    public void user_is_not_logged_in() {
        Assert.assertFalse(loginPage.isLoginSuccessful());
        driver.quit();
    }
}