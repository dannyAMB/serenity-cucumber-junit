package PruebasPronox;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" } )

public class Runner{}
