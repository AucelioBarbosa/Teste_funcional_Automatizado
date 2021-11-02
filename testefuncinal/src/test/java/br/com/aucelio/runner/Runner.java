package br.com.aucelio.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/seguro_veiculo.feature",
		glue = "br.com.aucelio.steps",
		plugin = "pretty",
		tags = {"~@ignore"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = true,
		strict = true
		)
public class Runner {

}
