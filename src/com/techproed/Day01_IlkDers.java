package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        // simdi chrome driverini sisteme (java projemize) tanitalim

        System.setProperty("webdriver.chrome.driver","C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        // seleniumun ilk kodu
        // webdriver nesnesi olusturrarak web driver kullanilabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        // driver`imiza google.com a gitmesini soyleyelim
        webDriver.get("https://www.google.com");

        // driverimizda acik olan pencereillapatir
        // webDriver.close();

        // driverimizi komple (acip) kapatiyor
        // webDriver.quit();



    }
}
