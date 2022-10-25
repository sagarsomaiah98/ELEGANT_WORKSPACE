import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\Features\\Outline.feature",glue = {"StepDefintions"})
public class ScenarioOutlineTest {

}
