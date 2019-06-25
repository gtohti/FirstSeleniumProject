package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/danieltohti/Documents Daniel/Selenium Dependencies/Drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver",
                "/Users/danieltohti/Documents Daniel/Selenium Dependencies/Drivers/geckodriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}

