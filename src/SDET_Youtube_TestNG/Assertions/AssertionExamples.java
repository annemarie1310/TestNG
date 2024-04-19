package SDET_Youtube_TestNG.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExamples {
WebDriver driver;
    @BeforeClass
    void Setup(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.orangehrm.com/");
    }

    @Test(priority = 1)
    void LogoTest(){
        WebElement Logo=driver.findElement(By.xpath("//body/nav[1]/div[1]/a[1]/img[1]"));
        // Assert.assertTrue ==> is function which sees if condition is met then return true
        // Assert.assertFalse if opposite of Assert.assertTrue .
        Assert.assertTrue(Logo.isDisplayed(),"Logo is displayed");
    }
    @Test(priority = 2)
    void HomePageTitle(){
        String Title =driver.getTitle();
        // Assert.assertEquals ==> is a function which can check if actual and Expected matches.
        Assert.assertEquals("OrangeHRM","OrangeHRM");
    }
@AfterClass
    void  TearDown(){
        driver.close();
    }

}
