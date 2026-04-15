# Reto tecnico SauceDemo - Automatizacion con Serenity + Cucumber

Proyecto de automatizacion UI para https://www.saucedemo.com/ usando Java, Selenium WebDriver, Cucumber, Serenity BDD y Screenplay.

## Base del proyecto

Este proyecto se construyo tomando como referencia el repositorio oficial:

- https://github.com/serenity-bdd/serenity-cucumber-starter

Se uso este starter porque provee una estructura inicial recomendada para Serenity + Cucumber (runners, features, step definitions, configuracion de reportes y soporte para Screenplay).

## Tecnologias usadas

- Java
- Selenium WebDriver
- Cucumber (Gherkin)
- Serenity BDD
- Screenplay BDD
- JUnit 5
- Maven y Gradle

## Escenarios automatizados

1. Inicio de sesion exitoso con usuario valido.
2. Inicio de sesion fallido con usuario invalido.
3. Agregar un producto al carrito.
4. Completar una compra con un producto en el carrito.
5. Agregar multiples productos, eliminar uno y finalizar la compra.

## Estructura del proyecto

```text
src/test/java/saucedemo/
  runners/          -> runner principal de Cucumber
  stepdefinitions/  -> definicion de pasos
  tasks/            -> Tasks Screenplay
  questions/        -> Questions Screenplay para validaciones
  ui/               -> mapeo de elementos (Target)
  utils/            -> utilidades (lectura de datos, etc.)

src/test/resources/
  features/saucedemo/ -> archivos .feature
  serenity.conf       -> configuracion de Serenity/WebDriver
  testdata.properties -> datos sensibles de prueba
```

## Datos sensibles y configuracion

Las credenciales y datos configurables se manejan en `src/test/resources/testdata.properties`.

Ejemplo de llaves:

- `user.valid`
- `password.valid`
- `user.invalid`
- `password.invalid`

## Ejecucion de pruebas

### Opcion recomendada

```bash
./gradlew clean test aggregate
```

Este proyecto incluye `gradlew`, por lo que no necesitas tener Gradle instalado globalmente.

### Opcion Maven

```bash
mvn clean verify
```

### Ejecutar por tags con Gradle

```bash
./gradlew clean test aggregate -PcucumberTags="@login_exitoso"
```

```bash
./gradlew clean test aggregate -PcucumberTags="@login_exitoso or @login_fallido"
```

Si prefieres, tambien puedes usar la propiedad de sistema:

```bash
./gradlew clean test aggregate -Dcucumber.filter.tags="@login_exitoso"
```

## Reportes Serenity

Los reportes se generan automaticamente al ejecutar la suite.

- Reporte principal: `target/site/serenity/index.html`
- Resumen rapido: `target/site/serenity/summary.txt`

Capturas de pantalla:

- Configuradas en `src/test/resources/serenity.conf`
- Propiedad activa: `take.screenshots = FOR_EACH_ACTION`

## Entregables

- Codigo fuente del proyecto.
- Reportes Serenity generados en `target/site/serenity/`.
- Este README con instrucciones de ejecucion y estructura.

## Nota

El runner principal es `src/test/java/saucedemo/runners/CucumberTestSuite.java`.
