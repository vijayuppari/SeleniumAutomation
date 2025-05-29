package Sorting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class redbuscalender {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        fetchweekenddates("Jul 2024");
        //System.out.println(fetchweekend);
        driver.quit();

    }

    public static void fetchweekenddates(String expectedmonth) throws InterruptedException {

        String reachmonth= "xyz 2024";
        WebElement caloption = driver.findElement(By.cssSelector(".labelCalendarContainer"));
        caloption.click();
        while (!expectedmonth.toUpperCase().split(" ")[0].contains(reachmonth.toUpperCase().split(" ")[0])) {
            List<WebElement> holidaycount =   driver.findElements(By.cssSelector(".holiday_count"));
            if(holidaycount.size()>0){
                System.out.println(driver.findElement(By.cssSelector(".holiday_count")).getText());
            }
            List<String> dayslist = new ArrayList<>();
            List<WebElement> weekenddates = driver.findElements(By.xpath("//*[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
            for (int i = 1; i < weekenddates.size() + 1; i++) {
                String wdays = driver.findElement(By.xpath("(//*[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA'])[" + i + "]")).getText();
                dayslist.add(wdays);
            }
            System.out.println(dayslist);
            driver.findElement(By.xpath("(//*[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[last()]")).click();
            String monthname =driver.findElement(By.xpath("(//*[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();
           reachmonth =monthname;
        }
       // return dayslist1;
    }

}
