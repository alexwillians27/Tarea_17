package tests;

public class CinemaTest {
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.junit.Assert;
    import org.junit.Test;

    @Test
    public void CinemaSeleniumTest() {
        // Configuración del driver (Asegúrate de tener el chromedriver instalado)
        System.setProperty("webdriver.chrome.driver", "ruta/a/tu/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Ir a la página (sustituye por tu local u online)
            driver.get("http://localhost:8080/cinema-booking");

            // 2. Interactuar con los elementos
            driver.findElement(By.id("movie-input")).sendKeys("The Clean Coder");
            driver.findElement(By.id("type-select")).sendKeys("VIP");
            driver.findElement(By.id("age-input")).sendKeys("15"); // Menor de edad

            driver.findElement(By.id("submit-button")).click();

            // 3. Verificar el resultado esperado
            // Si el precio VIP es 15.0 y el descuento es 20%, el resultado debe ser 12.0
            WebElement priceResult = driver.findElement(By.id("final-price"));
            String actualPrice = priceResult.getText();

            Assert.assertEquals("12.0", actualPrice);
            System.out.println("Test Passed: Discount applied correctly!");

        } finally {
            driver.quit();
        }
    }
}
