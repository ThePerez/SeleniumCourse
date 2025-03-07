package pages;

public class PaginaSearch extends BasePage {

    private String tabsLink = "//a[normalize-space()='Returns']";

    public PaginaSearch() {
        super(driver);
    }

    public void clickTabs() {
        clickElement(tabsLink);
    }
}
// span[normalize-space()='Returns']