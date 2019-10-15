import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
    protected static WebDriver driver;
    protected static WebDriverWait driverWait;

    @BeforeClass
    public static void openDriver(){
        if (driver == null){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("C:\\Users\\Iryna_Samchuk\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver(chromeOptions);
            driverWait = new WebDriverWait(driver, 15);
        }
    }

    @AfterClass
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
