package pages;

public class PaginaPrincipal extends BasePage {

    public void navigateTo(String url) {
        driver.get(url);
    }

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToDemoQA() {
        navigateTo("https://demoqa.com");
    }

}
