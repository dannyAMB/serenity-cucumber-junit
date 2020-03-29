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



}

















