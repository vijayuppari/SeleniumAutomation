package Basepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseclass {

    private static ThreadLocal<ChromeDriver> driver = new ThreadLocal<ChromeDriver>();

    @BeforeClass
    public void setUp(){

        driver.set(new ChromeDriver());
    }

    public WebDriver getDriver(){

        return driver.get();
    }

    @AfterClass
    public void tearDown(){

        driver.get().quit();
    }


}
