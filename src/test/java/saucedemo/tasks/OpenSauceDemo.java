package saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import saucedemo.ui.SauceDemoHomePage;

public class OpenSauceDemo {
    public static Performable homePage() {
        return Task.where("{0} abre SauceDemo", Open.browserOn().the(SauceDemoHomePage.class));
    }
}
