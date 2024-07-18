package runner5;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\AlphabinCompanyAssignment\\src\\test\\resources\\files5\\verifyrecently.feature",
	    glue = "steps5"
		)

public class VerifyRecentlyRunner5 extends AbstractTestNGCucumberTests{

}
