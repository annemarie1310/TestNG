package SDET_Youtube_TestNG.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*
To run Below Code Write following in .Xml File ........

<suite name="All Test Suite">
    <parameter name="browser" value="Microsoft Edge"></parameter>
    <parameter name="url" value="https://www.orangehrm.com/"></parameter>
    <test verbose="2" preserve-order="true"
          name="Parametert1">
        <classes>
            <class name="SDET_Youtube_TestNG.Parameters.parameters">
                <methods>
                    <include name="LogoTest"/>
                    <include name="HomePageTitle"/>
                </methods>
            </class>
        </classes>
    </test>
</suite>
 */
public class parameters {

    WebDriver driver;
    /*
    In below Code we have made browser string parameter and passed as parameter to the void Setup method
    and also url as Website url in WebUrl and passed as parameter to the void Setup method
    ... below if and else if loop are checking if browser name equals then launch the browser .
    // We have passed the website link in WebUrl in .Xml File as parameter.
     */
    @BeforeClass
    @Parameters({"browser","url"})
    void Setup(String browser,String WebUrl)
    {
        if (browser.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
        else if (browser.equalsIgnoreCase("Microsoft Edge"))
        {
            System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.get(WebUrl); //this will open the Website through url passed to WebUrl in Xml file..
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
      //  Assert.assertEquals(driver.getTitle(),"OrangeHRM");  //We can also use like this
    }
    @AfterClass
    void  TearDown(){
        driver.close();
    }
}
