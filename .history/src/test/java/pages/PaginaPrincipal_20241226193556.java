package pages;

public class PaginaPrincipal extends BasePage {

    private String freeBooks = "//a[normalize-space()='Free Ebooks' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToGlobalSQA() {
        navigateTo("https://www.globalsqa.com/demo-site/");
    }

    public void clickOnSectionNavigationBar() {
        clickElement(freeBooks);

    }
}
