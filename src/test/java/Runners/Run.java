package Runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
            features = "src/test/resources/login.feature",
            glue = {"Steps"}
)

public class Run {

}
