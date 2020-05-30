package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}
,glue= {"stepdefinations"}
,plugin= {"pretty","html:target/cucumber"})
public class Runtest {

}
