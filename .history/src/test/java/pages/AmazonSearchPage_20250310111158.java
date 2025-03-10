package pages;

public class AmazonSearchPage extends BasePage {

    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[66]/div[1]/div[1]/span[1]/ul[1]/li[3]/span[1]/a[1]";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedMessageText = "//h1[normalize-space()='Added to cart']";

public AmazonSearchPage(){
    super(driver);
}

public void navigateToAmazon(){
    navigateTo("https://www.amazon.com/");
}

public void enterSearchCriteria(String criteria){
    write(searchBox,criteria);
}

public void clickSearch(){
    clickElement(searchButton);
}

public void goToPage(String pageNumber){
    goToLinkText(pageNumber);
}

public void pick3rdItem(){
    clickElement(thirdResult);
}

public void addToCart(){
    clickElement(addToCartButton);
}

public String addedToCartMessage(){
    return textFromElement(addedMessageText);
}
}








}
