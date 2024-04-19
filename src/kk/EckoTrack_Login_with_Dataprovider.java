package kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class EckoTrack_Login_with_Dataprovider {


    WebDriver driver;
    String expectedmsg="Invalid Username/Password";
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

    @DataProvider
    public Object[][] echoTrackLogin(){
        return new Object[][]{
                new Object[]{"dfkhds","fdsf"},
                new Object[]{"dfkhds","fdsf"},
                new Object[]{"dfkhds","fdsf"},
        };
    }

    @Test(dataProvider = "echoTrackLogin")
    public void OpenChrome(String uname,String pass){
        driver.findElement(By.id("txtCustomerID")).sendKeys(uname);
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@title=\"Login\"][@value=\"Login\"]")).click();
    }

    @AfterMethod
    public void Aftermethod(){

        String actmsg =driver.findElement(By.xpath("//span[@id=\"lblMsg\"]")).getText();
        Assert.assertEquals(actmsg,expectedmsg,"Hello");

    }


}
