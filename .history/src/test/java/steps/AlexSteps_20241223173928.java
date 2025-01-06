package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to www.globalsqa.com")
    public void iNavigateToDemoQA() {
        landingPage.navigateToDemoQA();

    }
}
