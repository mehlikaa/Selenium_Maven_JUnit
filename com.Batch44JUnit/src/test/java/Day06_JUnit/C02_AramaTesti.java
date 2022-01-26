package Day06_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AramaTesti {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
       WebElement ilkUrunKaydet = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        System.out.println("Ilk Urun Ismi  "+ ilkUrunKaydet.getText());
        ilkUrunKaydet.click();
        Thread.sleep(2000);
        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        //  driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed();
        WebElement sepettekiUrunIsmiElementi=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String sepettekiUrunIsmi=sepettekiUrunIsmiElementi.getText();
        if (sepettekiUrunIsmi.equals(ilkUrunKaydet)){
            System.out.println("Evet Urun Sepete Eklenmis PASS");
        }else {
            System.out.println("Urun Sepette Yok FAILED ");
        }
        //9. Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
        //        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        //        WebElement firstItemName = driver.findElement(By.xpath("//div[@class = 'inventory_item_name']"));
        //        String itemName = firstItemName.getText();
        //        if(firstElementName.equals(itemName)){
        //            System.out.println("Item name test PASSED");
        //        }
        //        System.out.println("Item name test FAILED");
        //        //9. Sayfayi kapatin
        //        driver.close();
    }
}
