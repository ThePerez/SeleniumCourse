package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class AlexSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to https:\\www.globalsqa.com\\demo-site\\")
    public void iNavigateToDemoQA() {
        landingPage.navigateToDemoQA();

    }
}
