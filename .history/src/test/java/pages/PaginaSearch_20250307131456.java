package pages;

public class PaginaSearch extends BasePage {

    private String tabsLink = "//a[normalize-space()='Cart']";

    public PaginaSearch() {
        super(driver);
    }

    public void clickTabs() {
        clickElement(tabsLink);
    }
}