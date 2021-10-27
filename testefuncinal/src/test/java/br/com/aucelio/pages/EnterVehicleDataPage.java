package br.com.aucelio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterVehicleDataPage {

	WebDriver driver;
	
	private By veiculo = By.id("nav_automobile");

	public EnterVehicleDataPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void abrirOp��oVeiculo() {
		driver.findElement(veiculo).click();
	}
}
