package pages;

public class PaginaPrincipal extends BasePage {

    private String freeBooks = "//a[normalize-space()='%s' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToGlobalSQA() {
        navigateTo("https://www.globalsqa.com/demo-site/");
    }

    public void clickOnSectionNavigationBar(String section) {
        // Reemplazar el marcador de posición con el nombre
        String xpathSection = String.format(freeBooks, section);
        clickElement(xpathSection);

    }
}
