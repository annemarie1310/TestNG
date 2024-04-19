package SDET_Youtube_TestNG.DependencyExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencies {
    @Test()
    void CarStart(){
        System.out.println("Car Started ...");
        //Assert.fail();  //this will fail the method.
    }

    @Test(dependsOnMethods = "CarStart") //dependentsOnMethod makes what the method dependent on method name entered.
    void Cardriving(){
        System.out.println("car is moving ..");
    }

    @Test(dependsOnMethods = "Cardriving")
    void CarStopped(){
        System.out.println("car is stopped..");
    }

    @Test(dependsOnMethods = {"CarStopped","CarStart"},alwaysRun = true) //if alwaysRun is true it will always run and not dependent on any method..
    void carpark(){
        System.out.println("car is parked...");
    }



}
