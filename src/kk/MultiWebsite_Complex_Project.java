package kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class MultiWebsite_Complex_Project {


    WebDriver driver;
    String expectedmsg="Wrong username and password combination.";
    String expectedErr2="Temporary Issue. Please try again later. [#5002]";

    @BeforeTest(alwaysRun = true)
    public  void SetupDriver(){
        // System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //       driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @BeforeMethod(alwaysRun = true)
    public void beforemethod(){
        driver.get("https://www.google.com/");
    }
    @DataProvider
    public Object[][] rediffmailLogin(){
        return new Object[][]{
                new Object[]{"sdas","sadasd"},
//                new Object[]{"sdaffffs","saddsfasd"},
//                new Object[]{"sdssfdas","safdsfdasd"},
        };
    }

    @Test(dataProvider = "rediffmailLogin",groups = "smoke")
    public void rediffLogin(String uname,String pass){

        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys(uname);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();

        String actmsg =driver.findElement(By.xpath("//div[@id=\"div_login_error\"]")).getText();
        System.out.println(actmsg);

        if (expectedmsg.equalsIgnoreCase(actmsg)){
            System.out.println("Actual Error -- message matched");
        }
        else if(expectedErr2.equalsIgnoreCase(actmsg)) {
            System.out.println("Temp error .. ( but not Match ) ");
        }
    }

    @Test(groups = "sanity")
    public void LivmintNews () {
        driver.navigate().to("https://www.livemint.com/news");
        String news=driver.findElement(By.xpath("//div[@class=\"linkclick-candidate\"]//a[1]")).getText();
        System.out.println("NEWS...............BELOW");
        System.out.println(news);
    }

    @Test(groups = "smoke")
    public void Flipkart () {
        driver.navigate().to("https://www.flipkart.com/apple-iphone-14-purple-128-gb/p/itm0b581eba85e08?pid=MOBGHWFHQFSQYBFU&lid=LSTMOBGHWFHQFSQYBFU9AP8AR&marketplace=FLIPKART&q=Iphone+14&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=f076a458-24d5-4dbc-ae1d-700f744c5079.MOBGHWFHQFSQYBFU.SEARCH&ppt=sp&ppn=sp&ssid=vimmb17h1c0000001680863025013&qH=a12107ce04f04677");
        String msg =driver.findElement(By.xpath("//div[@class=\"_1YokD2 _2GoDe3\"]/div[2]//div[8]/div[1]")).getText();
        System.out.println("IPHONE 14 DETAILS...............BELOW");
        System.out.println(msg);
    }
    @AfterMethod(alwaysRun = true)
    public void Aftermethodrediff(){
        System.out.println("After Method .....");
    }

    @AfterTest(alwaysRun = true)
    public void CloseDriver() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }

}
