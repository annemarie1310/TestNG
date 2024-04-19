package SDET_Youtube_TestNG.Grouping;

import org.testng.annotations.Test;
/*
to run these methods according to group , write the group name in .xml file ,as follows
<tests>
<groups>
       <run>
       <include name="Sanaity"/>
       </run>
</groups>
        <Classes>
            <class name="groupingExample"/>
        </Classes
</tests>

//Note *
Notes if you want to exclude any group write :- <exclude name="Sanity"/>
*/
public class groupingExample {

    @Test(groups = "Sanity")
    void Test1(){
        System.out.println("This is Test 1");
    }
    @Test(groups = "Sanity")
    void Test2(){
        System.out.println("This is Test 2");
    }
    @Test(groups = "Sanity")
    void Test3(){
        System.out.println("This is Test 3");
    }
    @Test(groups = "Regression")
    void Test4(){
        System.out.println("This is Test 4");
    }
    @Test(groups = {"Sanity","Regression"})
    void Test5(){
        System.out.println("This is Test 5");
    }
}
