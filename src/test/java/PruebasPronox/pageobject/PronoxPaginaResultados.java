package PruebasPronox.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://pronox-stage.azurewebsites.net/raw/login")
public class PronoxPaginaResultados extends PageObject {


    @FindBy(xpath = "//body/div[@id='root']/section[@class='custom-layout ant-layout ant-layout-has-sider']/section[@class='custom-content-layout ant-layout']/main[@class='custom-layout-content ant-layout-content']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/form[@class='ant-form ant-form-horizontal']/div[@class='ant-row']/div[@class='ant-col ant-col-6']/div[@class='ant-row ant-form-item']/div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-24 ant-col-sm-24']/div[@class='ant-form-item-control has-success']/span[@class='ant-form-item-children']/div[@id='project']/div[1]/div[1]")
    WebElementFacade Name;

   /* public Boolean confirmLogin() {


    // waitForRenderedElements(find(By.xpath("//font[contains(text(),'"+NOMBRE_DE_USUARIO+"')]")));
      return find(By.xpath("//font[contains(text(),'"+NOMBRE_DE_USUARIO+"')]")).waitUntilEnabled();

       // return find(By.xpath("//font[contains(text(),'"+NOMBRE_DE_USUARIO+"')]")).isCurrentlyEnabled();
    }*/

    public static final String TITULO_RESULTADO = "//div[@class='ant-form-explain']";

    public String confirmLogin() {
        //withTimeoutOf(Duration.ofSeconds(10))
        //   .find(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
        String estado = "";

        try {
            estado = find(org.openqa.selenium.By.xpath("//div[@class='ant-message']")).getText();

        } catch (Exception e) {
            System.out.println("Excepción " + estado + ". Cause: " + e.getCause());
        }
        return estado;

        // return find(By.xpath("//body/div[@id='root']/section[@class='custom-layout ant-layout ant-layout-has-sider']/section[@class='custom-content-layout ant-layout']/main[@class='custom-layout-content ant-layout-content']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/div[@class='ant-row-flex']/div[@class='ant-col']/div[@class='ant-spin-nested-loading']/div[@class='ant-spin-container']/form[@class='ant-form ant-form-horizontal']/div[@class='ant-row']/div[@class='ant-col ant-col-6']/div[@class='ant-row ant-form-item']/div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-24 ant-col-sm-24']/div[@class='ant-form-item-control']/span[@class='ant-form-item-children']/div[@id='project']/div[1]")).isVisible();

    }
}



