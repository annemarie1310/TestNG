package KeyWordDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

public class ReadfromMydataPropetiesFile {

    String fpath="C:\\Users\\dell\\IdeaProjects\\TestNG\\src\\KeyWordDrivenTest\\Mydata.properties";
    File file;
    FileInputStream fis;
    Properties prop;
    WebDriver driver;

    @Test
    public void LoginEckhoTrack(){
        driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys("dfsdfds");
        driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("fsf");
        driver.findElement(By.xpath(prop.getProperty("button"))).click();
        System.out.println(driver.findElement(By.xpath(prop.getProperty("errormsg"))).getText());

    }

    @BeforeMethod
    public void beforeTest () throws Exception {
        file=new File(fpath);
        fis=new FileInputStream(file);
        prop=new Properties();
        prop.load(fis);


        // System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //       driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(prop.getProperty("url"));
    }
        @AfterMethod
    public void aftermethod(){
        driver.close();
    }










}
