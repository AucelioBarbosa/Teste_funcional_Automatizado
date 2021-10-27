package br.com.aucelio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterVehicleDataPage {

	WebDriver driver;
	
	private By veiculo = By.id("nav_automobile");
	private By campoMontadora = By.id("make");
	private By potencia = By.id("engineperformance");
	private By anoFabricacao = By.id("dateofmanufacture");
	private By qtdPassageiros = By.id("numberofseats");

	public EnterVehicleDataPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void abrirOpçãoVeiculo() {
		driver.findElement(this.veiculo).click();
	}
	
	
	public void selecionarVeiculo(String make) {
	WebElement dropdow = driver.findElement(campoMontadora);	
	dropdow.findElement(ByXPath.xpath("//option[. = '" + make + "']")).click();
		
	}
	
	public void preecherCampoPotencia(String potencia) {
		driver.findElement(this.potencia).sendKeys(potencia);
	}
	
	public void preecherCampoAnoFabricacao(String ano) {
		driver.findElement(this.anoFabricacao).click();
		driver.findElement(this.anoFabricacao).sendKeys(ano);
	}
	
	public void preecherCampoQtdPassageiros(Integer qtd) {
		WebElement dropdown = driver.findElement(this.qtdPassageiros);
		dropdown.findElement(By.xpath("//option[. = '" + qtd + "']")).click();
	}
	
}
