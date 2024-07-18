package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\AlphabinCompanyAssignment\\src\\test\\resources\\files1\\searchfiltering.feature",
	    glue = "steps1"
		)

public class SearchFilteringRunner1 extends AbstractTestNGCucumberTests {

}
