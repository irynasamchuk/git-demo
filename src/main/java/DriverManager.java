import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    protected static WebDriver driver;

    @BeforeClass
    public static void openDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
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
