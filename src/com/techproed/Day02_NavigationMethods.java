package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
    // Java projemize, drivirimizi tanitmis olduk
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        // driver i acalim, inport icin kisayol :    alt+ enter
        WebDriver yeniNesne = new ChromeDriver();

        // chrome icin ekrani kaplatacak kadar buyuttyor
        yeniNesne.manage().window().maximize();

        // drivera nereye gidecegini soyleyelim   get
        yeniNesne.get("http://google.com");

        // get ile navigate islevi ayni
        yeniNesne.navigate().to("http://amazon.com");
        // bir onceki sayfaya geri donmesmizi saglar
        yeniNesne.navigate().back();
        //bir ileri sayfaya gitmemizi saglar
        yeniNesne.navigate().forward();
        // sayfayi yenileme islevini saglayan method
        yeniNesne.navigate().refresh();

    }
}
