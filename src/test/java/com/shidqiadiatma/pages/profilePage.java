package com.shidqiadiatma.pages;

import com.shidqiadiatma.helpers.keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class profilePage {
    protected WebDriver webDriver;

    public profilePage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "form-avatar-image")
    private static WebElement select_image;
    @FindBy(id = "user_name")
    private static WebElement input_username;
    @FindBy(id = "user_city_id")
    private static WebElement select_city;
    @FindBy(id = "user_address")
    private static WebElement input_address;
    @FindBy(id = "user_phone_number")
    private static WebElement input_userPhone;
    @FindBy(xpath = "//input[@type='submit']")
    private static WebElement button_save;

    public static void user_do_update_profile(String username, String address, String phone) {
        keyword.inputText(input_username, username);
        keyword.inputText(input_address, address);
        keyword.inputText(input_userPhone, phone);
        keyword.tapElement(button_save);
    }




}
