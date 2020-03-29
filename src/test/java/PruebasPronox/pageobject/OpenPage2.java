package PruebasPronox.pageobject;

import POO.Login;
import net.thucydides.core.annotations.Shared;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class OpenPage2 {

    String URL = "";

    public OpenPage2(String URL) {
        this.URL = URL;
    }

    @Shared
    PronoxPaginaPrincipal PaginaPrincipal;

public void open(){


        String page=  getPages().getDriver().getCurrentUrl();
        System.out.println("traer página: " + page);
        String pageLogin = "https://pronox-stage.azurewebsites.net/raw/login";
        if(pageLogin.equals(page)) {

            PaginaPrincipal.setDefaultBaseUrl(URL);
            PaginaPrincipal.open();
        }else {
            PaginaPrincipal.setDefaultBaseUrl(pageLogin);
            PaginaPrincipal.open();
            PaginaPrincipal.WriteData("Admin@cognox.com", new Login().getPassword());

        }}

}
