package kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class Rediffmail_login {


    WebDriver driver;
    String expectedmsg="Wrong username and password combination.";
    String expectedErr2="Temporary Issue. Please try again later. [#5002]";

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

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

    }
    @DataProvider
    public Object[][] rediffmailLogin(){
            return new Object[][]{
            new Object[]{"sdas","sadasd"},
            new Object[]{"sdaffffs","saddsfasd"},
            new Object[]{"sdssfdas","safdsfdasd"},
            };
    }

    @Test(priority = 1,dataProvider = "rediffmailLogin")
    public void OpenChrome(String uname,String pass){
        driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys(uname);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
    }

        @Test(priority = 2)
        public void OpenChrome1 () {
            driver.findElement(By.xpath("//a[@href=\"https://www.rediff.com/cricket/report/ipl-its-rohit-flair-vs-dhonis-acumen-at-wankhede-mumbai-indians-csk-chennai-super-kings/20230407.htm\"][1]")).click();

        }

        @Test(priority = 3)
        public void OpenChrome2 () {
            System.out.println("TEST 3");
        }
        @Test(priority = 4)
        public void OpenChrome3 () {
            System.out.println("TEST 4");
        }

    @AfterMethod
    public void Aftermethod(){


        String actmsg =driver.findElement(By.xpath("//div[@id=\"div_login_error\"]")).getText();
        System.out.println(actmsg);

        if (expectedmsg.equalsIgnoreCase(actmsg)){
            System.out.println("match");
        }
        else if(expectedErr2.equalsIgnoreCase(actmsg)) {
            System.out.println("Temp error .. ( but not Match ) ");
        }

        driver.findElement(By.xpath("//input[@id=\"login1\"]")).clear();

    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }




}
