package Sorting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class closeandquit {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

       WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.redbus.in/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.quit();
    }
}
