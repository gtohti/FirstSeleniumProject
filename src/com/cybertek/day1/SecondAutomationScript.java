package com.cybertek.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAutomationScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/danieltohti/Documents Daniel/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
    }
}
