package pages;

public class Principal extends BasePage {

    public Principal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToGlobalSQA() {
        navigateTo("https://www.amazon.com");
    }

}
