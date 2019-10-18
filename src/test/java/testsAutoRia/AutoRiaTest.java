package testsAutoRia;

import autoRiaPages.AutoRiaMainPage;
import autoRiaPages.AutoriaSearchPage;
import org.junit.Assert;
import org.junit.Test;
import driverManager.DriverManager;

public class AutoRiaTest extends DriverManager {
    AutoRiaMainPage autoRiaMainPage = new AutoRiaMainPage();
    AutoriaSearchPage autoriaSearchPage = new AutoriaSearchPage();
    private String headerText = "Продажа Мото BMW";

   @Test
    public void makeSearch(){
        autoRiaMainPage.openMainPage();
        autoRiaMainPage.selectCategory(2);
        autoRiaMainPage.autoBrandSearch("BMW");
        autoRiaMainPage.clickSearchButton();
        Assert.assertEquals(headerText, autoriaSearchPage.getHeaderTextOfThePage());
    }

    @Test
    public void makeSearchAndCheckList(){
        autoRiaMainPage.openMainPage();
        autoRiaMainPage.selectCategory(2);
        autoRiaMainPage.autoBrandSearch("BMW");
        autoRiaMainPage.clickSearchButton();
        Assert.assertTrue("The list on items is not empty", autoriaSearchPage.getListOfItems().size() > 0);
    }
}
