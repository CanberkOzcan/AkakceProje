import static Utility.BaseDriver.driver;


public class _01_Registration extends BaseDriver {



        driver.get("https://www.akakce.com/");
        driver.manage().deleteAllCookies();

        WebElement hesapac=driver.findElement(By.linkText("Hesap Aç"));
        hesapac.click();

        WebElement isim= driver.findElement(By.cssSelector("input[id='rnufn']"));
        isim.sendKeys("GrupDort");

        WebElement soyad=driver.findElement(By.cssSelector("input[id='rnufs']"));
        soyad.sendKeys("ilkOdev");

        WebElement email=driver.findElement(By.id("rnufe1"));
        email.sendKeys("grup4@gmail.com");

        WebElement remail= driver.findElement(By.id("rnufe2"));
        remail.sendKeys("grup4@gmail.com");
        MyFunc.Bekle(3);
        WebElement password= driver.findElement(By.id("rnufp1"));
        password.sendKeys("Ilkgun.23");
        MyFunc.Bekle(3);
        WebElement repassword= driver.findElement(By.id("rnufp2"));
        repassword.sendKeys("Ilkgun.23");
        MyFunc.Bekle(3);
        WebElement cinsiyet= driver.findElement(By.id("rngf"));
        cinsiyet.click();

        WebElement il = driver.findElement(By.id("locpr"));

        Select ill= new Select(il);
        ill.selectByVisibleText("Ankara");

        WebElement ilce=driver.findElement(By.id("locds"));

        Select yeniIlce=new Select(ilce);
        yeniIlce.selectByVisibleText("Beypazarı");

        WebElement gun= driver.findElement(By.id("bd"));
        Select yeniGun=new Select(gun);
        yeniGun.selectByVisibleText("28");

        WebElement ay= driver.findElement(By.id("bm"));
        Select yeniAy=new Select(ay);
        yeniAy.selectByVisibleText("10");

        WebElement yil= driver.findElement(By.id("by"));
        Select yeniYil=new Select(yil);
        yeniYil.selectByVisibleText("2009");

        WebElement kullanim= driver.findElement(By.id("rnufpca"));
        kullanim.click();

        WebElement hesapBttn= driver.findElement(By.id("rfb"));
        hesapBttn.click();

        WebElement onay= driver.findElement(By.linkText("GrupDort"));
        System.out.println(onay.getText());












       // stopDriver();




    }
}
