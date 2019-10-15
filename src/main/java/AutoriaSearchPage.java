import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoriaSearchPage extends DriverManager {
    private By titleOfTheHeader = By.xpath("//div[@id='headerPage']");

    private WebElement geTitleOfTheHeader(){
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(titleOfTheHeader));
    }

    public String getHeaderTextOfThePage(){
      return  geTitleOfTheHeader().getText();
    }
}
