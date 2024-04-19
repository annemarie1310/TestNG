package TricentisWith_projectObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class automobile_Client {

    WebDriver driver;
    All_Insurance r1;

    @BeforeClass
    public void beforetest(){

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("http://www.sparkstone.co.nz/sampleapp/101/#");
        r1=new All_Insurance(driver);
    }
    
    @DataProvider
    public Object[][] InsuranceCheck(){
        return new Object[][]{
                new Object[]{272,"No","No","No"},
//                new Object[]{272.00,"No","No","No"},
//                new Object[]{272.00,"No","No","No"},
//                new Object[]{272.00,"No","No","No"},
        };
    }
    
    @Test(priority = 1,dataProvider = "InsuranceCheck")
    public void automobile (Integer price, String Onlineclaim ,String ClaimsDisc ,String WorldWideCover) throws Exception {
        r1.selectautomobile();
        r1.selectmake("Porsche");
        r1.SelectengineCC("2000");
        r1.selectManufacturingDate("10/10/2010");
        r1.noOfSeats("2");
        r1.FuelType("Petrol");
        r1.Price("100000");
        r1.LicencePlate("6TRJ244");
        r1.Mielageannual("500");
        r1.next();

       //  -- 2nd page
        r1.firstname("Pranay");
        r1.Lastname("Khajindar");
        r1.EnterBirthdate("10/13/2000");
        r1.entergender();
        r1.EnterAddress("Park Avenue , 6th floor,ftno 600, Bella Blvd,Ontario Canada");
        r1.SelectCountry("Canada");
        r1.EnterZipCode("411030");
        r1.City("Ontario");
        r1.SelectOccupation("Selfemployed");
        r1.inputHobbies();
        r1.Website("https://www.nerdwallet.com/ca/credit-cards/credit-card-zip-code-postal-code#:~:text=Postal%20codes%20in%20Canada%20are,helps%20Canada%20Post%20sort%20mail.");
        r1.Next2();

        //-------3rd page-------
        r1.enterstartdate("10/05/2023");
        r1.Insusum(" 35.000.000,00");
        r1.meritrating("Bonus 4");
        r1.damaginsu("Full Coverage");
        r1.optionalProd();
        r1.courtcar("Yes");
        r1.next3();

        // -----4th page----
     //   r1.selectInsurancee();
        if (price.equals(272)&&Onlineclaim.equalsIgnoreCase("No")&&ClaimsDisc.equalsIgnoreCase("No")&&WorldWideCover.equalsIgnoreCase("No")){
            driver.findElement(By.xpath("//table[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")).click();
            Thread.sleep(3000);
            // Click on Next
            driver.findElement(By.xpath("//button[@id=\"nextsendquote\"]")).click();
        }

        //------5th page----
        r1.email("kkk@gl.commm");
        r1.phonnum("75445454554");
        r1.username("porsche_2023");
        r1.password("Porchse@2023");
        r1.confirmpass("Porchse@2023");
        r1.comments("Hello Porsche !!");
        r1.sendemailbutton();
    }


    @Test(priority = 2)
    public void Truck () throws Exception {
        r1.Truckk();
        r1.selectmake("Porsche");
        r1.SelectengineCC("2000");
        r1.selectManufacturingDate("10/10/2010");
        r1.noOfSeats("2");
        r1.FuelType("Petrol");
        r1.Payload("1000");
        r1.TotWeight("4000");
        r1.Price("100000");
        r1.LicencePlate("6TRJ244");
        r1.Mielageannual("500");
        r1.next();

        //  -- 2nd page
        r1.firstname("Pranay");
        r1.Lastname("Khajindar");
        r1.EnterBirthdate("10/13/2000");
        r1.entergender();
        r1.EnterAddress("Park Avenue , 6th floor,ftno 600, Bella Blvd,Ontario Canada");
        r1.SelectCountry("Canada");
        r1.EnterZipCode("411030");
        r1.City("Ontario");
        r1.SelectOccupation("Selfemployed");
        r1.inputHobbies();
        r1.Website("https://www.nerdwallet.com/ca/credit-cards/credit-card-zip-code-postal-code#:~:text=Postal%20codes%20in%20Canada%20are,helps%20Canada%20Post%20sort%20mail.");
        r1.Next2();

        //-------3rd page-------
        r1.enterstartdate("10/05/2023");
        r1.Insusum(" 35.000.000,00");
        r1.damaginsu("Full Coverage");
        r1.optionalProd();
        r1.next3();

        // -----4th page----
        r1.selectInsurancee();

        //------5th page----
        r1.email("kkk@gl.commm");
        r1.phonnum("75445454554");
        r1.username("porsche_2023");
        r1.password("Porchse@2023");
        r1.confirmpass("Porchse@2023");
        r1.comments("Hello Porsche !!");
        r1.sendemailbutton();
    }

    @Test(priority = 3)
    public void Motercycle () throws Exception {
        r1.Motorbike();
        r1.selectmake("Porsche");
        r1.selectmodel("Motorcycle");
        r1.selectcylindercap("4");
        r1.SelectengineCC("2000");
        r1.selectManufacturingDate("10/10/2010");
        r1.noofseatmotercycle("2");
        r1.Price("100000");
        r1.Mielageannual("500");
        r1.next();

        //  -- 2nd page
        r1.firstname("Pranay");
        r1.Lastname("Khajindar");
        r1.EnterBirthdate("10/13/2000");
        r1.entergender();
        r1.EnterAddress("Park Avenue , 6th floor,ftno 600, Bella Blvd,Ontario Canada");
        r1.SelectCountry("Canada");
        r1.EnterZipCode("411030");
        r1.City("Ontario");
        r1.SelectOccupation("Selfemployed");
        r1.inputHobbies();
        r1.Website("https://www.nerdwallet.com/ca/credit-cards/credit-card-zip-code-postal-code#:~:text=Postal%20codes%20in%20Canada%20are,helps%20Canada%20Post%20sort%20mail.");
        r1.Next2();

        //-------3rd page-------
        r1.enterstartdate("10/05/2023");
        r1.Insusum(" 35.000.000,00");
        r1.damaginsu("Full Coverage");
        r1.optionalProd();
        r1.next3();

        // -----4th page----
        r1.selectInsurancee();

        //------5th page----
        r1.email("kkk@gl.commm");
        r1.phonnum("75445454554");
        r1.username("porsche_2023");
        r1.password("Porchse@2023");
        r1.confirmpass("Porchse@2023");
        r1.comments("Hello Porsche !!");
        r1.sendemailbutton();
    }

    @Test(priority = 4)
    public void Camper () throws Exception {
        r1.Camper();
        r1.selectmake("Porsche");
        r1.SelectengineCC("2000");
        r1.selectManufacturingDate("10/10/2010");
        r1.noOfSeats("4");
        r1.HandDrive();
        r1.FuelType("Petrol");
        r1.Payload("1000");
        r1.TotWeight("4000");
        r1.Price("100000");
        r1.LicencePlate("6TRJ244");
        r1.Mielageannual("500");
        r1.next();

        //  -- 2nd page
        r1.firstname("Pranay");
        r1.Lastname("Khajindar");
        r1.EnterBirthdate("10/13/2000");
        r1.campergender();
        r1.EnterAddress("Park Avenue , 6th floor,ftno 600, Bella Blvd,Ontario Canada");
        r1.SelectCountry("Canada");
        r1.EnterZipCode("411030");
        r1.City("Ontario");
        r1.SelectOccupation("Selfemployed");
        r1.inputHobbies();
        r1.Website("https://www.nerdwallet.com/ca/credit-cards/credit-card-zip-code-postal-code#:~:text=Postal%20codes%20in%20Canada%20are,helps%20Canada%20Post%20sort%20mail.");
        r1.Next2();

        //-------3rd page-------
        r1.enterstartdate("10/05/2023");
        r1.Insusum(" 35.000.000,00");
        r1.damaginsu("Full Coverage");
        r1.optionalProd();
        r1.next3();

        // -----4th page----
        r1.selectInsurancee();

        //------5th page----
        r1.email("kkk@gl.commm");
        r1.phonnum("75445454554");
        r1.username("porsche_2023");
        r1.password("Porchse@2023");
        r1.confirmpass("Porchse@2023");
        r1.comments("Hello Porsche !!");
        r1.sendemailbutton();
    }


    @AfterMethod
    public void aftermethod() throws InterruptedException {
        System.out.println(driver.findElement(By.xpath("//div[@class=\"sweet-alert showSweetAlert visible\"]")).getText());
        Thread.sleep(3000);
        //click on ok
        driver.findElement(By.xpath("//div[@class=\"sa-confirm-button-container\"]/button")).click();
    }

    @AfterClass
    public void aftertest(){
        driver.close();
    }


}
