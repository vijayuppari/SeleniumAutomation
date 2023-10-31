package interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.util.TimeUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Openbrowserwithextension {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/SelectorsHub 4.7.8.0.crx"));

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://epaper.eenadu.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Title of the Page " + driver.getTitle());


    }
}
