package PruebasPronox.steps;

import PruebasPronox.pageobject.PronoxPaginaPrincipal;
import PruebasPronox.pageobject.PronoxPaginaResultados;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class UsuarioPronox extends ScenarioActor {
    protected WebDriver driver;
    String actor;



    @Steps(shared = true)
    PronoxPaginaPrincipal principalPronox;
    @Steps(shared = true)
    PronoxPaginaResultados ResultadosPronox;

    @Step("#actor entra a la pagina de Pronox")
    public void OpenPage() {
        principalPronox.setDefaultBaseUrl("https://pronox-stage.azurewebsites.net/raw/login");
        principalPronox.open();

    }

    @Step("#actor ingresa el usuario o mail: {0} y contraseña")
    public void WriteData(String UserLogin, String password) {
        principalPronox.WriteData(UserLogin, password);
        //principalPronox.ClickBotonlogin();
    }

    @Step("#actor deberia ver la confirmación de que entró")
    public void itisConfirmed(String text) {
      /*boolean dato = ResultadosPronox.confirmLogin();
        System.out.println(dato);*/
        // principalPronox.pruebasDelFiltro();
        assertThat(text,containsString(ResultadosPronox.confirmLogin()));
       System.out.println(ResultadosPronox.confirmLogin());

    }

    }







