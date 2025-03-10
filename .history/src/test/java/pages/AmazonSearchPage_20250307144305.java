package pages;

public class AmazonSearchPage extends BasePage {

    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[66]/div[1]/div[1]/span[1]/ul[1]/li[3]/span[1]/a[1]";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedMessageText = "//h1[normalize-space()='Added to cart']";
}
