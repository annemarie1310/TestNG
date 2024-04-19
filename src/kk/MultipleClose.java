package kk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class MultipleClose {

WebDriver driver;


    @BeforeTest
    public  void SetupDriver(){
        System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

        @BeforeMethod
        public void beforemethod(){

            System.out.println("Before Method");
        }
            @Test
            public void OpenChrome(){
                driver.get("https://www.flipkart.com/");
            }

            @Test(priority = 1)
            public void OpenChrome1 () {
                 driver.get("https://www.amazon.com/");
            }

            @Test(priority = 2)
            public void OpenChrome2 () {
                driver.get("https://www.flipkart.com/");
            }

            @Test(priority = 3)
            public void OpenChrome3 () {
                driver.get("https://www.amazon.com/");
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
