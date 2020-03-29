package PruebasPronox.stepdefinition;


import POO.Login;
import PruebasPronox.pageobject.PronoxPaginaPrincipal;
import PruebasPronox.steps.UsuarioPronox;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;


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
    @Pending
    @Entonces("^(.*) deberia ver: (.*)$")
    public void deberia_ver_la_confirmacion_de_que_entro(String UserLogin,String text) {
        UsuarioSteps.isCalled(UserLogin);
        UsuarioSteps.itisConfirmed(text);


    }

    //creamos un actor para poder ser inyectado en las anotaciones de los steps como #actor



}
