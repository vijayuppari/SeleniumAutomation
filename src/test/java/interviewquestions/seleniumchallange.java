package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class seleniumchallange {

    public static void main(String[] args) {

            verifystateinUS("Florida");

    }

    public static void verifystateinUS(String statename){

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://petdiseasealerts.org/forecast-map#/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());


        JavascriptExecutor js =  (JavascriptExecutor)driver;
        //*[local-name()='svg' and @id='map-svg']//*[@class='region']//*[@class='rpath']//*[@name='Alabama']
        js.executeScript("window.scrollBy(1,400)");
        WebElement frameele =driver.findElement(By.xpath("//*[starts-with(@id,'map-instance')]"));
        driver.switchTo().frame(frameele);
        WebElement state =driver.findElement(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[@name='"+statename+"']"));
        state.click();

        // Navigate to next page
        WebElement nextpagevalidation =driver.findElement(By.xpath("//a[contains(text(),'United States')]"));
        WebDriverWait webDriverWait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(nextpagevalidation));

        // Validate next page
        Assert.assertEquals(nextpagevalidation.getText(),"United States");
        System.out.println("Successfully render the next page "+nextpagevalidation.getText());


        // Statename validation in next page
        WebElement statenamecapture =driver.findElement(By.xpath("//span[contains(text(),'"+statename+"')]"));
        Assert.assertEquals(statenamecapture.getText(),statename);
        System.out.println("Successfully render the next page "+nextpagevalidation.getText());

    }
}
