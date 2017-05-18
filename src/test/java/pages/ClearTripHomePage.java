package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebElement;


/**
 * Created by abiswal on 5/18/17.
 */
@DefaultUrl("http://cleartrip.com")
public class ClearTripHomePage extends PageObject {

    @FindBy(linkText="Flights")
    WebElement flightSelection;


    @FindBy(tagName="h1")
    WebElementFacade headerText;

    public String getTextFromTheHeader() {
        headerText.isDisplayed();
        String text= headerText.getText();
        return text;
    }
    public void clickOnFlightLink(){
        flightSelection.click();


    }
}