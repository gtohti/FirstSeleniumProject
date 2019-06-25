package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getWebDriver(String browser){
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/danieltohti/Documents Daniel/Selenium Dependencies/Drivers/chromedriver");

            return new ChromeDriver();

        }else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","/Users/danieltohti/Documents Daniel/Selenium Dependencies/Drivers/geckodriver");

        return new FirefoxDriver();

    }else {
        return null;
    }
    }
}
