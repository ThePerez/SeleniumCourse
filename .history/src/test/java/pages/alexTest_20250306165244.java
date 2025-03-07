package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class alexTest {
    private WebDriver driver; // Corrección: WebDriver, no Webdriver

    @BeforeMethod
    public void setUp() {
        // Inicializa el WebDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Corrección: ChromeDriver, no ChromerDriver
    }

    @Test
    public void navegamosAalexTest() {
        // navega a la pagina Web
        driver.get("https://www.amazon.com"); // Corrección: La URL se pasa directamente al método get()
    }

    @AfterMethod
    public void tearDown() {
        // Cierra el navegador después de la prueba
        if (driver != null) {
            driver.quit();
        }
    }
}