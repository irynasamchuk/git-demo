import org.junit.Assert;
import org.junit.Test;

public class AutoRiaTest extends DriverManager{
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
}
