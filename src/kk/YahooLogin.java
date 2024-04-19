package kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class YahooLogin {
    WebDriver driver;


    @BeforeTest(groups = "4Wheeler")
    @Parameters({"browser","url"})
    void driverSetup(String browser,String WebUrl)
    {
        if (browser.equalsIgnoreCase("Google Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();
            driver.navigate().to(WebUrl);
        }
        else if (browser.equalsIgnoreCase("Microsoft Edge"))
        {
            System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
    }
    @Test(priority = 1)
    public void OpenYahoo () {
        driver.navigate().to("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
        driver.findElement(By.xpath("//div[@class=\"bottom-links-container has-social-buttons\"]//p[1]")).click();

    }

    @Test(priority = 2)
    public void OpenEnterData () {
        driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).sendKeys("Anthony");
        driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).sendKeys("Gates");
        driver.findElement(By.xpath("//input[@name=\"userId\"]")).sendKeys("Anth");
    }

    @Test(priority = 3)
    public void OpenChrome4 () {


    }


}
