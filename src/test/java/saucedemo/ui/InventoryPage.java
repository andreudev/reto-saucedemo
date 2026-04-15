package saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {
    public static final Target TITLE = Target.the("titulo de inventario").locatedBy(".title");

    public static final Target ADD_BUTTON_PRODUCT = Target.the("botón Add to cart del producto {0}")
            .locatedBy("//div[contains(@class,'inventory_item_description')][.//div[contains(@class,'inventory_item_name') and normalize-space()='{0}']]//button[starts-with(@id,'add-to-cart-')]");

    public static final Target CART_ICON = Target.the("icono del carrito").locatedBy("[data-test='shopping-cart-link']");
}