package runner4;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\AlphabinCompanyAssignment\\src\\test\\resources\\files4\\selectrandom.feature",
	    glue = "steps4"
		)
public class SelectRandomRunner4 extends AbstractTestNGCucumberTests{

}
