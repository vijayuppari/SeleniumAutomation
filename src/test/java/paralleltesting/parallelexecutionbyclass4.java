package paralleltesting;

import Basepack.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecutionbyclass4 extends baseclass {

    // parallel execution is working fine "classes"

    @Test
    public void launchorangehrm(){
        getDriver().get("https://www.orangehrm.com/");
        System.out.println( getDriver().getTitle());
    }
}
