package org.example.runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions( features = "src/test/resources/feature", glue = "org.example" )

public class TestRunner extends AbstractTestNGCucumberTests{
}


