package pages;

import driverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleCloudProductCanculator extends DriverManager {
    @FindBy(xpath = "//input[@id='input-0']")
    private WebElement itemTitle;

    @FindBy(xpath = "//input[@id='input_53']")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//div[@title='App Engine' and contains(@class, 'tab-holder app-engine')]")
    private WebElement appEngine;

    @FindBy(xpath = "//a[@class='cta-button-secondary button']")
    private WebElement contactSales;

    @FindBy(xpath = "//iframe[@id='idIframe']")
    private WebElement iFrame;

    public GoogleCloudProductCanculator() {
        PageFactory.initElements(driver, this);
    }

    public GoogleCloudProductCanculator openPage() {
        driver.get("https://cloud.google.com/products/calculator/");
        return this;
    }

    public GoogleCloudProductCanculator switchToFrame(){
        driverWait.until(ExpectedConditions.visibilityOf(iFrame));
        driver.switchTo().frame(iFrame);
        return this;
    }

    public GoogleCloudProductCanculator fillItemField(String keyword) {
        driverWait.until(ExpectedConditions.visibilityOf(itemTitle));
        itemTitle.click();
        itemTitle.sendKeys(keyword);
        return this;
    }

    public GoogleCloudProductCanculator clickMenu(){
        driverWait.until(ExpectedConditions.visibilityOf(contactSales));
        contactSales.click();
        return this;
    }

    public GoogleCloudProductCanculator fillNumberField(String keyword){
        driverWait.until(ExpectedConditions.visibilityOf(numberOfInstances));
        numberOfInstances.click();
        numberOfInstances.sendKeys(keyword);
        return this;
    }
}
