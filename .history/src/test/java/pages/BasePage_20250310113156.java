package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    private static Actions action;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    /*
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el
     * driver del navegador
     */
    static {
        WebDriverManager.chromedriver().setup();

        // Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();
    }

    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como
     * argumento.
     */
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    // Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }

    public void goToLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
        ;
    }

    // Método estático para cerrar la instancia del driver.
    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }

    public void write(String locator, String textToWrite) {
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, Integer index) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(index);
    }

    public int dropdownSize(String locator) {
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions.size();
    }

    public void selectNthElement(String locator, int index) {
        List<WebElement> results = driver.findElements(By.xpath(locator));
        results.get(index).click();
    }

    public List<String> getDropdownValues(String locator) {
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownOptions) {
            values.add(option.getText());
        }
        return values;
    }

}