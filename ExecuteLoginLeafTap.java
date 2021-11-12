package cucumber_ExecutionClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*@CucumberOptions(features="src/test/java/features/CreateLead.feature",
							glue="steps",monochrome=true,publish=true)*/
@CucumberOptions(features = "src/test/java/leafTap_features/", 
				glue = "cucumber_testcases", 
				monochrome = true, 
				publish = true,
				//tags = "@smoke" //runs all smoke test scenarios
				//tags = "@regression" //runs all regression scenarios
				//tags = "not @regression" //except regression scenarios it runs all other test scenarios
				//tags = "@functional or @regression" //runs all the functional or regression test cases
				//tags = "@functional and @regression" //runs test scenarios with ONLY @functional and @regression tags
				//tags = "@<functionality name>" //it runs the feature files with project or functionality specific tags
				tags = "@createLead"
		)
public class ExecuteLoginLeafTap extends AbstractTestNGCucumberTests {

}
