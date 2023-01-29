package com.example.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"classpath:resources/Google.feature"},
		glue= {"com.example.stepdefs"}
		)
public class Testrunner {

}
