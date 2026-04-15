package saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import saucedemo.ui.InventoryPage;

public class AddProductsToCart {
    public static Performable byName(String productName) {
        return Task.where("{0} agrega el producto " + productName + " al carrito",
                Click.on(InventoryPage.ADD_BUTTON_PRODUCT.of(productName))
        );
    }
}
