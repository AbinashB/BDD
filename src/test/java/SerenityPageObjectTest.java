import cucumber.api.java.en.Given;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ClearTripHomePage;

/**
 * Created by abiswal on 5/17/17.  this is simple test for using annotation
 */

@RunWith(SerenityRunner.class)
public class SerenityPageObjectTest {

    @Managed(driver = "chrome")
    WebDriver driver;


    ClearTripHomePage homepage;

    @Test
    public void serenityPageObjectTest() throws InterruptedException {
        String headertext;
        String link_name="Flight";
        homepage.open();
        homepage.clickOnFlightLink();
        headertext=homepage.getTextFromTheHeader();
        Assert.assertTrue(headertext.contains(link_name.toLowerCase()));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
