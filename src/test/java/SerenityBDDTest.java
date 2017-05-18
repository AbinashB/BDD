import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by abiswal on 5/17/17.  this is simple test for using annotation
 */

@RunWith(SerenityRunner.class)
public class SerenityBDDTest extends RunnerClassTest {

    WebElement element;
    String link_name="Flights";

    @Given("The app is launched")
    public void given(){
        driver.get("http://cleartrip.com");
    }

    @When("User clicked on the link")
    public void when(){
        driver.findElement(By.linkText(link_name)).click();
    }


    @Then("Text on the header should be dispayed")
    public void then(){
        element= driver.findElement(By.tagName("h1"));
        Assert.assertTrue(element.getText().contains(link_name.toLowerCase()));
    }

    @Test
    public void serenityBDDTest() throws InterruptedException {
        given();
        when();
        then();
    }
}

