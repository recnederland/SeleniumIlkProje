package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://google.com");
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        // sendkeys ile arama kutusuna birsey yazabiliriz
        aramaKutusu.sendKeys("city bike");
        // submit enter gorevi gorur
        aramaKutusu.submit();

        WebElement sonucSayisi = driver.findElement(By.id("results stads"));
        System.out.println(sonucSayisi.getText());

        WebElement alisverisLinki = driver.findElement(By.partialLinkText("Alışveriş"));
        alisverisLinki.click();






    }
}
