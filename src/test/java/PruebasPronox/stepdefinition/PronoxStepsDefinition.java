package PruebasPronox.stepdefinition;


import POO.Login;
import PruebasPronox.pageobject.OpenPage2;
import PruebasPronox.pageobject.PronoxPaginaPrincipal;
import PruebasPronox.steps.UsuarioPronox;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.cucumber.java.an.Y;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageUrls;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;


public class PronoxStepsDefinition {
    @Steps(shared = true)
    UsuarioPronox UsuarioSteps;
    @Shared
    PronoxPaginaPrincipal PaginaPrincipal;

    @Dado("^Que (.*) entra en Pronox$")
    public void Open_Page(String userTest) {
        UsuarioSteps.isCalled(userTest);
        UsuarioSteps.OpenPage();

    }

    @Cuando("^(.*) ingresa el usuario o mail: (.*)$")
    public void Write_Data(String userTest, String user) {

        UsuarioSteps.isCalled(userTest);
        UsuarioSteps.WriteData(user, new Login().getPassword());


    }

    @Entonces("^(.*) deberia ver: (.*)$")
    public void deberia_ver_la_confirmacion_de_que_entro(String UserLogin,String text) {
        UsuarioSteps.isCalled(UserLogin);
        UsuarioSteps.itisConfirmed(text);


    }

    //creamos un actor para poder ser inyectado en las anotaciones de los steps como #actor




    @Dado("^que (.*) ingresa a usuarios$")
    public void ingresa_a_usuario(String UserLogin) {

        //new OpenPage2("https://pronox-stage.azurewebsites.net/dashboard").open();

        UsuarioSteps.isCalled(UserLogin);
        UsuarioSteps.Clickenseguridad();
        UsuarioSteps.ClickEnUsuarios();

    }

    @Y("^luego (.*)ingresa a crear un usuario$")
    public void ingresa_a_crear_usuario(String UserLogin) {
        UsuarioSteps.isCalled(UserLogin);

        UsuarioSteps.SelectCreaUsuario();
    }

    @Cuando("^(.*), (.*) nombre: (.*), correo: (.*), estado: (.*), rol: (.*), cargo: (.*)$")
    public void Crea_un_usuario(String UserLogin,String accion, String nombre, String correo, String estado ,String rol, String cargo) {
        UsuarioSteps.isCalled(UserLogin);

        if(nombre.equals("null")==false) {
            System.out.println(nombre);

            UsuarioSteps.EscribirDatosUsuarios(accion, nombre, correo, estado, rol, cargo);
        }
        UsuarioSteps.Clickguardar();

    }


    @Entonces("^(.*) deberia ver como resultado: (.*)$")
    public void Confirm_Registrado(String UserLogin, String text) {
        UsuarioSteps.isCalled(UserLogin);
        UsuarioSteps.ConfirmRegistro(text);
        PaginaPrincipal.cerrar();

    }
}
