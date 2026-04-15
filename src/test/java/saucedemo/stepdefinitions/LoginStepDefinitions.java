package saucedemo.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import saucedemo.questions.ErrorMessage;
import saucedemo.questions.InventoryTitle;
import saucedemo.tasks.Login;
import saucedemo.tasks.OpenSauceDemo;
import saucedemo.utils.TestDataReader;

public class LoginStepDefinitions {

    @Given("{actor} abre SauceDemo")
    public void abreSauceDemo(Actor actor) {
        actor.wasAbleTo(OpenSauceDemo.homePage());
    }

    @When("{actor} inicia sesion con credenciales validas")
    public void iniciaSesionConCredencialesValidas(Actor actor) {
        actor.attemptsTo(Login.withCredentials(
                TestDataReader.get("user.valid"),
                TestDataReader.get("password.valid")
        ));
    }


    @Then("{actor} debe ver el titulo de inventario {string}")
    public void debeVerElTituloDeInventario(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                Ensure.that(InventoryTitle.text()).isEqualTo(expectedTitle)
        );
    }

    @When("{actor} inicia sesion con credenciales invalidas")
    public void iniciaSesionConCredencialesInvalidas(Actor actor) {
        actor.attemptsTo(Login.withCredentials(
                TestDataReader.get("user.invalid"),
                TestDataReader.get("password.invalid")
        ));
    }

    @Then("{actor} debe ver un mensaje de error {string}")
    public void debeVerUnMensajeDeError(Actor actor, String expectedErrorMessage) {
        actor.attemptsTo(
                Ensure.that(ErrorMessage.text()).isEqualTo(expectedErrorMessage)
        );
    }
}
