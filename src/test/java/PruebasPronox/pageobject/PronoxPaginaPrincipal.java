package PruebasPronox.pageobject;

import POO.Login;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;
import static net.thucydides.core.annotations.ClearCookiesPolicy.Never;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

@DefaultUrl("https://pronox-stage.azurewebsites.net/raw/login")
public class PronoxPaginaPrincipal extends PageObject {
    protected WebDriver driver;
    @Managed(clearCookies = BeforeEachTest)

    public final String tiempo = "10";
    @FindBy(xpath = "//input[@id='normal_login_email']")
    WebElementFacade BoxUser;
    @FindBy(xpath = "//input[@id='normal_login_password']")
    WebElementFacade BoxPassword;
    @FindBy(xpath = "//ul[@id='21$Menu']//li[1]", timeoutInSeconds = tiempo)
    WebElementFacade usuarios;
    //body/div[@id='root']/section[contains(@class,'custom-layout ant-layout ant-layout-has-sider')]/aside[contains(@class,'custom-layout-sider ant-layout-sider ant-layout-sider-dark ant-layout-sider-collapsed')]/div[contains(@class,'ant-layout-sider-children')]/ul[contains(@class,'ant-menu ant-menu-light ant-menu-inline-collapsed ant-menu-root ant-menu-vertical')]/li[contains(@class,'ant-menu-submenu ant-menu-submenu-vertical')]/div[contains(@class,'ant-menu-submenu-title')]/div[contains(@class,'custom-menu-icon-container')]/span/i[contains(@class,'anticon anticon-solution custom-menu-icon')]/*[1]
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]", timeoutInSeconds = tiempo)
    WebElementFacade Seguridad2;
    @FindBy(xpath = "//body/div[@id='root']/section[contains(@class,'custom-layout ant-layout ant-layout-has-sider')]/aside[contains(@class,'custom-layout-sider ant-layout-sider ant-layout-sider-dark ant-layout-sider-collapsed')]/div[contains(@class,'ant-layout-sider-children')]/ul[contains(@class,'ant-menu ant-menu-light ant-menu-inline-collapsed ant-menu-root ant-menu-vertical')]/li[contains(@class,'ant-menu-submenu ant-menu-submenu-vertical')]/div[contains(@class,'ant-menu-submenu-title')]/div[contains(@class,'custom-menu-icon-container')]/span/i[contains(@class,'anticon anticon-lock custom-menu-icon')]/*[1]", timeoutInSeconds = tiempo)
    WebElementFacade Seguridad4;
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']", timeoutInSeconds = tiempo)
    WebElementFacade ButtonNuevoUsuario;

    @FindBy(xpath = "//div[@class='ant-col custom-breadcrumb']", timeoutInSeconds = tiempo)
    WebElementFacade TextTitulo;
    @FindBy(xpath = "//ul[contains(@class,'ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical')]", timeoutInSeconds = tiempo)
    WebElementFacade Roles;
    @FindBy(xpath = "//li[contains(@class,'ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active')]", timeoutInSeconds = tiempo)
    WebElementFacade roles2;


    public void WriteData(String userLogin, String password) {
        BoxUser.type(userLogin);
        BoxPassword.type(password).sendKeys(Keys.ENTER);
    }


    /////////////////////

    public void ClickEnSeguridad() {

        Seguridad4.click();

    }

    public void ClickEnUsuarios() {
        usuarios.click();
    }


    /////////////////////


    /////////////////////


    public void SelectCreaUsuario() {

        ButtonNuevoUsuario.click();
        //tr[4]//td[1]
    }


    public void llenarFormulario(String nombre, String email, String estado, String rol, String Cargo) {
        System.out.println(nombre +" "+ email +" "+ estado +" "+rol +" "+ Cargo);

        //formularo crear usuario

        String[] elements = {"name", "email", "charge"};
        String[] Text = {nombre, email, Cargo};

        find(By.xpath("//input[@id='" + elements[0] + "']")).click();
        withTimeoutOf(Duration.ofSeconds(10)).find(By.xpath("//input[@id='" + elements[0] + "']")).type(Text[0]);

        withTimeoutOf(Duration.ofSeconds(5)).find(By.xpath("//input[@id='" + elements[1] + "']")).type(Text[1]);




        withTimeoutOf(Duration.ofSeconds(5)).find(By.xpath("//div[@id='roles']")).click();

            try {


                withTimeoutOf(Duration.ofSeconds(5)).find(By.xpath("//li[contains(text(),'" + rol + "')]")).click();
                System.out.println("clickeó " + rol + "");
            } catch (Exception e) {
                System.out.println("excepción  " + rol + ":" + e.getCause());
            }

        find(By.xpath("//input[@id='" + elements[2] + "']")).type(Text[2]);






    //Botton status

            if(estado.equals("inactivo"))

    {

        withTimeoutOf(Duration.ofSeconds(10)).find(By.xpath("//button[@id='status']")).click();


    }

}





        public void ClickGuardar() {
          //Botton Guardar
               withTimeoutOf(Duration.ofSeconds(20)).find(By.xpath("//button[@class='ant-btn custom-full-width ant-btn-primary ant-btn-lg']")).click();
            //cerramos el navedor

       }
        public void ClickCancelar(){
           //Boton cancelar

            withTimeoutOf(Duration.ofSeconds(10)).find(By.xpath("//button[@class='ant-btn custom-full-width ant-btn-lg']")).click();

        }

        public void cerrar(){
            //div[@class='custom-header-user ant-dropdown-trigger']
            //li[@class='ant-menu-item ant-menu-item-active']
            // i[contains(@class,'anticon anticon-logout')]

            //button[contains(@class,'ant-btn ant-btn-primary')]

            withTimeoutOf(Duration.ofSeconds(9)).find(By.xpath("//div[@class='custom-header-user ant-dropdown-trigger']")).click();
            find(By.xpath("//div[@class='custom-header-user ant-dropdown-trigger']")).click();
          findBy("// i[contains(@class,'anticon anticon-logout')]").click();


        }


}








