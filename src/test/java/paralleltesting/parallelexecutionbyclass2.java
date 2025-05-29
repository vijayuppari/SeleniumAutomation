package paralleltesting;

import Basepack.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecutionbyclass2 extends baseclass {

    // parallel execution is working fine "classes"

    @Test
    public void launchfederal(){
        getDriver().get("https://accountopen.federalbank.co.in/CustomerPortal/index");
        System.out.println( getDriver().getTitle());
    }

}
