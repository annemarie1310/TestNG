package Tricentris_With_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.time.Duration;

public class Motorcycle {


    WebDriver driver;
    @BeforeTest(groups = "2Wheeler",alwaysRun = true)
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
    @BeforeClass(alwaysRun = true)
    @Parameters("Websiteurl")
    public void OpenTricentis(String TricentisUrl){
        driver.navigate().to(TricentisUrl);
    }

    @Test(priority = 1,groups = "2Wheeler")
    public void OpenMotercycle() throws InterruptedException {

        //click on MoterCycle
        driver.findElement(By.xpath("//a[@id=\"nav_motorcycle\"][1]")).click();
        // Select motercycle make .
        WebElement Moterbike =driver.findElement(By.xpath("//select[@id=\"make\"]"));
        Select bike =new Select(Moterbike);
        bike.selectByVisibleText("BMW");
        //select model
        WebElement Bikemodel =driver.findElement(By.xpath("//select[@id=\"model\"]"));
        Select bikemo =new Select(Bikemodel);
        bikemo.selectByVisibleText("Motorcycle");
        //Cylinder Capacity
        driver.findElement(By.xpath("//input[@id=\"cylindercapacity\"]")).sendKeys("4");
        // Enter Engine Cc .
        driver.findElement(By.xpath("//input[@id=\"engineperformance\"]")).sendKeys("1000");
        //select Manufacturing Date
        driver.findElement(By.xpath("//input[@id=\"dateofmanufacture\"]")).sendKeys("10/10/2009");
        //Select No.of Seats .
        driver.findElement(By.xpath("//select[@id=\"numberofseatsmotorcycle\"]"));
        WebElement NoOfseats =driver.findElement(By.xpath("//select[@id=\"numberofseatsmotorcycle\"]"));
        Select seats =new Select(NoOfseats);
        seats.selectByVisibleText("2");
        // input Price .
        driver.findElement(By.xpath("//input[@id=\"listprice\"]")).sendKeys("100000");
        //Select Mielage
        driver.findElement(By.xpath("//input[@id=\"annualmileage\"]")).sendKeys("450");
        //Select Next .
        driver.findElement(By.xpath("//button[@id=\"nextenterinsurantdata\"]")).click();

        //  ----------- 2nd page below ---------------

        //Enter First Name
        driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("Pranay");
        //Enter Last Name
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Khajindar");
        //Enter Birthdate
        driver.findElement(By.xpath("//input[@id=\"birthdate\"]")).sendKeys("10/13/2000");
        //enter Gender
        driver.findElement(By.xpath("//div[@class=\"field\"]//p//label[1]")).click();
        //Enter Address .
        driver.findElement(By.xpath("//input[@id=\"streetaddress\"]")).sendKeys("Park Avenue , 6th floor,ftno 600, Bella Blvd,Ontario Canada");
        // Select Country .
        driver.findElement(By.xpath("//select[@id=\"country\"]")).click();
        WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select selcountry=new Select(country);
        selcountry.selectByVisibleText("Canada");
        //Enter Zip Code.
        driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("411030");
        // City
        driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Ontario");
        //Select Occupation
        WebElement occupation =driver.findElement(By.xpath("//select[@id=\"occupation\"]"));
        Select occ =new Select(occupation);
        occ.selectByVisibleText("Selfemployed");
        // input Hobbies
        driver.findElement(By.xpath("//div[@class=\"field idealforms-field idealforms-field-checkbox\"][1]//p/label[1]")).click();
        //driver.findElement(By.xpath("//input[@id=\"skydiving\"]")).click();
        // Website
        driver.findElement(By.xpath("//input[@id=\"website\"]")).sendKeys("https://www.nerdwallet.com/ca/credit-cards/credit-card-zip-code-postal-code#:~:text=Postal%20codes%20in%20Canada%20are,helps%20Canada%20Post%20sort%20mail.");
        // Select Next
        driver.findElement(By.xpath("//button[@id=\"nextenterproductdata\"]")).click();

        //  ----------------xxxxx --3rd page below ---------------
        //Enter Start Date
        driver.findElement(By.xpath("//input[@id=\"startdate\"]")).sendKeys("10/05/2023");
        //Select Insurance Sum
        driver.findElement(By.xpath("//select[@id=\"insurancesum\"]")).click();
        WebElement Insuranamt =driver.findElement(By.xpath("//select[@id=\"insurancesum\"]"));
        Select insamt =new Select(Insuranamt);
        insamt.selectByVisibleText(" 35.000.000,00");
        //Select Damage Insurance
        driver.findElement(By.xpath("//select[@id=\"damageinsurance\"]")).click();
        WebElement DmgInsu=driver.findElement(By.xpath("//select[@id=\"damageinsurance\"]"));
        Select damInsu =new Select(DmgInsu);
        damInsu.selectByVisibleText("Full Coverage");
        // Select Optional Product
        Thread.sleep(3000);
        driver.findElement(By.xpath("//section[@class=\"idealsteps-step\"][3]//div[4]//p/label[1]")).click();
        //Click on next
        driver.findElement(By.xpath("//button[@id=\"nextselectpriceoption\"]")).click();

        // ----------------xxxxxxxxxxxx  4th page Below--------------------------
        driver.findElement(By.xpath("//table[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")).click();
        Thread.sleep(3000);
        // Click on Next
        driver.findElement(By.xpath("//button[@id=\"nextsendquote\"]")).click();

        // ---------------5th Page below -------------------------------
        // Enter Email .
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ahk@gl.commm");
        //enter Phone Number
        driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("7544554554");
        // enter Username
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("BmW_2023");
        // enter Password
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("BmW_2023");
        //Confirm  Password .
        driver.findElement(By.xpath("//input[@id=\"confirmpassword\"]")).sendKeys("BmW_2023");
        // enter Comments
        driver.findElement(By.xpath("//textarea[@id=\"Comments\"]")).sendKeys("Hello BMW bike !!");
        // Click on Send Button
        driver.findElement(By.xpath("//button[@id=\"sendemail\"]")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void Aftermethod() throws InterruptedException {
        System.out.println(driver.findElement(By.xpath("//div[@class=\"sweet-alert showSweetAlert visible\"]")).getText());
        Thread.sleep(3000);
        //click on ok
        driver.findElement(By.xpath("//div[@class=\"sa-confirm-button-container\"]/button")).click();
    }
    @AfterTest(alwaysRun = true)
    public void CloseDriver() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();
    }

}
