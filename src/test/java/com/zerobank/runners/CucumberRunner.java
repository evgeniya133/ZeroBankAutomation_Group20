package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "pretty",
                "timeline:target/timeline-report"
        },

        features = "src/test/resources",
        glue = "com/zerobank/step_definitions",
        dryRun = false,

        tags = "@account_dropdown_options",

        publish = true


)
public class CucumberRunner {
}
