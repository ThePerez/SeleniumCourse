package pages;

public class PaginaSearch extends BasePage {

    private String returnLink = "//a[normalize-space()='Returns']";

    public PaginaSearch() {
        super(driver);
    }

    public void clickReturn() {
        clickElement(returnLink);
    }
}
