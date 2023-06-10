package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("start-maximized");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://www.suacedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login_button")).click();

        driver.findElement(By.id("add-to-cart-sauce-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_badge")).click();
        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        driver.findElement(By.id("checkout")).click();
    }
}
