package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;
    By forgotPasswordLink = By.linkText("Forgot your password?");
    By emailInput = By.id("email");
    By submitButton = By.id("submit");
    By recoveryMessage = By.id("recoveryMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isPasswordRecoveryPageDisplayed() {
        return driver.getCurrentUrl().contains("password-recovery");
    }

    public void enterRegisteredEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void submitEmail() {
        driver.findElement(submitButton).click();
    }

    public boolean isRecoveryEmailSent() {
        return driver.findElement(recoveryMessage).isDisplayed();
    }
}