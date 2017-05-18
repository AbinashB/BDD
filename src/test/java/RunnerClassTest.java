import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by abiswal on 5/18/17.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/java/features" },
        tags = {"@Smoke"})
        //plugin = {"html:/Users/dharmens/Downloads/Projects/Serenity/target/cucumber-parallel/*"})
public class RunnerClassTest {
    @Managed(driver = "chrome")
    WebDriver driver;
}
