package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions (features = "src/test/resources/features/academyChoucair.feature",
        tags = "@stories",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE )
@RunWith(CucumberWithSerenity.class)
public class RunnerTags {
}
