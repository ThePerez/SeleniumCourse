package steps;

import io.cucumber.java.en.*;
import pages.PaginaTabs;
import pages.PaginaPrincipal;
import pages.PaginaSortable;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaTabs tabsPage = new PaginaTabs();
    PaginaSortable sortablePage = new PaginaSortable();

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
}

// a[normalize-space()='Tabs']