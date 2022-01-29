package tests.day12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import javax.swing.*;
import java.time.Duration;

public class C02_MouseActions extends TestBase {
    // amazona gidin
    // Hello Sign In WebElemntin uzerinde mouse u getirip durup bekle
    // acilan menude new list linkine tiklayin ve
    // new list sayfasinin acildigini test edin

    @Test
    public void mouseBekletSec() throws InterruptedException {
        driver.get("https://www.amazon.com");

        Actions actions=new Actions(driver);

        WebElement helloElement=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
        actions.moveToElement(helloElement).perform();
        //yaklasti menuyu acmis oldu ve gitt.
        //create a listi locate etmem gerekiyor

        WebElement listElementi=driver.findElement(By.xpath("//span[text()='Create a List']"));
        actions.click(listElementi).perform();

        String actualText=driver.getTitle();
        String expectedText="Your List";
//------------- hard
        Assert.assertTrue(actualText.contains(actualText));
        // class ismi ve metod ==> static bir metod
//-----------------
//------------ soft
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualText.contains(actualText));
        // obje ile ulasiyorum
        softAssert.assertAll();
//----------------
Thread.sleep(5000);
    }
}
