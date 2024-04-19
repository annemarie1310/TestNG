package kk;

import org.testng.annotations.Test;

public class Test1 {


    @Test(priority = 1)
    void setup(){
        System.out.println("i am setup");
    }
    @Test(priority = 2)
    void testSteps(){
        System.out.println("test Steps ");
    }
    @Test(priority = 3,enabled = false)   //if enable =false then,this method will not get executed in runtime.
    void Teardown(){
        System.out.println("closing ..");
    }

}
