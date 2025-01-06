package pages;

public class PaginaPrincipal extends BasePage {

    private String aboutButton = "//li[@id='menu-item-53896']//a[normalize-space()='About']";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToDemoQA() {
        navigateTo("https://www.globalsqa.com");
        clickElement(aboutButton);
    }
}
