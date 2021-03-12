package runners.Categoria;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/categoria.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class CategoriaRunner {
}
