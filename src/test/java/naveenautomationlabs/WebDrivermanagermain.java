package naveenautomationlabs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebDrivermanagermain {

    private WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void launchbrowser(String browser){
         driver = WebdriverManager.getInstance(browser).getDriver();
    }
    @Test
    public void titleofGoogle(){
        driver.get("https://www.google.com/");
        System.out.println("Thread running on " + Thread.currentThread().getName() + "Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
    }
    @AfterClass
    public void tearDown(){
        WebdriverManager.quitDriver();
    }
}
