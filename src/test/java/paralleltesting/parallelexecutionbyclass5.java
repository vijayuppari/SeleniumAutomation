package paralleltesting;

import Basepack.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecutionbyclass5 extends baseclass {

    // parallel execution is working fine "classes"
    @Test
    public void launchmukesh(){
        getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        System.out.println( getDriver().getTitle());
    }
}
