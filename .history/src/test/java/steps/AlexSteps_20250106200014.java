package steps;

import io.cucumber.java.en.*;
import pages.PaginaListOfCheatSheets;
import pages.PaginaListas;
import pages.PaginaPrincipal;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaListas listasPage = new PaginaListas();
    PaginaListOfCheatSheets listCheats = new PaginaListOfCheatSheets();

    @Given("I navigate to www.globalsqa.com")
    public void navigateToGlobalSQA() {
        landingPage.navigateToGlobalSQA();
    }

    @When("I go to CheatSheets using the navigation bar")
    public void clickCheatSheets() {
        landingPage.clickElement("CheatSheets");
    }

    @And("Select SQL Cheat Sheet")
    public void navigateToSQL() {
        listasPage.clickCheatSheets();
        listCheats.clickSQL();
    }
}
