package autoRiaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import driverManager.DriverManager;

import java.util.List;

public class AutoriaSearchPage extends DriverManager {
    private By titleOfTheHeader = By.xpath("//div[@id='headerPage']");
    private By itemTitle = By.xpath("//div[@class='item ticket-title']");

    private WebElement geTitleOfTheHeader(){
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(titleOfTheHeader));
    }

    public List<WebElement> getListOfItems(){
        driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(itemTitle));
        return driver.findElements(itemTitle);
    }

    public String getHeaderTextOfThePage(){
      return  geTitleOfTheHeader().getText();
    }
}
