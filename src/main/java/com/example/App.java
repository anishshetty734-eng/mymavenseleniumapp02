package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);

        driver.findElement(By.id("username")).sendKeys("student");
        Thread.sleep(5000);

        driver.findElement(By.id("password")).sendKeys("Password123");
        Thread.sleep(5000);

        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);

        driver.quit(); // ✅ clean exit
    }
}
