package pages;

import driverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudPage  extends DriverManager {
    @FindBy(xpath = "//a[@track-type='globalNav' and @track-name='pricing']")
    private WebElement pricing;


    @FindBy(xpath = "//a[@track-metadata-eventdetail='calculators']")
    private WebElement calcucating;

    public GoogleCloudPage(){
        PageFactory.initElements(driver, this);
    }

    private final String URL = "https://cloud.google.com/";

    public GoogleCloudPage openPage(){
        driver.get(URL);
        return this;
    }

    public GoogleCloudPage openPricingMenu(){
        pricing.click();
        return this;
    }

    public void openCanculatingLink(){
        calcucating.click();
    }
}

