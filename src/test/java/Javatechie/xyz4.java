package Javatechie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class xyz4 {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

            driver = new ChromeDriver();
            driver.get("https://www.browserstack.com/");
            driver.manage().window().maximize();

            WebElement eledemo  = driver.findElement(By.xpath("//div[text()='Get a demo']"));

            driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(eledemo)).click();
            Thread.sleep(3000);
            System.out.println(driver.getTitle());


    }
}
