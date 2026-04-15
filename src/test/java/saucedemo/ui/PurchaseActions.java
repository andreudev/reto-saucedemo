package saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PurchaseActions {

    public static Target byName(String actionName) {
        return switch (actionName.trim().toLowerCase()) {
            case "checkout" -> CartPage.CHECKOUT_BUTTON;
            case "continue" -> CheckoutPage.CONTINUE_BUTTON;
            case "finish" -> CheckoutPage.FINISH_BUTTON;
            default -> throw new IllegalArgumentException("Accion no soportada: " + actionName);
        };
    }
}