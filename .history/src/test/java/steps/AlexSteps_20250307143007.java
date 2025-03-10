package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
import pages.PaginaSearch;

public class AlexSteps {

    AmazonSearchPage amazon = new AmazonSearchPage();

    @Given("^the user navigates to www.amazon.com")
    public void navigateToAmazon() {
        landingPage.navigateToAmazon();
    }

    @And("^searches for (.+)$")
    public void enterSearchCriteria(String criteria) {
        amazon.enterSearchCriteria(criteria);
        amazon.clickSearch();
    }

    @And("^navigates to the second page$")
    public void navigateToSecondPage() {
        amazon.goToPage2();
    }

    @And("^selects the third item$")
    public void selectsThirdItem() {
        amazon.pick3erItem();
    }

    @Then("^the user is able to add it to the cart$")
    public void itemCanBeAddedToTheCart() {
        amazon.addToCart();
        Assert.assertEquals("Agregado al carrito", amazon.addToCartMessage());
    }
}