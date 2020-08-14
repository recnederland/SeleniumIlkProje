package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();  // Devoloper Car kelimesini eklemis mi bakalim..

        // contains java dan gelir ve yazi da bir kelimenin olup olmadigini kontrol eder
        if (amazonTitle.contains("Books")){
            System.out.println("Books kelimesi geciyor" );
        }else{
            System.out.println("Books kelimesi gecmiyor" );
        }
    driver.close();
    }
}
