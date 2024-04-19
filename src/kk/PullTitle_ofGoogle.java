package kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class PullTitle_ofGoogle {


    WebDriver driver;


    @BeforeTest
    public  void SetupDriver(){
       // System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
 //       driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @BeforeMethod
    public void beforemethod(){

        driver.get("https://www.google.com/");
    }

    @Test(priority = 1)
    public void OpenChrome(){
    String about= driver.findElement(By.xpath("//a[@href=\"https://about.google/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText();
        driver.findElement(By.xpath("//a[@href=\"https://about.google/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).click();
        System.out.println(about);
    }

    @Test(priority = 1)
    public void OpenChrome1 () {
        String adver =driver.findElement(By.xpath("//a[@href=\"https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1\"]")).getText();
        driver.findElement(By.xpath("//a[@href=\"https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1\"]")).click();
        System.out.println(adver);
        }

    @Test(priority = 3)
    public void OpenChrome2 () {
        String gmail=driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).getText();
        driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).click();
        System.out.println(gmail);
    }
    @Test(priority = 4)
    public void OpenChrome3 () {
        String imga =driver.findElement(By.xpath("//a[@href=\"https://www.google.co.in/imghp?hl=en&ogbl\"]")).getText();
        driver.findElement(By.xpath("//a[@href=\"https://www.google.co.in/imghp?hl=en&ogbl\"]")).click();
        System.out.println(imga);
    }

    @AfterMethod
    public void Aftermethod(){

        System.out.println(driver.getTitle());
        System.out.println("After Method");
    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }

}
