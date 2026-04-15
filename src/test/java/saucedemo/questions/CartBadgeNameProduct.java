package saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import saucedemo.ui.CartPage;


public class CartBadgeNameProduct implements Question<String> {

    private final String productName;

    private CartBadgeNameProduct(String productName) {
        this.productName = productName;
    }

    public static CartBadgeNameProduct text(String productName) {
        return new CartBadgeNameProduct(productName);
    }

    @Override
    public String answeredBy(Actor actor){
        return Text.of(CartPage.TEXT_PRODUCT_BY_NAME.of(productName)).answeredBy(actor);
    }

}
