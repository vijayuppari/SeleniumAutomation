package paralleltesting;

import Basepack.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecutionbyclass3 extends baseclass {

    // parallel execution is working fine "classes"
    @Test
    public void launchfacebook(){

        getDriver().get("https://www.facebook.com/");
        System.out.println(getDriver().getTitle());
    }
}
