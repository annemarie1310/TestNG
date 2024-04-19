package TricentisWith_projectObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class All_Insurance {

    WebDriver driver;

    public All_Insurance(WebDriver d){
        driver =d;
    }

    // Select Automobile below .
    public void selectautomobile(){
        driver.findElement(By.xpath("//a[@id=\"nav_automobile\"][text()=\"Automobile\"][1]")).click();
    }
    public void Truckk(){
        driver.findElement(By.xpath("//a[@id=\"nav_truck\"][1]")).click();
    }
    public void Motorbike(){
        driver.findElement(By.xpath("//a[@id=\"nav_motorcycle\"][1]")).click();

    }
    public void Camper(){
        driver.findElement(By.xpath("//a[@id=\"nav_camper\"][1]")).click();
    }
    public void selectmake(String Make){

        WebElement CarMake =driver.findElement(By.xpath("//select[@id=\"make\"]"));
        Select carmake =new Select(CarMake);
        carmake.selectByVisibleText(Make);
    }
    // Enter Engine Cc .
        public void SelectengineCC(String cc){
            driver.findElement(By.xpath("//input[@id=\"engineperformance\"]")).sendKeys(cc);
        }


    //select Manufacturing Date
       public void selectManufacturingDate(String manufdate){
           driver.findElement(By.xpath("//input[@id=\"dateofmanufacture\"]")).sendKeys(manufdate);
       }

    //Select No.of Seats .
    public void noOfSeats(String noSeats){
        driver.findElement(By.xpath("//select[@id=\"numberofseats\"]"));
        WebElement NoOfseats =driver.findElement(By.xpath("//select[@id=\"numberofseats\"]"));
        Select seats =new Select(NoOfseats);
        seats.selectByVisibleText(noSeats);
    }
    public void noofseatmotercycle(String seatsBike){
        driver.findElement(By.xpath("//select[@id=\"numberofseatsmotorcycle\"]"));
        WebElement NoOfseats =driver.findElement(By.xpath("//select[@id=\"numberofseatsmotorcycle\"]"));
        Select seats =new Select(NoOfseats);
        seats.selectByVisibleText(seatsBike);
    }
    // Select Fuel Type
    public void FuelType(String fuelty){
        driver.findElement(By.xpath("//select[@id=\"fuel\"]")).click();
        WebElement FuelType =driver.findElement(By.xpath("//select[@id=\"fuel\"]"));
        Select fuel =new Select(FuelType);
        fuel.selectByValue(fuelty);
    }

    // input Price .
        public void Price(String priceee){
            driver.findElement(By.xpath("//input[@id=\"listprice\"]")).sendKeys(priceee);
        }

    // License Plate
        public void LicencePlate(String licence){
            driver.findElement(By.xpath("//input[@id=\"licenseplatenumber\"]")).sendKeys(licence);
        }

    //Select Mielage
    public void Mielageannual(String mielage){
        driver.findElement(By.xpath("//input[@id=\"annualmileage\"]")).sendKeys(mielage);
    }

    //Select Next .
    public void next(){
        driver.findElement(By.xpath("//button[@id=\"nextenterinsurantdata\"]")).click();
    }

    //Enter First Name
    public void firstname(String name){
        driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys(name);
    }

    //Enter Last Name
    public void  Lastname(String Lastname){
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Khajindar");
    }


    //Enter Birthdate
    public void EnterBirthdate(String birthdate){
        driver.findElement(By.xpath("//input[@id=\"birthdate\"]")).sendKeys(birthdate);
    }

    //enter Gender
    public void entergender(){
        driver.findElement(By.xpath("//div[@class=\"field\"]//p//label[1]")).click();
    }

    //enter gender for camper
    public void campergender(){
        driver.findElement(By.xpath("//section[@class=\"idealsteps-step\"][2]/div[4]/p/label[1]")).click();

    }

    //Enter Address
    public void EnterAddress(String address){
        driver.findElement(By.xpath("//input[@id=\"streetaddress\"]")).
                sendKeys(address);
    }

    // Select Country

    public void SelectCountry(String countryy){
        driver.findElement(By.xpath("//select[@id=\"country\"]")).click();
        WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select selcountry=new Select(country);
        selcountry.selectByVisibleText(countryy);
    }


    //Enter Zip Code.
    public void EnterZipCode(String zipcod){
        driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys(zipcod);
    }


    // City
    public void City(String citty){
        driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys(citty);
    }

    //Select Occupation
    public void SelectOccupation(String occupationn){
        WebElement occupation =driver.findElement(By.xpath("//select[@id=\"occupation\"]"));
        Select occ =new Select(occupation);
        occ.selectByVisibleText(occupationn);
    }

    // input Hobbies
    public void inputHobbies(){
        driver.findElement(By.xpath("//div[@class=\"field idealforms-field idealforms-field-checkbox\"][1]//p/label[1]")).click();
    }
    //driver.findElement(By.xpath("//input[@id=\"skydiving\"]")).click();
    // Website
    public void Website(String website){
        driver.findElement(By.xpath("//input[@id=\"website\"]")).sendKeys(website);

    }
    // Select Next
    public void Next2(){
        driver.findElement(By.xpath("//button[@id=\"nextenterproductdata\"]")).click();
    }

    //Enter Start Date
    public void enterstartdate(String startdate){
        driver.findElement(By.xpath("//input[@id=\"startdate\"]")).sendKeys(startdate);
    }

    //Select Insurance Sum
    public void Insusum(String enterinsum){
        driver.findElement(By.xpath("//select[@id=\"insurancesum\"]")).click();
        WebElement Insuranamt =driver.findElement(By.xpath("//select[@id=\"insurancesum\"]"));
        Select insamt =new Select(Insuranamt);
        insamt.selectByVisibleText(enterinsum);
    }


    //Select Merit Rating
        public void meritrating(String meritt){
            driver.findElement(By.xpath("//select[@id=\"meritrating\"]")).click();
            WebElement Meritr=driver.findElement(By.xpath("//select[@id=\"meritrating\"]"));
            Select merit =new Select(Meritr);
            merit.selectByVisibleText(meritt);
        }

    //Select Damage Insurance
    public void damaginsu(String damgin){
        driver.findElement(By.xpath("//select[@id=\"damageinsurance\"]")).click();
        WebElement DmgInsu=driver.findElement(By.xpath("//select[@id=\"damageinsurance\"]"));
        Select damInsu =new Select(DmgInsu);
        damInsu.selectByVisibleText(damgin);
    }

    // Select Optional Product
    public void optionalProd() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//section[@class=\"idealsteps-step\"][3]//div[@class=\"field idealforms-field idealforms-field-checkbox\"]//span[1]")).click();
    }

    // Select Courtesy Car
    public void courtcar(String cort){
        driver.findElement(By.xpath("//select[@id=\"courtesycar\"]")).click();
        WebElement CourtCar=driver.findElement(By.xpath("//select[@id=\"courtesycar\"]"));
        Select courcar =new Select(CourtCar);
        courcar.selectByValue(cort);
    }

    //Click on next
     public void next3(){
         driver.findElement(By.xpath("//button[@id=\"nextselectpriceoption\"]")).click();
     }
/*
     public void selectInsurance() throws InterruptedException {
         String price=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[1]/td[2]")).getText();
         String Onlineclaim=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[2]/td[2]")).getText();
         String ClaimsDisc=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[3]/td[2]")).getText();
         String WorldWideCover=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[4]/td[2]")).getText();

         if (price.equalsIgnoreCase("272.00")&&Onlineclaim.equalsIgnoreCase("No")&&ClaimsDisc.equalsIgnoreCase("No")&&WorldWideCover.equalsIgnoreCase("No")){
             driver.findElement(By.xpath("//table[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")).click();
             Thread.sleep(3000);
             // Click on Next
             driver.findElement(By.xpath("//button[@id=\"nextsendquote\"]")).click();
         }
     }
*/
    public void selectInsurancee() throws InterruptedException {
        driver.findElement(By.xpath("//table[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")).click();
        Thread.sleep(3000);
        // Click on Next
        driver.findElement(By.xpath("//button[@id=\"nextsendquote\"]")).click();
    }

    // Enter Email .
    public void email(String email){
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kkk@gl.commm");
    }

    //enter Phone Number
    public void phonnum(String email){
        driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys(email);
    }

    // enter Username
    public void username(String uname){
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(uname);
    }

    // enter Password
    public void password(String pass){
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pass);
    }

    //Confirm  Password .
    public void confirmpass(String confirmpas){
        driver.findElement(By.xpath("//input[@id=\"confirmpassword\"]")).sendKeys(confirmpas);
    }

    // enter Comments
    public void comments(String commm){
        driver.findElement(By.xpath("//textarea[@id=\"Comments\"]")).sendKeys(commm);
    }

    // Click on Send Button
    public void sendemailbutton(){
        driver.findElement(By.xpath("//button[@id=\"sendemail\"]")).click();
    }


    //           ----------------------------------------     TRUCK    -------------------------------------
    //Enter payload
    public void Payload(String paylod){
        driver.findElement(By.xpath("//input[@id=\"payload\"]")).sendKeys(paylod);
    }

    //Select Total Weight
    public void TotWeight(String TotWeight){
        driver.findElement(By.xpath("//input[@id=\"totalweight\"]")).sendKeys(TotWeight);
    }

    public void selectmodel(String model){
        WebElement Bikemodel =driver.findElement(By.xpath("//select[@id=\"model\"]"));
        Select bikemo =new Select(Bikemodel);
        bikemo.selectByVisibleText(model);
    }

    public void selectcylindercap(String cylindercap){
        driver.findElement(By.xpath("//input[@id=\"cylindercapacity\"]")).sendKeys(cylindercap);

    }

    public void HandDrive(){
        driver.findElement(By.xpath("//div[@class=\"field\"]//p/label[1]")).click();
    }

}
