package steps;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;

import pages.Principal;

public class AlexSteps {

    SoftAssert soft = new SoftAssert();

    Principal landingPage = new Principal();

    @Given("I navigate to www.amazon.com")
    public void navigateToGlobalSQA() {
        landingPage.navigateToGlobalSQA();
    }

}