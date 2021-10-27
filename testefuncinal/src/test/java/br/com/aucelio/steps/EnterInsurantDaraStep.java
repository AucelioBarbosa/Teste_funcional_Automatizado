package br.com.aucelio.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class EnterInsurantDaraStep {
	
	
	WebDriver driver;
	
	
	@Dado("que o formulario, aba enter Insurant Data")
	public void queOFormularioAbaEnterInsurantData() {
	   
	}

	@Quando("informe o nome {string}")
	public void informeONome(String string) {
		driver.findElement(By.id("firstname")).click();
		driver.findElement(By.id("firstname")).sendKeys(string);
	}

	@Quando("informe o sobre nome {string}")
	public void informeOSobreNome(String string) {
		driver.findElement(By.id("lastname")).click();
		driver.findElement(By.id(string)).click();
	}

	@Quando("infome sua data de nascimento {int}\\/{int}\\/{int}")
	public void infomeSuaDataDeNascimento(Integer int1, Integer int2, Integer int3) {
		driver.findElement(By.id("birthdate")).sendKeys("" + int1 + "/" + int2 + "/" + int3 + "");
	}

	@Quando("selecione seu genro Male")
	public void selecioneSeuGenroMale() {
		driver.findElement(By.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(1) > .ideal-radio"))
				.click();
	}

	@Quando("informe o seu endereco {string} {int}")
	public void informeOSeuEndereO(String string, Integer int1) {
		driver.findElement(By.id("streetaddress")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("" + string + " " + int1 + "");
	}

	@Quando("informe o pais {string}")
	public void informeOPais(String string) {
		WebElement dropdown = driver.findElement(By.id("country"));
		dropdown.findElement(By.xpath("//option[. = '" + string + "']")).click();

	}

	@Quando("informe o codigo postal {int}")
	public void informeOCodigoPostal(Integer int1) {
		driver.findElement(By.id("zipcode")).click();
		driver.findElement(By.id("zipcode")).sendKeys("" + int1 + "");
	}

	@Quando("informe a cidade {string}")
	public void informeACidade(String string) {
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("Brasilia");
	}

	@Quando("selecionar a ocupacao {string}")
	public void selecionarAOcupaAo(String string) {
		driver.findElement(By.id("occupation")).click();
		WebElement dropdown = driver.findElement(By.id("occupation"));
		dropdown.findElement(By.xpath("//option[. = '"+string+"']")).click();
	}

	@Quando("selecinar o hobbies {string}")
	public void selecinarOHobbies(String string) {
		driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check")).click();
	}

	@Quando("infomar a website {string}")
	public void infomarAWebsite(String string) {
		driver.findElement(By.id("website")).click();
		driver.findElement(By.id("website")).sendKeys(string);
	}

}
