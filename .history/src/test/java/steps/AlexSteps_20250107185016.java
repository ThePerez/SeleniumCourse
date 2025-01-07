package steps;

import io.cucumber.java.en.*;
import pages.PaginaTabs;
import pages.PaginaPrincipal;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaTabs listasPage = new PaginaTabs();

    @Given("I navigate to www.globalsqa.com")
    public void navigateToGlobalSQA() {
        landingPage.navigateToGlobalSQA();
    }

    @When("I go to Tabs using the navigation bar")
    public void clickTabs() {
        landingPage.clickElement("Tabs");
    }

    // @And("Select SQL Cheat Sheet")
    // public void navigateToSQL() {
    // listasPage.clickCheatSheets();
    // listCheats.clickSQL();
    // }
}

// a[normalize-space()='Tabs']