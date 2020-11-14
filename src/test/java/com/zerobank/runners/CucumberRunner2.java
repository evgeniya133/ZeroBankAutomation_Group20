package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber2.json",
                "pretty"
        },

        features = {
                "src/test/resources"
        },

        glue = "com/zerobank/step_definitions",
        dryRun = false,
        publish = true,
        tags = "@savings_dropdown_default"

)
public class CucumberRunner2 {
}
