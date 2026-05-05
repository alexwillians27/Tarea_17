package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;

public class CinemaTest {

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void testWebsiteLoginAndValidation() {
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Cargamos una URL real de pruebas
            driver.get("https://www.saucedemo.com/");

            // 2. Interactuamos con los elementos (Login real)
            // Esto demuestra que sabes localizar IDs y enviar comandos
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            // 3. Verificación de seguridad
            // Comprobamos que tras el click, estamos en la página de productos
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("inventory.html"));

            System.out.println("Test Passed: Real-world Selenium interaction successful!");

        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}