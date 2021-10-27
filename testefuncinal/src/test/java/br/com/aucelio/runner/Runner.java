package br.com.aucelio.runner;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.aucelio.steps.EnterInsurantDaraStep;
import br.com.aucelio.steps.EnterVehicleDataSteps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/features/seguro_veiculo.feature",
		glue = "br.com.aucelio.steps",
		plugin = "pretty",
		tags = {"~@ignore"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class Runner {
	


}
