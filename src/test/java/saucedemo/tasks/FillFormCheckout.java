package saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import saucedemo.ui.CheckoutPage;

public class FillFormCheckout {
    public static Performable with(String firstName, String lastName, String postalCode) {
        return Task.where("{0} llena el formulario de checkout con sus datos",
                Enter.theValue(firstName).into(CheckoutPage.FIRST_NAME_INPUT)
                , Enter.theValue(lastName).into(CheckoutPage.LAST_NAME_INPUT)
                , Enter.theValue(postalCode).into(CheckoutPage.POSTAL_CODE_INPUT)
        );
    }
}
