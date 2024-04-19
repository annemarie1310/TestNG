package SDET_Youtube_TestNG.Annotations;

import org.testng.annotations.*;

public class Tc1 {


    @BeforeTest
    void beforTest(){
        System.out.println("This will execute before Test");
    }

    @BeforeClass
    void beforClass(){
        System.out.println("This will execute before Class (  TC1  )");
    }

    @BeforeMethod
    void beformethod(){
        System.out.println("This will execute before method");
    }
    @Test
    void test1(){
        System.out.println("Hello, I am Test .. 1");
    }
    @Test
    void test2(){
        System.out.println("Hello, I am Test .. 2");
    }


    @AfterMethod
    void aftermethod(){
        System.out.println("This will execute after method");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after Class  (  TC1  )");
    }


    @AfterTest
    void afterTest(){
        System.out.println("This will execute after Test");
    }



}
