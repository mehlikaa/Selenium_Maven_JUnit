package tests.day11;

public class note {
    //    //1.Driver bizim elimiz, gozumuz gibidir. Onu nereye gonderirsek orda bizim adimiza istedigimiz islemleri yapar.
    //    //Ama bazen driver'i gonderdigimiz sayfa disina cikmamiz gerekebilir. (alert, iframe, tabs veya yeni pencere gibi..)
    //    //2.Driver'i gonderdigimiz sayfa disinda bir yerde islem yaptirmak istrersek driver.switchto().yeni ortam
    //    //3.switch.to() ile gittigimiz ortam alert ise
    //        //-Ok'e basmak icin .accept()
    //        //-cancel'e basmak icin .dismiss
    //        //-alert uzerinde var olan yaziyi almak icin .getText()
    //        //-alert'de varsa yazi gondermek icin .sendKeys() method'larina kullanabiliriz
    //    //4.switchTo() ile gittigimiz ortam iframe ise
    //        //-3 farkli yontem ile iframe'e grcis yapabiliriz
    //            //i- index
    //            //ii-id veya name(String)
    //            //iii-Webelement olarak gecis icin method kullanabiliriz
    //        //-bir defa iframe'e gecince tekrar o iframe'den cikmamiz gerekirse yine .switchTo() kullanmaliyiz
    //            //i-parentFrame : icinde oldugumuz iframe'den bir ust iframe'e cikar
    //            //ii- defaultContent : en ust seviyeye yani anasayfaya gecis yapar
    //            //eger sadece bir tane iframe varsa bu iki yontem ayni islemi yapmis olur
    //}
    //------------------------------------------------------
    //package tests.day12;
    //import org.testng.annotations.Test;
    //import tests.day10.C01_Allerts;
    //import utilities.TestBase;
    //public class C01_TestBaseKullanim {
    //
    //    @Test
    //    public void test01(){
    //        // projeniz icerisindeki herhangi bir class'dan obje olusturabilir ve
    //        // o obje sayesinde ait oldugu class'daki tum variable ve method'lara
    //        // (access modfier izin verdigi surece) ulasabilirim
    //        C01_Allerts obj=new C01_Allerts();
    //
    //        // eger proje kapsaminda bir class'dan obje olusturulmasini engellemek isterseniz
    //        // 1- o class'in constructor'ini private yapabiliriz
    //        // 2- class'in kendisini abstract yapabiliriz
    //        // 1.method cok tercih edilmez cunku OOP consept'e uymaz(cok sinirli sayida kullanimi vardir)
    //        // 2.method'u kullanabiliriz, boylece o class'daki abstract olmayan (concrete)
    //        // method'lari override etmek mecburiyeti olmadan kullanabiliriz
    //        // ama obje olusturamayiz
    //
    //        // ornegin biz testBase class'ini abstract yaptigimizdan obje olusturamayiz
    //        // ama child class'lardan TestrBase'deki setUp ve teardown method'larini kullanabiliriz
    //        // TestBase obj1=new TestBase();
    //
    //
    //
    //    }
    //
    //}
}
