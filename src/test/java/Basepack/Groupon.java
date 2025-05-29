package Basepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Groupon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.groupon.com/");
        driver.manage().window().maximize();
       WebElement ele = driver.findElement(By.xpath("//*[@class='mb-xl text-center text-h2 text-body']"));
       String textfield = ele.getText();
        System.out.println(textfield);
        Assert.assertEquals(textfield,"Select your location to see nearby deals");
        WebElement continuebtn = driver.findElement(By.xpath("//div[contains(text(),'Continue')]"));
        continuebtn.click();
        Thread.sleep(5000);
        driver.close();

    }
}
