package zz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class t2 {

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
    public void LivmintNews () {
        driver.navigate().to("https://www.livemint.com/news");
        String news=driver.findElement(By.xpath("//div[@class=\"linkclick-candidate\"]//a[1]")).getText();
        System.out.println("NEWS...............BELOW");
        System.out.println(news);
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
