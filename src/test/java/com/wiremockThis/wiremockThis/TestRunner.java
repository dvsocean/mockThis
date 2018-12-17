package com.wiremockThis.wiremockThis;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/danikasRezultati.html",}, features = {"src/test/resources"})
public class TestRunner {

}
