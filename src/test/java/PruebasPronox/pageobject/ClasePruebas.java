package PruebasPronox.pageobject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("https://pronox-stage.azurewebsites.net/raw/login")
public class ClasePruebas extends PageObject {
    public final String tiempo = "0";
    @FindBy(xpath = "//input[@id='normal_login_email']")
    WebElementFacade BoxUser;
    @FindBy(xpath = "//input[@id='normal_login_password']")
    WebElementFacade BoxPassword;
    /*@FindBy(xpath = "//button[@class='ant-btn custom-button ant-btn-primary ant-btn-round ant-btn-lg']")
    WebElementFacade Boton;*/
    @FindBy(xpath = "//*[@id='root']/section/section/main/div[2]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div/div[5]/div/div/div/span/button", timeoutInSeconds = tiempo)
    WebElementFacade Filtre;
    @FindBy(xpath = "//input[@id='type']", timeoutInSeconds = tiempo)
    WebElementFacade comboBox;
    @FindBy(xpath = "//body/div[@id='root']/section[@class='custom-layout ant-layout ant-layout-has-sider']/section[@class='custom-content-layout ant-layout']/main[@class='custom-layout-content ant-layout-content']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/form[@class='ant-form ant-form-horizontal']/div[@class='ant-row']/div[@class='ant-col ant-col-6']/div[@class='ant-row ant-form-item']/div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-24 ant-col-sm-24']/div[@class='ant-form-item-control']/span[@class='ant-form-item-children']/div[@id='project']/div[1]/div[1]", timeoutInSeconds = tiempo)
    WebElementFacade comboBox2;
    @FindBy(xpath = "//div[@id='project']", timeoutInSeconds = tiempo)
    WebElementFacade comboBox3;
    @FindBy(xpath = "//body/div[@id='root']/section[@class='custom-layout ant-layout ant-layout-has-sider']/section[@class='custom-content-layout ant-layout']/main[@class='custom-layout-content ant-layout-content']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/form[@class='ant-form ant-form-horizontal']/div[@class='ant-row']/div[@class='ant-col ant-col-6']/div[@class='ant-row ant-form-item']/div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-24 ant-col-sm-24']/div[@class='ant-form-item-control']/span[@class='ant-form-item-children']/div[@id='project']/div[1]", timeoutInSeconds = tiempo)
    WebElementFacade comboBox4;
    //div[@class='ant-col ant-form-item-label ant-col-xs-24 ant-col-sm-5']//label//font//font[contains(text(),'Proyecto')]

    @FindBy(xpath = "//div[@class='ant-col ant-form-item-label ant-col-xs-24 ant-col-sm-5']//label//font//font[contains(text(),'Proyecto')]", timeoutInSeconds = tiempo)
    WebElementFacade titulo;
    @FindBy(xpath = "//h1[@class='custom-title']", timeoutInSeconds = tiempo)
    WebElementFacade titulo2;
    @FindBy(xpath = "//body/div[@id='root']/section[@class='custom-layout ant-layout ant-layout-has-sider']/section[@class='custom-content-layout ant-layout']/main[@class='custom-layout-content ant-layout-content']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div/div[@class='infinite-scroll-component__outerdiv']/div[contains(@class,'infinite-scroll-component')]/div[@class='ant-row-flex custom-project-view']/div[1]/div[1]/div[1]/div[1]", timeoutInSeconds = tiempo)
    WebElementFacade ComercialGC;
    @FindBy(xpath = "//ul[@id='21$Menu']//li[1]", timeoutInSeconds = tiempo)
    WebElementFacade usuarios;
    //body/div[@id='root']/section[contains(@class,'custom-layout ant-layout ant-layout-has-sider')]/aside[contains(@class,'custom-layout-sider ant-layout-sider ant-layout-sider-dark ant-layout-sider-collapsed')]/div[contains(@class,'ant-layout-sider-children')]/ul[contains(@class,'ant-menu ant-menu-light ant-menu-inline-collapsed ant-menu-root ant-menu-vertical')]/li[contains(@class,'ant-menu-submenu ant-menu-submenu-vertical')]/div[contains(@class,'ant-menu-submenu-title')]/div[contains(@class,'custom-menu-icon-container')]/span/i[contains(@class,'anticon anticon-solution custom-menu-icon')]/*[1]
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]", timeoutInSeconds = tiempo)
    WebElementFacade Seguridad2;
    @FindBy(xpath = "//body/div[@id='root']/section[contains(@class,'custom-layout ant-layout ant-layout-has-sider')]/aside[contains(@class,'custom-layout-sider ant-layout-sider ant-layout-sider-dark ant-layout-sider-collapsed')]/div[contains(@class,'ant-layout-sider-children')]/ul[contains(@class,'ant-menu ant-menu-light ant-menu-inline-collapsed ant-menu-root ant-menu-vertical')]/li[contains(@class,'ant-menu-submenu ant-menu-submenu-vertical')]/div[contains(@class,'ant-menu-submenu-title')]/div[contains(@class,'custom-menu-icon-container')]/span/i[contains(@class,'anticon anticon-lock custom-menu-icon')]/*[1]", timeoutInSeconds = tiempo)
    WebElementFacade Seguridad4;
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']", timeoutInSeconds = "20")
    WebElementFacade ButtonNuevoUsuario;

    @FindBy(xpath = "//div[@class='ant-col custom-breadcrumb']", timeoutInSeconds = "20")
    WebElementFacade TextTitulo;


    public void WriteData(String userLogin, String password) {
        BoxUser.type(userLogin);
        BoxPassword.type(password).sendKeys(Keys.ENTER);
    }

   /* public void ClickBotonlogin() {
        Boton.click();
    }*/

   /* public void pruebasDelFiltro() {
        ///////////////////////
        try {
            System.out.println(titulo2.getText());
        } catch (Exception e) {
            System.out.println("excepción1:" + e.getCause());
        }
        ////////////////////////
        try {
            System.out.println(titulo.getText());
        } catch (Exception e) {
            System.out.println("excepción2:" + e.getCause()); }
        //////////////////////////
        try {
            comboBox4.click();
            System.out.println("Se ejecuta: comboBox4");
        } catch (Exception e) {
            System.out.println("excepción3:" + e.getCause());
        }
        //////////////////////////
        try {

            comboBox3.click();
            System.out.println("Se ejecuta: comboBox3");
        } catch (Exception e) {
            System.out.println("excepción4:" + e.getCause());
        }

        //////////////////////////
        try {

            comboBox2.click();
            System.out.println("Se ejecuta: comboBox2");
        } catch (Exception e) {
            System.out.println("excepción5:" + e.getCause());
        }
        //////////////////////////
        try {

            comboBox.click();

        } catch (Exception e) {
            System.out.println("excepción6:" + e.getCause());
        }
        //////////////////////////
        try {

            comboBox.type("hola");

        } catch (Exception e) {
            System.out.println("excepción7:" + e.getCause());
        }

        /////////////////////

        try {


            Filtre.click();
            System.out.println("Se ejecuta: Filtre");
        } catch (Exception e) {
            System.out.println("excepción8:" + e.getCause());
        }

    /////////////////////

        try {


        ComercialGC.click();
        System.out.println("Se ejecuta: ComercialGC");
    } catch (Exception e) {
        System.out.println("excepción8:" + e.getCause());
    }



    }*/

    @FindBy(xpath = "//button[@id='status']", timeoutInSeconds = "20")
    WebElementFacade buttonEstado;


    public void pruebaUsuarios() {
        /////////////////////

        try {


            Seguridad4.click();
            System.out.println("click en seguridad");
        } catch (Exception e) {
            System.out.println("excepción (click en: seguridad):" + e.getCause());
        }
        /////////////////////

        try {
            usuarios.click();
            System.out.println("click en: usuarios: ");
        } catch (Exception e) {
            System.out.println("excepción (click en: usuarios):" + e.getCause());
        }
        /////////////////////
        try {

            Seguridad2.click();
            System.out.println("click en: " + Seguridad2.getClass() + Seguridad2.getTextValue());
        } catch (Exception e) {
            System.out.println("excepción (click en: seguridad2):" + e.getCause());
        }
        //botón Nuevo usuario
        try {

            ButtonNuevoUsuario.click();
        } catch (Exception e) {
            System.out.println("excepción (click en: botón Nuevo usuario):" + e.getCause());
        }


        //Text titulo Opción

        try {
            String textTitulo = TextTitulo.getText();
            System.out.println("get: Text opción: " + textTitulo);
        } catch (Exception e) {
            System.out.println("excepción (click en: Text Crear Usuario):" + e.getCause());
        }

        //formularo crear usuario

        String[] elements = {"name", "email", "charge"};
        String[] Text = {"danny", "", "jefe"};
        String estado = "";
        for (int i = 0; i < 2; i++) {

            try {
                System.out.println("se escribe : " + elements[i]);
                estado = "Click en input " + elements[i];
                findBy("//input[@id='" + elements[i] + "']").click();
                estado = "Type en input " + elements[i];
                findBy("//input[@id='" + elements[i] + "']").type(Text[i]);
                System.out.println(elements[i] + " Escrito");
                if (i == 1) {
                    try {
                        estado = "Select option " + elements[i];
                        find(By.xpath("//div[@class='ant-select-selection__rendered']")).click();
                        find(By.xpath("//li[contains(@class,'ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active')]")).click();
                        System.out.println("Rol Administrador escrito");
                    } catch (Exception e) {
                        System.out.println("excepción " + estado + ". Cause :" + e.getCause());
                    }
                }
            } catch (Exception e) {
                System.out.println("Excepción " + estado + ". Cause: " + e.getCause());
            }
        }


        try {

            estado = "Button Status ";

            find(By.xpath("//button[@id='status']")).click();

            System.out.println("se pulsa :" + estado);


            estado = "estatus " + find(By.xpath("//span[@class='ant-switch-inner']")).getText();


            System.out.println("retorna  :" + estado);


        } catch (Exception e) {
            System.out.println("Excepción " + estado + ". Cause: " + e.getCause());
        }

        try {

            estado = "Button Guardar ";

            find(By.xpath("//button[@class='ant-btn custom-full-width ant-btn-primary ant-btn-lg']")).click();

            System.out.println("se pulsa :" + estado);

        } catch (Exception e) {
            System.out.println("Excepción " + estado + ". Cause: " + e.getCause());
        }

        try {

            estado = "Button Cancelar ";

            find(By.xpath("//button[@class='ant-btn custom-full-width ant-btn-lg']")).click();
            System.out.println("se pulsa :" + estado);


        } catch (Exception e) {
            System.out.println("Excepción " + estado + ". Cause: " + e.getCause());
        }


    }
}


