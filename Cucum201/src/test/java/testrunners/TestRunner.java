package testrunners;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions (
		features = {"src/test/java/Appfeatures"},
				glue= {"stepdefinitions"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{
}
