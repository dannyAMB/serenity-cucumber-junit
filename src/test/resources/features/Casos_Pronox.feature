#language: es

@Cucumber
Característica: entrando a Pronox
esta feature se trata de entrar en Pronox e intaractuar con la página
#con(mvn clean verify -Dcucumber.options=" --tags @Regresion") solo ejecutas @Regresión

  Escenario: se loguea
    Dado Que Danny entra en Pronox
    Cuando Danny ingresa el usuario o mail: Admin@cognox.com
    Entonces Danny deberia ver: Sesión iniciada con éxito.



