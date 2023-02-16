package packageForTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "scr/test/java/CucumberFeatures", glue = "StepDefenition")
public class TestRunner {

}
