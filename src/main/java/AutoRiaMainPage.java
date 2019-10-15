import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AutoRiaMainPage extends DriverManager{
    private By searchForm = By.xpath("//div[contains(@class, 'form-search' )]");
    private By selectCategories = By.xpath("//select[@id = 'categories']");
    private By markaInput = By.xpath("//input[@id = 'brandTooltipBrandAutocompleteInput-brand']");
    private By markaDropDown = By.xpath("//ul[contains(@class, 'unstyle scrollbar autocomplete-select')] [1]");
    private By searchButton = By.xpath("//button[@type = 'submit']");
    private final String URL = "https://auto.ria.com";


    public Select getCategorySelect(){
        return new Select(driverWait.until(ExpectedConditions.visibilityOfElementLocated(selectCategories)));
    }

    public WebElement getMarkaInput(){
        return driver.findElement(markaInput);
    }

    public WebElement getSearchButton(){
        return driver.findElement(searchButton);
    }

    public WebElement getMarkaDropdown(){
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(markaDropDown));
    }

    public AutoRiaMainPage selectCategory(int index){
        getCategorySelect().selectByIndex(index);
        return this;
    }

    public AutoRiaMainPage autoBrandSearch(String autoBrand){
        getMarkaInput().sendKeys(autoBrand);
        getMarkaDropdown().click();
        return this;
    }

    public AutoRiaMainPage clickSearchButton(){
        getSearchButton().click();
        return this;
    }

    public void openMainPage(){
        driver.get(URL);
    }
}
