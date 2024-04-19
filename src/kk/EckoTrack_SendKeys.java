package kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class EckoTrack_SendKeys {


    WebDriver driver;
    String actualmsg="Invalid Username/Password";

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

        driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

    }

    @Test(priority = 1)
    public void OpenChrome(){
        driver.findElement(By.id("txtCustomerID")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("fdfef");
        driver.findElement(By.xpath("//input[@title=\"Login\"][@value=\"Login\"]")).click();
    }
/*
    @Test(priority = 1)
    public void OpenChrome1 () {
    }

    @Test(priority = 3)
    public void OpenChrome2 () {
    }
    @Test(priority = 4)
    public void OpenChrome3 () {

    }
*/
    @AfterMethod
    public void Aftermethod(){


        String msg =driver.findElement(By.xpath("//span[@id=\"lblMsg\"]")).getText();
/*
        System.out.println(msg);
        if (actualmsg.equalsIgnoreCase(msg)){
            System.out.println("match");
        }
        else {
            System.out.println("not match");
        }
*/
        //Assert.assertEquals(actualmsg,msg);
        Assert.assertEquals(actualmsg,msg,"Hello");

    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }

}
