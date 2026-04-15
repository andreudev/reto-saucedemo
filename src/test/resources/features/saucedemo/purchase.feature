Feature: Compra en SauceDemo

  Background:
    Given Andrew abre SauceDemo
    And Andrew inicia sesion con credenciales validas


  @add_single_product
  Scenario: Agregar un producto al carrito
    When Andrew agrega el producto "Sauce Labs Backpack" al carrito
    And Andrew va al carrito
    Then  Andrew ve el producto "Sauce Labs Backpack" en el carrito


  @complete_purchase
  Scenario: Completar una compra
    When Andrew agrega el producto "Sauce Labs Bike Light" al carrito
    And Andrew va al carrito
    And Andrew hace clic en "Checkout"
    And Andrew ingresa su informacion de envio con nombre "Andrew", apellido "Smith" y codigo postal "12345"
    And Andrew hace clic en "Continue"
    And Andrew hace clic en "Finish"
    Then Andrew ve el mensaje de "Thank you for your order!"

    @add_multiple_products_and_complete_purchase
  Scenario: Agregar varios productos y completar la compra
    When Andrew agrega el producto "Sauce Labs Backpack" al carrito
    And Andrew agrega el producto "Sauce Labs Bike Light" al carrito
    And Andrew va al carrito
      And Andrew elimina el producto "Sauce Labs Bike Light" del carrito
    And Andrew hace clic en "Checkout"
    And Andrew ingresa su informacion de envio con nombre "Andrew", apellido "Smith" y codigo postal "12345"
    And Andrew hace clic en "Continue"
    And Andrew hace clic en "Finish"
    Then Andrew ve el mensaje de "Thank you for your order!"