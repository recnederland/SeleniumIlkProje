package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");

        // 1. adim
        // email kutusunu bulup techproed@proed.com yazdiralim
        //driver.findElement(By.id("email")).sendKeys("techproed@gmail.com");

        // diger yolu
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        // 2. adim sifre kutusuna Test1234 yazdiralim
        //<input type="password" class="inputtext _55r1 _6luy" name="pass"
        // id="pass" data-testid="royal_pass" placeholder="Şifre" aria-label="Şifre">
        WebElement sifreKutusu = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        sifreKutusu.sendKeys("Test1234");

        // 3. adim login butonunu bulalim
        // ._42ft   ya da #u_0_d"
        //WebElement loginButonu = driver.findElement(By.id("u_0_b"));
        //WebElement loginButonu = driver.findElement(By.cssSelector("#u_0_d"));
        WebElement loginButonu = driver.findElement(By.xpath("//button"));
        loginButonu.click();
        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" 
        // name="login"
        //data-testid="royal_login_button" type="submit" id="u_0_d">Giriş Yap</button>

        // Burada java 3000 milisaniye bekleyecek
        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //https://www.facebook.com/login/
        //once bulundugumuz sayfanin urlsini alalim ve dogru mu diye kontrol edelim
        String url =driver.getCurrentUrl();
        System.out.println(url);
        if(url.contains("facebook.com/login/")){
            System.out.println("Giriş Başarısız !");
        }else{
            System.out.println("Giriş Başarılı !");
        }
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}
