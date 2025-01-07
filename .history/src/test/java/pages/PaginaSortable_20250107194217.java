package pages;

public class PaginaSortable extends BasePage {

    private String sortableLink = "//span[normalize-space()='Sortable']";

    public PaginaSortable() {
        super(driver);
    }

    public void clickSortable() {
        clickElement(sortableLink);
    }
}
