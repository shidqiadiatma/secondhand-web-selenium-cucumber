package com.shidqiadiatma.factories;

import org.openqa.selenium.WebDriver;

public class driverManager {

    // implements design pattern singleton and thread local
    private static final driverManager instance = new driverManager();

    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private driverManager() {
    }

    public static driverManager getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }
}
