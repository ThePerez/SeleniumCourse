package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Principal extends BasePage {

    public Principal() {
        super(driver);
    }

    // Método para navegar a la página

    public void navigateToGlobalSQA() {
        navigateTo("https://www.amazon.com");
    }

    public void clickOnSectionNavigationBar(String sectionLink) {
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

    public void clickOnDropDownButton() {
        clickElement(dropDownButton);
    }

}
