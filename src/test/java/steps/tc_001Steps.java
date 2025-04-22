package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page loginPage;

    public tc_001Steps() {
        // Assuming that WebDriver is already set up
        loginPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get("https://example.com/login");
    }

    @When("the user enters a valid username and password")
    public void the_user_enters_a_valid_username_and_password() {
        loginPage.enterUsername("validUsername");
        loginPage.enterPassword("validPassword");
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user is redirected to the dashboard page")
    public void the_user_is_redirected_to_the_dashboard_page() {
        assertTrue(loginPage.isDashboardDisplayed());
    }
}