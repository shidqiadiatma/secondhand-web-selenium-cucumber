package com.shidqiadiatma.factories;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * @author Shidqi Adiatma a.k.a. hipstertester on 07/12/23
 * @project secondhand-web-selenium-cucumber
 */

public class browserFactory {

    public WebDriver launchBrowser(String browserName) {
        WebDriver webDriver;

        switch (browserName.toLowerCase()) {
            case "chrome" -> {
//                WebDriverManager.chromedriver().clearDriverCache().setup();
//                WebDriverManager.chromedriver().clearResolutionCache().setup();
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
            }
            case "headless chrome" -> {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless", "--disable-gpu");
                webDriver = new ChromeDriver(chromeOptions);
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
            }
            case "headless firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless", "--disable-gpu");
                webDriver = new FirefoxDriver(firefoxOptions);
            }
            default -> throw new IllegalArgumentException("Invalid browser name: " + browserName);
        }

        return webDriver;
    }
}
