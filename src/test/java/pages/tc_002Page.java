package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean isLoginSuccessful() {
        // Logic to check if the user is logged in; for now dummy logic
        return driver.getCurrentUrl().contains("dashboard");
    }
}