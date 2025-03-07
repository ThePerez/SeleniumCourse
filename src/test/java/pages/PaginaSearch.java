package pages;

public class PaginaSearch extends BasePage {

    private String returnLink = "//a[normalize-space()='Help']";

    public PaginaSearch() {
        super(driver);
    }

    public void clickReturn() {
        clickElement(returnLink);
    }
}
