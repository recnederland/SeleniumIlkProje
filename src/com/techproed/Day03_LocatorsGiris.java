package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam s\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        // hata almamak icin sayfanin acilana kadar beklemesini saglayalim
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // ilk web elementimizi bulalim
        // "Recep --> String
        // web sayfasinda gordugumuz herseyin veri type WebElemetir

        // WebElementimizi id kullanarak bulalim
        String name = "Recep";
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        //WebElement imizi yiklayalim
        signInLink.click();


        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        // Sifre kutusunu bulalim
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        // sifreyi gonderelim
        // Sifreyi parantez icindeki hoca manuel verid
        sifreKutusu.sendKeys("Test1234!");

        // Simdi sag tiklayip inspect ile sign in adrresini bulalim
        // onun id si yok o yuzden name kullanacagiz
        WebElement SignInButonu = driver.findElement(By.name("commit"));
        SignInButonu.click();

        // sayfanin basliini alalim
        if(baslik.equals("Address Book")){
            System.out.println("Giriş Başarılı.");
        }else{
            System.out.println("Giriş Başarısız.");
        }

    }
}
