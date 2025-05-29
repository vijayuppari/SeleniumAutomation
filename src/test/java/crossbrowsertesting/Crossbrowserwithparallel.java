package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowserwithparallel {

    static WebDriver driver;
    @Parameters("Browser")
    @Test
    public void getTitle(@Optional("Chrome") String browser){
        EdgeOptions eoptions = new EdgeOptions();
        eoptions.addArguments("--disable-notifications");

        ChromeOptions coptions = new ChromeOptions();
        coptions.addArguments("--disable-notifications");

        if(browser.equalsIgnoreCase("Chrome")){
        driver = new ChromeDriver(coptions);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        }
        else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver(eoptions);
            driver.get("https://accountopen.federalbank.co.in/CustomerPortal/index");
            System.out.println(driver.getTitle());
        }
         else{
            System.out.println("Please provide valid browser");
        }
        driver.quit();
    }
}
