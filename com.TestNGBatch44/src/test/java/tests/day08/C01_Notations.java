package tests.day08;

import org.testng.annotations.Test;

public class C01_Notations {
//Before/After class artik static olamli kurali YOK
    // Normalde. test isimlerini bas harflerine gore, calistirir.
    @Test(priority = -9)
    public void youtubeTest(){
        System.out.println("Youtube OK");
    }

    @Test
    public void amazonTest(){
        System.out.println("Amazon OK");
    }

    @Test // testleri istedigimiz sira ile calistirmak icin, oncelik numarasi verdik
    public void bestbuyTest(){
        System.out.println("Bestbuy OK");
    }
    //priority atanmazsa , 0 kabul eder
    //priority atanmayanlar, alfabetik sira ile siralanir.
    // - yada + integer bir deger verilebilir.

}
