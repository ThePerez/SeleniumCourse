package pages;

public class PaginaTabs extends BasePage {

    private String tabsLink = "//a[normalize-space()='Tabs']";

    public PaginaTabs() {
        super(driver);
    }

    public void clickTabs() {
        clickElement(tabsLink);
    }
}
