package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaTabs;
import pages.PaginaCountry;
import pages.PaginaPrincipal;
import pages.PaginaSortable;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaTabs tabsPage = new PaginaTabs();
    PaginaSortable sortablePage = new PaginaSortable();
    PaginaCountry country = new PaginaCountry();

    @Given("I navigate to www.globalsqa.com")
    public void navigateToGlobalSQA() {
        landingPage.navigateToGlobalSQA();
    }

    @When("I go to Tabs using the navigation bar")
    public void navigateToTabs() {
        tabsPage.clickTabs();
    }

    @When("I select DropDown Button")
    public void selectDropdownButton() {
        landingPage.clickOnDropDownButton();
    }

    @And("Select Sortable option")
    public void navigateToSortable() {
        sortablePage.clickSortable();
    }

    @Then("I can validate the option in the country page")
    public void validateCountry() {
        List<String> lista = country.returnCountryValues();
        List<String> listaEsperada = Arrays.asList("Afghanistan", "Andorra", "Argentina");

        Assert.assertEquals(listaEsperada, lista);
    }
}