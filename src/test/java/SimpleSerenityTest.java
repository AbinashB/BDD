import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by abiswal on 5/17/17.  this is simple test for using annotation
 */

@RunWith(SerenityRunner.class)
public class SimpleSerenityTest {

    @Managed(driver = "chrome")
    WebDriver driver;


    @Test
    public void simpleSerenityTest() throws InterruptedException {
        WebElement element;
        String link_name="Flights";
        driver.get("http://cleartrip.com");
        driver.findElement(By.linkText(link_name)).click();
        element= driver.findElement(By.tagName("h1"));
        Assert.assertTrue(element.getText().contains(link_name.toLowerCase()));
    }


}
