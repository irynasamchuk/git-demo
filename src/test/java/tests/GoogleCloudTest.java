package tests;

import org.junit.Test;
import driverManager.DriverManager;
import pages.GoogleCloudPage;
import pages.GoogleCloudProductCanculator;

public class GoogleCloudTest extends DriverManager {

    @Test
    public void selectItemsAndCheckCount() {
        GoogleCloudPage googleCloudPage = new GoogleCloudPage();
        GoogleCloudProductCanculator googleCloudProductCanculator = new GoogleCloudProductCanculator();
        googleCloudPage.openPage();
        googleCloudPage.openPricingMenu();
        googleCloudPage.openCanculatingLink();
        googleCloudProductCanculator.switchToFrame()
                .fillNumberField("4")
                .fillItemField("Compute Engine");
    }
}
