package run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/ihalder/eclipse-workspace/BDD_Framework/login.feature"},
tags = {"@Regretion"}, glue = {"com"}, plugin = {"pretty:html/reportfile.html"})


public class RunnerClass {

}
