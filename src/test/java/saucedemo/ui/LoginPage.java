package saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("campo username").locatedBy("[data-test='username']");
    public static final Target PASSWORD_FIELD = Target.the("campo password").locatedBy("[data-test='password']");
    public static final Target LOGIN_BUTTON = Target.the("boton login").locatedBy("[data-test='login-button']");
    public static final Target ERROR_MESSAGE = Target.the("mensaje de error").locatedBy("[data-test='error']");
}
