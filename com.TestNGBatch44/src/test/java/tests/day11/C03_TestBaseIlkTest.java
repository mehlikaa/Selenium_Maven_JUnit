package tests.day11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_TestBaseIlkTest extends TestBase {

    WebDriver driver;

    @Test           //NG @Test gordugunde hemen BeforeClass var mi kontrol eder, burada yoksa parentina bakar
    public void test01(){
        driver.get("https://www.amazon.com");

    }    //calistiktan sonra da @AfterClass arar. burada yoksa parentina bakar
}
