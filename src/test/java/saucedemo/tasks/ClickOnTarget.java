package saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOnTarget {
    public static Performable element(Target target, String label) {
        return Task.where("{0} hace clic en " + label,
                Click.on(target));
    }
}