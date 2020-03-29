#language: es

@Cucumber
Característica: entrando a Pronox
esta feature se trata de entrar en Pronox e intaractuar con la página
#con(mvn clean verify -Dcucumber.options=" --tags @Regresion") solo ejecutas @Regresión

  Antecedentes: se loguea
    Dado Que Danny entra en Pronox
    Cuando Danny ingresa el usuario o mail: Admin@cognox.com
    Entonces Danny deberia ver: Sesión iniciada con éxito.

  @Regresion
  Esquema del escenario: ingresar a crear un usuario.

    Dado que Danny ingresa a usuarios
    Y luego Danny ingresa a crear un usuario
    Cuando Danny, <accion> nombre: <nombre>, correo: <correo>, estado: <estado>, rol: <rol>, cargo: <cargo>
    Entonces Danny deberia ver como resultado: <resultado>

  Ejemplos:

   |Descripcion de prueba                       |nombre |correo               |estado   |rol          |cargo |resultado                     | accion              |
   #|El usuario  crea un usuario                 | Danny |dannyamb111@gmail.com|inactivo |Administrador|jefe  |Usuario creado con éxito.     | ingresa los datos: |
   #|El usuario valida que ya exista el usuario  | Danny |dannyamb111@gmail.com|inactivo |Administrador |jefe  |Correo electrónico duplicado.| ingresa los datos: |
   #|Validación de los campos                    | null  | null                | null    | null         |null  |Validación                    | no ingresa los datos:|
   |Validación el campo de correo                | Danny |dannyamb111gmail.com  |inactivo|Administrador |jefe | Correo electrónico invalido.  | no ingresa bien el correo|




