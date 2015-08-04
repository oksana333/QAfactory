package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by admin on 04.08.15.
 */
public class web_driver {
    public static void main ( String [] args){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        ChromeDriver d123 = new ChromeDriver();
        d123.get("http://google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        d123.quit();
    }
}
