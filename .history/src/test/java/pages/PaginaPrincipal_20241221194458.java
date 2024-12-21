package pages;

public class PaginaPrincipal extends BasePage {

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToDemoQA() {
        navigateTo("https://demoqa.com");
    }

}
