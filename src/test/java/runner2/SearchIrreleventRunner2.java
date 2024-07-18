package runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\AlphabinCompanyAssignment\\src\\test\\resources\\files2\\searchirrelevant.feature",
	    glue = "steps2"
		)

public class SearchIrreleventRunner2 extends AbstractTestNGCucumberTests{

}
