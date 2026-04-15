Feature: Login en SauceDemo

  @login_exitoso
  Scenario: Inicio de sesion exitoso con usuario valido
    Given Andrew abre SauceDemo
    When Andrew inicia sesion con credenciales validas
    Then Andrew debe ver el titulo de inventario "Products"

  @login_fallido
    Scenario: Inicio de sesion fallido con usuario invalido
        Given Andrew abre SauceDemo
        When Andrew inicia sesion con credenciales invalidas
        Then Andrew debe ver un mensaje de error "Epic sadface: Username and password do not match any user in this service"