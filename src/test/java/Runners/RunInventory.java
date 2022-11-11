package Runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
            features = "src/test/resources/inventory.feature",
            glue = {"Steps"}
)

public class RunInventory {

}
