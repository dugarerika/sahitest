package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   features = "src/test/resources/features/Inventory.feature",
        glue = "Steps",
        publish = true
//                    plugin = { "pretty"}
//                    monochrome = true
)

public class RunInventory {

}