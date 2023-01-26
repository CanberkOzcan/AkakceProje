package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    static {
        KalanOncekileriKapat();
        //ilk adımda çalışan kod kısmı
        Logger logger = Logger.getLogger("");//butün loglara ulaştım
        logger.setLevel(Level.SEVERE); //sadece errorları göster.
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize(); //ekranı büyütür.
        driver.manage().deleteAllCookies(); // sitenin senin bilgisayarında yaptığı ayarlar siliniyor.

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);// sadece tüm sayfanın kodlarının bilgisayarınıza inmesi
        //süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar bekler (sonsuza kadar).:30 saniye süresince sayfanın yüklenmesini
        //bekle yüklenmezse hata ver.

        driver.manage().timeouts().implicitlyWait(dr);//bütün web elementleri element bazında elemente özel işlem
        //yapılmadan önce hazır hale gelmesi için verilen süre.


    }

    public static void driverBekleKapat() {
        MyFunc.bekle(5);
        driver.quit();
    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {
        }
    }
}
