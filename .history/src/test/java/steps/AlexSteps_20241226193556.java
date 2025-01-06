package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to www.globalsqa.com")
    public void navigateToGlobalSQA() {
        landingPage.navigateToGlobalSQA();
    }

    @When("I go to a section using the navigation bar")
    public void navigationBarUse() {
        landingPage.clickOnSectionNavigationBar();
    }
}
