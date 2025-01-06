package pages;

public class PaginaPrincipal extends BasePage {

    private String aboutButton = "//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToDemoQA() {
        navigateTo("https://www.globalsqa.com/demo-site/");
        clickElement(aboutButton);
    }
}
