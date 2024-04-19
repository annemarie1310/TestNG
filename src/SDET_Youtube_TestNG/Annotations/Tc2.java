package SDET_Youtube_TestNG.Annotations;

import org.testng.annotations.*;

public class Tc2 {
    @BeforeSuite
    void beforesuit(){
        System.out.println("This will execute before suit");
    }

    @BeforeClass
    void beforClass(){
        System.out.println("This will execute before Class (  TC2  )");
    }

    @BeforeMethod
    void beformethod(){
        System.out.println("This will execute before method");
    }
    @Test
    void test3(){
        System.out.println("Hello, I am Test .. 3");
    }
    @Test
    void test4(){
        System.out.println("Hello, I am Test .. 4");
    }


    @AfterMethod
    void aftermethod(){
        System.out.println("This will execute after method");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after Class  (  TC2  )");
    }

    @AfterSuite
    void afteresuit(){
        System.out.println("This will execute after suit");
    }
}
