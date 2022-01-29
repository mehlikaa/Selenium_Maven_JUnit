package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

//1- Bir class olusturun : BasicAuthentication
public class C02_BasicAuthentication {

    //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }

    @Test
    public void authenticationTest() {
        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //    Html komutu : https://username:password@URL
        //    Username     : admin
        //    password      : admin
        //basic authentication isteyen web sayfalari, bize nasil authentication yapacagimiz bilgisini
        // de vermek zorundadir. biz de bize verilen bilgileri birebir uygulayarak istedigimiz
        // web servise giris saglayabiliiriz

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //4- Basarili sekilde sayfaya girildigini dogrulayin
        WebElement congrulationMesajElementi=driver.findElement(By.tagName("p"));
        Assert.assertTrue(congrulationMesajElementi.isDisplayed());
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
