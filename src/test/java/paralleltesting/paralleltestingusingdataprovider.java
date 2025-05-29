package paralleltesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class paralleltestingusingdataprovider {


    @Test(dataProvider = "dp1")
    public void test(int number){
        System.out.println("The Thread ID for "+ number + " Is :  " + Thread.currentThread().getId());
    }

    @DataProvider(parallel = true)
    public Object[][] dp1(){
        return new Object[][]{
                new Object[]{1},
                new Object[]{2},
                new Object[]{3},
                new Object[]{4},
                new Object[]{5},
        };
    }
}
