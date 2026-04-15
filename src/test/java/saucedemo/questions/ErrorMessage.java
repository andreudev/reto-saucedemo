package saucedemo.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ErrorMessage implements Question<String> {

    public static ErrorMessage text() {
        return new ErrorMessage();
    }

    @Override
    public String answeredBy(net.serenitybdd.screenplay.Actor actor) {
        return Text.of(saucedemo.ui.LoginPage.ERROR_MESSAGE).answeredBy(actor);
    }
}
