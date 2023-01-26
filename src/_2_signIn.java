import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _2_signIn extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://www.akakce.com/");

        WebElement giris= driver.findElement(By.linkText("Giriş Yap"));
        giris.click();

        WebElement eposta= driver.findElement(By.id("life"));
        eposta.sendKeys("grup4@gmail.com");

        WebElement sifre= driver.findElement(By.id("lifp"));
        sifre.sendKeys("Ilkgun.23");

        WebElement girisBttn= driver.findElement(By.id("lfb"));
        girisBttn.click();

        WebElement onay= driver.findElement(By.linkText("GrupDort"));
        System.out.println(onay.getText());

        WebElement profil= driver.findElement(By.linkText("Hesabım"));
        profil.click();

        WebElement siparisim= driver.findElement(By.linkText("Kolay Siparişlerim"));
        siparisim.click();

        WebElement siparisOnay= driver.findElement(By.cssSelector("div[class='no-record']"));
        siparisOnay.getText();

        Assert.assertTrue("Siparisiniz Vardir",siparisOnay.getText().contains("Kayıtlı siparişiniz bulunmuyor."));

        WebElement profilBttn= driver.findElement(By.id("H_a_v8"));
        profilBttn.click();

        WebElement hesabim= driver.findElement(By.cssSelector("[id='H_a_v8'] +ul> :nth-child(1)+li+li+li+li > :nth-child(1)"));
        hesabim.click();

        WebElement mesajlarim= driver.findElement(By.linkText("Mesajlarım"));
        mesajlarim.click();

        WebElement mesajMetin= driver.findElement(By.xpath("//*[@class='wbb_v8']//p"));
        mesajMetin.getText();

        Assert.assertTrue("Mesajiniz Vardir",mesajMetin.getText().contains("Listelenecek mesaj bulunamadı."));

        WebElement anaSayfa= driver.findElement(By.id("H_l_v8"));
        anaSayfa.click();

        WebElement profilBttn2= driver.findElement(By.id("H_a_v8"));
        profilBttn2.click();

        WebElement hesabim2= driver.findElement(By.cssSelector("[id='H_a_v8'] +ul> :nth-child(1)+li+li+li+li > :nth-child(1)"));
        hesabim2.click();

        WebElement hesabiSil= driver.findElement(By.linkText("Hesabımı Sil"));
        hesabiSil.click();

        WebElement sifreSil= driver.findElement(By.id("p"));
        sifreSil.sendKeys("Ilkgun.23");

        WebElement hesapsilBtn= driver.findElement(By.id("u"));
       // hesapsilBtn.click();





        stopDriver();





    }
}
