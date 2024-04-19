package POMdrivenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class EchkoTrack2 {

    WebDriver driver;
    EchkoTeack1 r1;

    @Test
    public void z(){
    //    r1.clickonSignIn();
        r1.SendUsername("ffdfdf");
        r1.Sendpass("ghfbf");
        r1.clickonSignInbutton();
        String actmsg=r1.geterromsg();
        //  String actmsg=r1.handleAlert();
        String exptmsg="Invalid Username/Password";
        Assert.assertEquals(actmsg,exptmsg);
    }

    @BeforeTest
    public void beforetest(){

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
        r1=new EchkoTeack1(driver);
    }

    @AfterTest
    public void aftertest(){
        driver.close();
    }
}
