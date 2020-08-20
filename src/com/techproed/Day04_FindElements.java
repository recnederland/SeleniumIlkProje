package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/");

        // a tagname inie ait tum elementleri bulalim
        List<WebElement> listem = driver.findElements(By.tagName("a"));
        // Bir arraylisteki tum elemanlari for  veya  foreach ile yazdirabiliriz
        for(WebElement w : listem) {
            System.out.println(w.getText());
        }


    }
}
