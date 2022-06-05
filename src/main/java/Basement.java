import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Basement {

    // //span[contains(text(),'I reject recommended cookies')]

    public static WebDriver driver;
    public void openbrowser(String browser) {



        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();


        switch (browser) {


            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "iexplorer":
                driver = new InternetExplorerDriver();
                break;

            case "Edge":
                driver = new EdgeDriver();
                break;

            default:
                driver = new ChromeDriver();
                return;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.close();
    }

}