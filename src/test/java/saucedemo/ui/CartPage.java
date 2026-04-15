package saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target TEXT_PRODUCT_BY_NAME = Target.the("texto del producto {0}").locatedBy("//div[contains(@class,'inventory_item_name') and normalize-space()='{0}']");

    public static final Target CHECKOUT_BUTTON = Target.the("botón de checkout").locatedBy("[data-test='checkout']");


    public static final Target REMOVE_PRODUCT_BUTTON = Target.the("botón remove del producto {0}").locatedBy("//div[contains(@class,'cart_item') and .//div[contains(@class,'inventory_item_name') and normalize-space()='{0}']]//button[contains(@data-test,'remove')]");
}
