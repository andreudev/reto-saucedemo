package saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target FIRST_NAME_INPUT = Target.the("campo de nombre").locatedBy("[data-test='firstName']");
    public static final Target LAST_NAME_INPUT = Target.the("campo de apellido").locatedBy("[data-test='lastName']");
    public static final Target POSTAL_CODE_INPUT = Target.the("campo de codigo postal").locatedBy("[data-test='postalCode']");
    public static final Target CONTINUE_BUTTON = Target.the("boton de continuar").locatedBy("[data-test='continue']");

    public static final Target FINISH_BUTTON = Target.the("boton de finalizar").locatedBy("[data-test='finish']");

    public static final Target SUCCESS_MESSAGE = Target.the("mensaje de exito").locatedBy("[data-test='complete-header']");
}
