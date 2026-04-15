package saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import saucedemo.ui.CartPage;

public class RemoveProductsToCart {

    public static Performable byName(String productName) {
        return Task.where("{0} elimina el producto " + productName + " del carrito",
                Click.on(CartPage.REMOVE_PRODUCT_BUTTON.of(productName))
        );
    }
}
