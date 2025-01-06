package steps;

import io.cucumber.java.en.*;
import pages.PaginaListas;
import pages.PaginaPrincipal;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaListas listasPage = new PaginaListas();

    @Given("I navigate to www.globalsqa.com")
    public void navigateToGlobalSQA() {
        landingPage.navigateToGlobalSQA();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @And("Select SQL Cheat Sheet")
    public void navigateToSQL() {
        listasPage.clickCheatSheets();
    }
}
