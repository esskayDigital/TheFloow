
package StepDefs;

        import org.junit.runner.RunWith;
        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHtmlReport"},
        //pretty:target/cucumber-json-report.json
        features = "src/test/resources/features/document"
)

public class RunCukeTest {
}

