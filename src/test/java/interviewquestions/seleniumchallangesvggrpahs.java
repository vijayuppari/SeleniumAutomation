package interviewquestions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class seleniumchallangesvggrpahs {

    public static void main(String[] args) {

        printcoronavirusnumber();

    }

    public static void printcoronavirusnumber(){

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.worldometers.info/coronavirus/country/india/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());


        JavascriptExecutor js =  (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(1,400)");

     List<WebElement> allstates=  driver.findElements(By.xpath("(//*[local-name()='svg'])[5]//*[name()='path']"));
        Actions act= new Actions(driver);
     for (WebElement ele:allstates){
            act.moveToElement(ele).perform();
          String txt=  driver.findElement(By.xpath("(//*[local-name()='svg'])[5]//*[@class='highcharts-grid-line']")).getText();
         System.out.println(txt);
        }
    }
}
