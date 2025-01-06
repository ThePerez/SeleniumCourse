package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        try {
            // Asegúrate de que el especificador de formato es correcto
            String formattedString = String.format("Navegando a la sección: %s", sectionLink);
            System.out.println(formattedString);
            // Código para encontrar y hacer clic en el enlace de la sección
            WebElement link = driver.findElement(By.xpath("//a[normalize-space()='" + sectionLink + "' and @href]"));
            link.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
// a[normalize-space()='Tabs']
// a[normalize-space()='Slider']
// a[normalize-space()='ToolTip']
// a[contains(@class,'button tiny_button button_pale
// regular_text')][normalize-space()='AlertBox']
// a[normalize-space()='DialogBox']
// a[normalize-space()='ProgressBar']