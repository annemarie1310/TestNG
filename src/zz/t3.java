package zz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class t3 {

    WebDriver driver;
    String expectedmsg="Wrong username and password combination.";
    String expectedErr2="Temporary Issue. Please try again later. [#5002]";

    @BeforeTest(groups = "sanity")
    public  void SetupDriver(){
        // System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //       driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @BeforeMethod(groups = "sanity")
    public void beforemethod(){
        driver.get("https://www.google.com/");
    }

    @Test(groups = "sanity")
    public void Flipkart () {
        driver.navigate().to("https://www.flipkart.com/apple-iphone-14-purple-128-gb/p/itm0b581eba85e08?pid=MOBGHWFHQFSQYBFU&lid=LSTMOBGHWFHQFSQYBFU9AP8AR&marketplace=FLIPKART&q=Iphone+14&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=f076a458-24d5-4dbc-ae1d-700f744c5079.MOBGHWFHQFSQYBFU.SEARCH&ppt=sp&ppn=sp&ssid=vimmb17h1c0000001680863025013&qH=a12107ce04f04677");
        String msg =driver.findElement(By.xpath("//div[@class=\"_1YokD2 _2GoDe3\"]/div[2]//div[8]/div[1]")).getText();
        System.out.println("IPHONE 14 DETAILS...............BELOW");
        System.out.println(msg);
    }
    @AfterMethod(groups = "sanity")
    public void Aftermethodrediff(){
        System.out.println("After Method .....");
    }

    @AfterTest(groups = "sanity")
    public void CloseDriver() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }
}
