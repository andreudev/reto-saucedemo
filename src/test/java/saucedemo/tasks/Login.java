package saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import saucedemo.ui.LoginPage;

public class Login {
    public static Performable withCredentials(String user, String pass) {
        return Task.where("{0} inicia sesion con credenciales",
                Enter.theValue(user).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(pass).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON));
    }
}