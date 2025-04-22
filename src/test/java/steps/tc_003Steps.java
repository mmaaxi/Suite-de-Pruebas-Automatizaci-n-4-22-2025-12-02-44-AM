package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        page = new tc_003Page(driver);
    }

    @Given("El usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        driver.get("http://example.com/login");
    }

    @When("Selecciona la opción 'Olvidé mi contraseña'")
    public void seleccionaLaOpcionOlvideMiContrasena() {
        page.clickForgotPassword();
    }

    @Then("Se muestra la pantalla de recuperación de contraseña")
    public void seMuestraLaPantallaDeRecuperacionDeContrasena() {
        assert page.isPasswordRecoveryPageDisplayed();
    }

    @When("Ingresa su correo electrónico registrado")
    public void ingresaSuCorreoElectronicoRegistrado() {
        page.enterRegisteredEmail("usuario@example.com");
        page.submitEmail();
    }

    @Then("Se envía un correo de recuperación de contraseña")
    public void seEnviaUnCorreoDeRecuperacionDeContrasena() {
        assert page.isRecoveryEmailSent();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}