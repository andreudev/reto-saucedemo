package saucedemo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import saucedemo.questions.CartBadgeNameProduct;
import saucedemo.questions.OrderConfirmationMessage;
import saucedemo.tasks.AddProductsToCart;
import saucedemo.tasks.ClickOnTarget;
import saucedemo.tasks.FillFormCheckout;
import saucedemo.tasks.OpenCart;
import saucedemo.tasks.RemoveProductsToCart;
import saucedemo.ui.PurchaseActions;

public class CartStepDefinitions {
    @When("{actor} agrega el producto {string} al carrito")
    public void agregaElProductoAlCarrito(Actor actor, String productName) {
        actor.attemptsTo(AddProductsToCart.byName(productName));

    }

    @Then("{actor} ve el producto {string} en el carrito")
    public void productoSeMuestraEnElCarrito(Actor actor,String productName) {
        actor.attemptsTo(Ensure.that(CartBadgeNameProduct.text(productName)).isEqualTo(productName));
    }

    @And("{actor} va al carrito")
    public void vaAlCarrito(Actor actor) {
        actor.attemptsTo(OpenCart.open());
    }

    @And("{actor} hace clic en {string}")
    public void haceClicEn(Actor actor, String actionName) {
        actor.attemptsTo(
                ClickOnTarget.element(PurchaseActions.byName(actionName), actionName)
        );
    }

    @And("{actor} ingresa su informacion de envio con nombre {string}, apellido {string} y codigo postal {string}")
    public void ingresaSuInformacionDeEnvioConNombreApellidoYCodigoPostal(Actor actor,String firstName, String lastName, String postalCode) {
        actor.attemptsTo(
                FillFormCheckout.with(firstName, lastName, postalCode)
        );
    }


    @Then("{actor} ve el mensaje de {string}")
    public void veElMensajeDeConfirmacionDeCompra(Actor actor, String expectedMessage) {
        actor.attemptsTo(
                Ensure.that(OrderConfirmationMessage.text()).isEqualTo(expectedMessage)
        );
    }

    @And("{actor} elimina el producto {string} del carrito")
    public void eliminaElProductoDelCarrito(Actor actor, String productName) {
        actor.attemptsTo(RemoveProductsToCart.byName(productName));
    }
}
