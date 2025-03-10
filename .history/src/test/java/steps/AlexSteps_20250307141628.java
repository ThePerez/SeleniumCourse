package steps;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
import pages.PaginaSearch;

public class AlexSteps {

    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaSearch tabsPage = new PaginaSearch();

    @Given("the user navigates to www.amazon.com")
    public void navigateToAmazon() {
        landingPage.navigateToAmazon();
    }

    @And("searches for <Product>")
    public void navigateToTabs() {
        tabsPage.clickReturn();
    }
}