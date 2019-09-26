package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\skeleton\\login.feature",
				plugin="json:target/cucumberreport.json")
				//plugin="html:target/htmlreport")
public class Runner {

}
