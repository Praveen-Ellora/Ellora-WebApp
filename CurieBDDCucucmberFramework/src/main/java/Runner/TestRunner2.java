package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="P:/Praveen/CurieBDDCucucmberFramework/src/main/java/CurieBDDLogin/BDDLogin2.feature",
glue={"StepDefinitions"},
format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
dryRun=false,
monochrome=true)


public class TestRunner2 {

}
