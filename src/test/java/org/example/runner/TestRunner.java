package org.example.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/org/example/feature"},
        glue = {"org.example.steps"}
//        glue = "src/test/java/org/example/steps"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}


