package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parallelexecutionwithsingleton {

    // If we run parallel with static driver directly we will run into problems, So, in this case,
    // we will use the Threadlocal concept to overcome this issue
    //private static WebDriver driver;

    //private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    @BeforeMethod
    public void launchdriver(){
        singletonDriver.getInstance().setDriver();
        singletonDriver.getInstance().getDriver().get("https://www.saucedemo.com/v1/");
    }

    @Test
    public void testLogin1(){
        singletonDriver.getInstance().getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
        singletonDriver.getInstance().getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
        singletonDriver.getInstance().getDriver().findElement(By.id("login-button")).click();
    }

    @Test
    public void testLogin2(){
        singletonDriver.getInstance().getDriver().findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        singletonDriver.getInstance().getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
        singletonDriver.getInstance().getDriver().findElement(By.id("login-button")).click();
    }

    @AfterMethod
    public void tearDown(){
        singletonDriver.getInstance().getDriver().quit();
    }
}
