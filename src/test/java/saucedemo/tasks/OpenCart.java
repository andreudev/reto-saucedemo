package saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import saucedemo.ui.InventoryPage;

public class OpenCart
{
    public static Performable open()
    {
        return Task.where("{0} abre el carrito",
                Click.on(InventoryPage.CART_ICON)
        );
    }
}
