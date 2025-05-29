package naveenautomationlabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverManager {

    private static volatile WebdriverManager instance;
    private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
    private WebdriverManager(){}
    private  void initdriver(String browser){
        switch (browser){
            case "chrome":
                tldriver.set(new ChromeDriver());
                break;
            case "edge":
                tldriver.set(new EdgeDriver());
                break;
            case "fireFox":
                tldriver.set(new FirefoxDriver());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browser);
        }
    }

    public static WebdriverManager getInstance(String browser){
        if (instance==null){
            synchronized (WebdriverManager.class){
                if(instance==null){
                    instance = new WebdriverManager();
                }
            }
        }
        if(tldriver.get()==null){
            instance.initdriver(browser);
        }
        return instance;
    }

    public WebDriver getDriver(){
      return tldriver.get();
    }

    public static void quitDriver(){
        if(tldriver.get()!=null){
        tldriver.get().quit();
        tldriver.remove();
        }
    }


}
