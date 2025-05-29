package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singletonDriver {
    private static singletonDriver Instance;
    private WebDriver driver;
    private singletonDriver(){
    }
    public static singletonDriver getInstance(){
        if(Instance==null){
            Instance = new singletonDriver();
        }
        return Instance;
    }
    public void setDriver(){
        driver = new ChromeDriver();
    }
    public WebDriver getDriver(){
        return driver;
    }

}
