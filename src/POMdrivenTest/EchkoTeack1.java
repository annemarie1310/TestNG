package POMdrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EchkoTeack1 {
    WebDriver driver;

    public EchkoTeack1(WebDriver d){
        driver =d;
    }
/*
    public void clickonSignIn(){
        driver.findElement(By.xpath("")).click();

    }
    */
    public void SendUsername(String username){
        driver.findElement(By.xpath("//input[@id=\"txtCustomerID\"]")).sendKeys(username);

    }

    public void Sendpass(String pass){
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(pass);

    }
    public void clickonSignInbutton(){
        driver.findElement(By.xpath("//input[@title=\"Login\"][@value=\"Login\"]")).click();

    }
    public String geterromsg(){
        String actmsg=driver.findElement(By.xpath("//span[@id=\"lblMsg\"]")).getText();
        return actmsg;
    }
/*
    public String handleAlert(){
        Alert alert=driver.switchTo().alert();
        String altmsg =alert.getText();
        alert.accept();
        return altmsg;
    }
    */
}
