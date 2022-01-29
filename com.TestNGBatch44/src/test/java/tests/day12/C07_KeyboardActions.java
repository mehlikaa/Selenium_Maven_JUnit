package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.security.Key;

public class C07_KeyboardActions extends TestBase {
    //Yeni bir class olusturalim: D15_MouseActions4
    //1- https://www.facebook.com adresine gidelim

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        WebElement hesapEkle = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        hesapEkle.click();

        WebElement ilkTextBox=driver.findElement(By.xpath("//input[@name='firstname']"));

        Actions actions=new Actions(driver);
        actions.click(ilkTextBox).
                keyDown(Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("utlu").sendKeys(Keys.TAB).
                sendKeys("Murat").sendKeys(Keys.TAB).
                sendKeys("kutlumurat").keyDown(Keys.SHIFT).sendKeys("2").keyUp(Keys.SHIFT).sendKeys("gmail.com").sendKeys(Keys.TAB).
                sendKeys("kutlumurat").keyDown(Keys.SHIFT).sendKeys("2").keyUp(Keys.SHIFT).sendKeys("gmail.com").sendKeys(Keys.TAB).
                sendKeys("Mhju?123Mki").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).sendKeys("Jan").sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).sendKeys("11").sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).sendKeys("1999").sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();

                Thread.sleep(80000);
    }
    //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
    //4- Kaydol tusuna basalim


}
