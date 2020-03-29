package PruebasPronox.Selenium;


import POO.Login;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class pruebaTest {
    protected WebDriver firefoxDriver;

    @Before
    public void abrirDriver(){
        //emcontrar archivo exe de geckodriver
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\geckodriver.exe");

        //Creamos opciones sobre nuestro driver
        ChromeDriver options = new ChromeDriver();

       // options.("marionette", false);

        //nueva instancia de FirefoxDriver
       // firefoxDriver = new FirefoxDriver(options);

        //definimos tiempo de espera hasta que aceptemos un timeout
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void hacer_navegacion() {

        //abrimos una URL
        firefoxDriver.get("https://pronox-stage.azurewebsites.net/raw/login");
        //limpiamos la caja de busqueda
        firefoxDriver.findElement(By.xpath("//input[@id='normal_login_email']")).sendKeys( "Admin@cognox.com");
        //encontrar e interactuar con elementos:

        firefoxDriver.findElement(By.xpath("//input[@id='normal_login_password']")).sendKeys(new Login().getPassword());

        //presionamos la tecla ENTER
        firefoxDriver.findElement(By.xpath("//input[@id='normal_login_password']")).sendKeys(Keys.ENTER);

        //manejamos el tiempo de espera para no obtener un falso positivo
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Hacer click sobre el link deseado
        firefoxDriver.findElement(By.xpath("//body/div[@id='root']/section[contains(@class,'custom-layout ant-layout ant-layout-has-sider')]/aside[contains(@class,'custom-layout-sider ant-layout-sider ant-layout-sider-dark ant-layout-sider-collapsed')]/div[contains(@class,'ant-layout-sider-children')]/ul[contains(@class,'ant-menu ant-menu-light ant-menu-inline-collapsed ant-menu-root ant-menu-vertical')]/li[contains(@class,'ant-menu-submenu ant-menu-submenu-vertical')]/div[contains(@class,'ant-menu-submenu-title')]/div[contains(@class,'custom-menu-icon-container')]/span/i[contains(@class,'anticon anticon-lock custom-menu-icon')]/*[1]")).click();

        firefoxDriver.findElement(By.xpath("//ul[@id='21$Menu']//li[1]")).click();

        firefoxDriver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg']")).click();

        firefoxDriver.findElement(By.xpath("//div[@class='ant-col custom-breadcrumb']")).click();

        //Creamos un elemento web para poder hacer acciones más avanzadas
        //  WebElement subtitulo = firefoxDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/p[1]/strong[1]"));

        //Verificamos que la cantidad de paises en latinoamerica
        // System.out.println(subtitulo.getText());

        // System.out.println(subtitulo.getText().contains("20"));

        // Assert.assertTrue(subtitulo.getText().contains("20"));



    }
    //
    @After
    public void cerrar_caso() {
        //cerramos el navedor
         firefoxDriver.quit();
    }






    }
