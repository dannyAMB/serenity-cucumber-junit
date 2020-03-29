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
        assertThat(text,containsString(ResultadosPronox.confirmLoginDos()));
       System.out.println(ResultadosPronox.confirmLoginDos());

    }

    public void OpenPage2(String url) {

        principalPronox.setDefaultBaseUrl("https://pronox-stage.azurewebsites.net/dashboard");
        principalPronox.open();

    }

        @Step("#actor da Click en seguridad")
        public void Clickenseguridad() {
            principalPronox.ClickEnSeguridad();
       }
        @Step("#actor da Click en Usuarios")
        public void ClickEnUsuarios() {
            principalPronox.ClickEnUsuarios();
        }

        @Step("#actor Click en Crear un Usuarios")

        public void SelectCreaUsuario() {
            principalPronox.SelectCreaUsuario();
        }



        @Step
        public void EscribirDatosUsuarios(String  accion, String nombre, String correo,
                String estado,String rol, String cargo){
       System.out.println(accion);
            principalPronox.llenarFormulario(nombre,correo,estado,rol,cargo);


        }

        @Step("#actor da click en guardar")
        public void Clickguardar() {

            principalPronox.ClickGuardar();

        }
        @Step("#actor deberia ser confimado")

        public void ConfirmRegistro(String text){
            if(text.equals("Validación"))
            {
                System.out.println("está habilitadas las validaciones: " + ResultadosPronox.IsEnable() );
                List<String> resultados =    ResultadosPronox.obtenerResultadosValidaciones();


                resultados.replaceAll(String::toLowerCase);
                for(int i = 0; i  < resultados.size(); i++){
                    System.out.println(resultados.get(i));

                }
                assertThat(resultados, Matchers.everyItem(containsString(text)));

            } else {

                String result = ResultadosPronox.Confirm_status(text);

                System.out.println(result);
                assertThat(text, containsString(result));
            }

        }
    }







