package saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import saucedemo.ui.CheckoutPage;

public class OrderConfirmationMessage implements Question<String> {
    public static OrderConfirmationMessage text() { return new OrderConfirmationMessage(); }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(
                CheckoutPage.SUCCESS_MESSAGE
        ).answeredBy(actor);
    }
}