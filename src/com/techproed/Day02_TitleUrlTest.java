package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    // odev


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();

        if (youtubeTitle.contains("video")) {
            System.out.println("video kelimesi geciyor"+ youtubeTitle);
        }else{
            System.out.println("video kelimesi gecmiyor"+ youtubeTitle);
        }
        driver.close();
    }
}
