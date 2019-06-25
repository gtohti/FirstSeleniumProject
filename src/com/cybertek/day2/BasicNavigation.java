package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
      //  WebDriverManager.chromedriver().setup();
        WebDriver driver = BrowserFactory.getWebDriver("chrome");
       // ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();



    }
}
