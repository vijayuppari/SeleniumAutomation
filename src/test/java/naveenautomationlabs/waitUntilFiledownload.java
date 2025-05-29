package naveenautomationlabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.time.Duration;

public class waitUntilFiledownload {

    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        // this will unblock the downloads
        options.addArguments("--disable-features-InsecureDownloadWarnings");
        // options.addArguments("--unsafely-treat-insecure-origin-as-secure=https://get.jenkins.io/windows-stable/2.426.1/jenkins.msi");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://get.jenkins.io/windows-stable/2.426.1/jenkins.msi");
        String downloadpath = "C:/Users/Vijay/Downloads";
        String downloadfilename = "jenkins.msi";

        File file = new File(downloadpath,downloadfilename);
        FluentWait<File> fwait = new FluentWait<File>(file)
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class)
                .withMessage("file not downloaded");

        Boolean isDownloaded = fwait.until(f -> f.exists() && f.canRead());
        if(isDownloaded){
            System.out.println("File is 100% downloaded");
        }
        else {
            System.out.println("File is not completely downloaded");
        }
    }
}
