package com.github.backenddeveloper.foritv ;

import org.junit.runner.RunWith ;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber ;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" },
glue = { "com.github.backenddeveloper.foritv.integration"})
public class TestRunner {}
