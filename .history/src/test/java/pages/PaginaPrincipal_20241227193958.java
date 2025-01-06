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
// a[normalize-space()='Tabs']
// a[normalize-space()='Slider']
// a[normalize-space()='ToolTip']
// a[contains(@class,'button tiny_button button_pale
// regular_text')][normalize-space()='AlertBox']
// a[normalize-space()='DialogBox']
// a[normalize-space()='ProgressBar']