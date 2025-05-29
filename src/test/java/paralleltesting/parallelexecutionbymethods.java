package paralleltesting;

import Basepack.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecutionbymethods extends baseclass {

    // parallel execution is working fine "methods"

    @Test(priority = 1)
    public void launchgoogle(){
        getDriver().get("https://www.google.com/");
        System.out.println( getDriver().getTitle());
    }

    @Test(priority = 2)
    public void launchfederal(){
        getDriver().get("https://accountopen.federalbank.co.in/CustomerPortal/index");
        System.out.println( getDriver().getTitle());
    }

    @Test(priority = 3)
    public void launchfacebook(){
        getDriver().get("https://www.facebook.com/");
        System.out.println( getDriver().getTitle());
    }
    @Test(priority = 4)
    public void launchorangehrm(){
        getDriver().get("https://www.orangehrm.com/");
        System.out.println( getDriver().getTitle());
    }
    @Test(priority = 5)
    public void launchmukesh(){
        getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        System.out.println( getDriver().getTitle());
    }
}
