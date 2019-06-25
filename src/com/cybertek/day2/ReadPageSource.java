package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPageSource {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/danieltohti/Documents Daniel/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        String pagesource = driver.getPageSource();
        driver.getPageSource();
        System.out.println(pagesource);
        driver.close();
    }
}
