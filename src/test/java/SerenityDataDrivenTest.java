import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.junit.annotations.TestData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by abiswal on 5/17/17.  this is to show data driven
 */
@RunWith(SerenityParameterizedRunner.class)
public class SerenityDataDrivenTest {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final String link_name;

    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"Flights"},
                {"Hotels"},
                {"Flight + Hotel"},
                {"Trains"}
        });
    }

    public SerenityDataDrivenTest(String link_name) {
        this.link_name = link_name;
    }

    @Test
    public void serenityDataDrivenTest() throws InterruptedException {
        WebElement element;
        driver.get("http://cleartrip.com");
        driver.findElement(By.linkText(link_name)).click();
        element= driver.findElement(By.tagName("h1"));
        Assert.assertTrue(element.getText().contains(link_name.toLowerCase()));
    }


}
