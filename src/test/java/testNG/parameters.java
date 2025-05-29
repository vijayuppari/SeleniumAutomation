package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

    // Case 1:Parameters we are fetching it from TestNg XML
    @Test
    @Parameters({"a","b"})
    public static void Addition(int c, int d){

        int add = c+d;
        System.out.println(add);
    }

    // Case 2:Parameters are specific to Test
    @Test
    @Parameters("mango")
    public static void Fruties(String m){

        System.out.println(m);
    }
}
