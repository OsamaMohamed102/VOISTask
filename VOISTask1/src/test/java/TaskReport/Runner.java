package TaskReport;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/main/resources/features",
        glue ="TaskStepsdefintions",
        tags ="@Valid",
        plugin ={"pretty","html:target/cucmber report.html"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
