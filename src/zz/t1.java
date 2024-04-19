package zz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class t1 {

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

    @Test(dataProvider = "rediffmailLogin")
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

    @AfterMethod
    public void Aftermethodrediff(){
        System.out.println("After Method .....");
    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }
}
