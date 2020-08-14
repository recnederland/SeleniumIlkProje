package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    // driver'ımızı ekranı kaplayacak şekilde kullanalım.
    // 1 - ilk önce google.com'a gidelim.
    // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
    // 3 - daha sonra youtube.com'a gidelim.
    // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
    // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
    // 6 - driver'ımızı kapatalım.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        // 1- google gidelim
        webDriver.get("https://www.google.com");

        // 2- Sayfamim title ini alip yazdiralim
        String titleGoogle = webDriver.getTitle();
        System.out.println(titleGoogle);

        // 3  youyube a gidelim
        webDriver.navigate().to("https://www.youtube.com");

        // 4- Sayfanin titleini ve urlsini alalim
        String TitleYoutube = webDriver.getTitle();
        String urlYoutube = webDriver.getCurrentUrl();

        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());

        // 5- google geri gelelim
        webDriver.navigate().back();
        String urlGoogle = webDriver.getCurrentUrl();
        System.out.println(webDriver.getCurrentUrl());


    }

}
