package Runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
            features = "src/test/resources/inventory.feature",
            glue = {"Steps"},
            tags = {"@AfterAll, @BeforeAll, @Regression, @After"}
)
public class RunInventory {

}
