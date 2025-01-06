package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='%' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToGlobalSQA() {
        navigateTo("https://www.globalsqa.com/demo-site/");
    }

    public void clickOnSectionNavigationBar(String section) {
        // Reemplazar el marcador de posición con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);

    }
}
// li[@id='menu-item-53896']//a[normalize-space()='About']
// li[@id='menu-item-6898']//a [normalize-space()='CheatSheets']
// a[@class='no_border'] [normalize-space()='Free Ebooks']
// a[@class='no_border'][contains(text(),'Tester’s Hub')]
// li[@id='menu-item-1561']//a[normalize-space()='Contact Us']