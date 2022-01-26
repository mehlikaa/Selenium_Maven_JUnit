package Day06_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01_TekrarTesti {

    public static void main(String[] args) {

//        1-C01_TekrarTesti isimli bir class olusturun
//        2- https://www.google.com/ adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        3- cookies uyarisini kabul ederek kapatin
//          Cookie cikmiyor gectim
//        4-Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualSayfaBasligi=driver.getTitle();
        String arananKelime="Google";
        if (actualSayfaBasligi.contains(arananKelime)){
            System.out.println("Title Testi PASS");
        }else {
            System.out.println("Title Testi FAILED");
        }
//        5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@name='q']"));
        aramaKutusu.sendKeys("Nutella"+Keys.ENTER);
       // aramaKutusu.submit();      <-- ustteki ile ayni gorevi yapar
//        6-Bulunan sonuc sayisini yazdirin
        WebElement sonucSayisiElementi=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("Sonu Sayisi :"+sonucSayisiElementi.getText());
//        7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String sonucSayisiString=sonucSayisiElementi.getText();
        String sonucKelimeleri[]=sonucSayisiString.split(" ");
        System.out.println(Arrays.toString(sonucKelimeleri));
        String sonucNutellaSayisiString=sonucKelimeleri[1];
        System.out.println(sonucNutellaSayisiString);
        sonucNutellaSayisiString=sonucNutellaSayisiString.replace(".","");
        System.out.println("Kac adet Nutella aramasi var : "+sonucNutellaSayisiString);
        int nutellaAramaSonucu=Integer.parseInt(sonucNutellaSayisiString);
        if(nutellaAramaSonucu>10000000){
            System.out.println("Nutella aramasi PASS-10000000'den fazla");
        }else{
            System.out.println("Nutella aramasi FAILED-10000000 degil");
        }
//        8-Sayfayi kapatin
    }
}

//    //6-Bulunan sonuc sayisini yazdirin
//    WebElement sonucSayisiElementi=driver.findElement(By.xpath("//div[@id='result-stats']"));
//        System.out.println(sonucSayisiElementi.getText());
//                //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
//                String sonucSayisiString=sonucSayisiElementi.getText();
//                String sonucKelimeleri[]=sonucSayisiString.split(" ");
//                String sonucNutellaSayisiString=sonucKelimeleri[1]; // 73.900.000
//                sonucNutellaSayisiString=sonucNutellaSayisiString.replace(".","");
//                int nutellaAramaSonucu=Integer.parseInt(sonucNutellaSayisiString);
//                if (nutellaAramaSonucu>10000000){
//                System.out.println("Nutella arama testi PASSED");
//                } else {
//                System.out.println("Nutella arama testi FAILED");
//                }
//                //8-Sayfayi kapatin
//                driver.close();