package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C04_DropdownAmazon {
    WebDriver driver;
    WebElement dropDownElementi;
    Select select;
    //● Bir class oluşturun: C3_DropDownAmazon

    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {
        //● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");
        //- Test 1
        //    Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
        dropDownElementi = driver.findElement(By.xpath("//select/option[@value='search-alias=stripbooks']"));

        Thread.sleep(1000);
        select = new Select(dropDownElementi);

        List<WebElement> optionListesi = select.getOptions();
        int actualOptionSayisi = optionListesi.size();
        int expectedOptionSayisi = 45;

        Assert.assertEquals(actualOptionSayisi, expectedOptionSayisi);
    }
        //-Test 2
        @Test
        public void test02() throws InterruptedException {
            driver.get("https://www.amazon.com/");
        //    1. Kategori menusunden Books secenegini  secin
            dropDownElementi=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
            select=new Select(dropDownElementi);
            select.selectByVisibleText("Books");
            //dropDownElementi.click();
            Thread.sleep(1000);
            //dropDownElementi.click();
        //   2. Arama kutusuna Java yazin ve aratin
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
            driver.findElement(By.id("nav-search-submit-button")).click();
            //    3. Bulunan sonuc sayisini yazdirin
            WebElement sonucSayisi=driver.findElement(By.xpath("//span[text()='1-24 of over 20,000 results for']"));
            String sonucMetni=sonucSayisi.getText();
            System.out.println(sonucMetni);
            //    4. Sonucun Java kelimesini icerdigini test edin
            Assert.assertTrue(sonucMetni.contains("Java"));
        }
}
