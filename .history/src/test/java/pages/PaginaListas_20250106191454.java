package pages;

public class PaginaListas extends BasePage {

    private String cheatsheetsLink = "//a[normalize-space()='CheatSheets' and @href";

    public PaginaListas() {
        super(driver);
    }

    public void clickCheatSheets() {
        clickElement(cheatsheetsLink);
    }
}
