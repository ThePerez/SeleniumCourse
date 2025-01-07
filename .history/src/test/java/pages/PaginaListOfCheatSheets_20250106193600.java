package pages;

public class PaginaListOfCheatSheets extends BasePage {

    private String SQLCheatSheetLink = "//a[normalize-space()='SQL Cheat Sheet'";

    public PaginaListOfCheatSheets() {
        super(driver);
    }

    public void clickSQL() {
        clickElement(SQLCheatSheetLink);
    }

}

// a[normalize-space()='SQL Cheat Sheet']