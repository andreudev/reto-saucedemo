package saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import saucedemo.ui.InventoryPage;

public class InventoryTitle implements Question<String> {

    public static InventoryTitle text() {
        return new InventoryTitle();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(InventoryPage.TITLE).answeredBy(actor);
    }
}