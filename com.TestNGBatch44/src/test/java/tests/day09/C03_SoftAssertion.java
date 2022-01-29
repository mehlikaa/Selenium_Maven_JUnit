package tests.day09;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {

    @Test
    public void test01(){
        int a=10;
        int b=20;
        int c=30;

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(a,b,"1., test BASARISIZ");               //FAILED
        softAssert.assertTrue(a>b,"2. test BASARISIZ");         //FAILED
        softAssert.assertTrue(a<c,"3. test BASARISIZ");         // PASS
        softAssert.assertTrue(c>b,"4. test BASARISIZ");         //PASS
        softAssert.assertTrue(c<a,"5. test BASARISIZ");         //Failed

        //assertAll demezsek kodlar sadece calismis olur ve
        // PASS olur
        softAssert.assertAll();
        System.out.println("Test bitti");
    }
}
