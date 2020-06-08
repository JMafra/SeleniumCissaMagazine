package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/features",
        glue = {"stepdefs"},
        tags = {"@Google,@Cadastro,@Compra"},
        plugin = {"pretty"},
        monochrome = true)
public class Runner {

}
