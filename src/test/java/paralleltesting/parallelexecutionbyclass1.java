package paralleltesting;

import Basepack.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecutionbyclass1 extends baseclass {

    // parallel execution is working fine "classes"
    // By default in the test-ng xml will take thread count as 5 even though we can not specify

    @Test
    public void launchgoogle(){
        getDriver().get("https://www.google.com/");
        System.out.println(getDriver().getTitle());
    }

}
