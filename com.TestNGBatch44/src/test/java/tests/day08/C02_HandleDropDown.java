package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.channels.SelectionKey;
import java.time.Duration;

public class C02_HandleDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void dropDownTest(){
        // dropdown var olan seceneklerden birini secmek icin
        //1.adimda webelementini locate edip bir degiskene atiyoruz
        driver.get("https://www.amazon.com/");
        WebElement dropDownElementi=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        //2.adim Select classindan bir obje olusturalim
        Select select=new Select(dropDownElementi);
        //parametre olarak locate ettigimiz webwlwmwnti yazalim

        //3. adim select objesini kullanarak Select classindan 3 secim metodundan
        //istediginizi kullanarak dropdown da var olan optionlardan birini secebiliriz
        // secim ypmamiza yardim eden bu 3 metod void dur ve bize birsey dondurmez
        select.selectByIndex(3);
        //eger sectigimiz option degerini yazdirmak isresek
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Deals");
    }

    //    @Test
    //    public void dropdownTesti() throws InterruptedException {
    //        // Dropdown'da var olan seceneklerden birini secmek icin
    //        // 1.adim : Dropdown webelemntini locate edip bir degiskene atiyoruz
    //        driver.get("https://www.amazon.com");
    //        WebElement dropdownElementi=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    //        // 2.adim : Select class'indan bir obje olusturalim
    //        // ve parametre olarak locate ettigimiz Webelementi yazalim
    //        Select select=new Select(dropdownElementi);
    //        // 3.adim select objesini kullanarak, Select class'inda var olan 3 secim method'undan
    //        //  istedigimizi kullanarak dropdown'da var olan option'lardan birini sacebiliriz
    //        //  secim yapmamiza yardim eden bu 3 method void'dir dolayisiyla bize bir sey dondurmezler
    //        select.selectByIndex(3);
    //        // eger sectigimiz option degerini yazdirmak istersek
    //        System.out.println(select.getFirstSelectedOption().getText()); //Baby
    //        Thread.sleep(3000);
    //        select.selectByVisibleText("Deals");
    //        Thread.sleep(3000);
    //        select.selectByValue("search-alias=arts-crafts-intl-ship");

    //        List<WebElement> optionList = select.getOptions();
    //        for (WebElement each: optionList
    //             ) {
    //            System.out.println(each.getText());
    //        }
    //    }

        @AfterMethod
        public void teardown(){
           //driver.close();
    }

}
