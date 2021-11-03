package br.com.aucelio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterProductDataPage {

	private WebDriver driver;

	private By data = By.id("startdate");

	public EnterProductDataPage(WebDriver driver) {
		this.driver = driver;
	}

	public void preecherCampoData(String data) {
		driver.findElement(this.data).sendKeys(data);
	}

	public void selecionarValorSeguro(String valor) {
		WebElement dropdown = driver.findElement(By.id("insurancesum"));
		dropdown.findElement(By.xpath("//option[. = '" + valor + "']")).click();
	}

	public void selecionarValorResgate(String resgate) {
		WebElement dropdown = driver.findElement(By.id("meritrating"));
		dropdown.findElement(By.xpath("//option[. = '" + resgate + "']")).click();
	}

	public void selecionarSeguroDatanos(String danos) {
		WebElement dropdown = driver.findElement(By.id("damageinsurance"));
		dropdown.findElement(By.xpath("//option[. = '" + danos + "']")).click();
	}

	public void selecionarOpProduto(String opProduto) {
		driver.findElement(By.id("enterproductdata")).click();
		if (opProduto.equals("Euro Protection")) {
			driver.findElement(
					By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
		} else {
			driver.findElement(
					By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(2) > .ideal-check")).click();
		}
	}

	public void selecionarCarroCortesia(String cortesia) {
		driver.findElement(By.id("courtesycar")).click();
		WebElement dropdown = driver.findElement(By.id("courtesycar"));
		dropdown.findElement(By.xpath(".//[@id='Courtesy Car'] . //option[. = 'Yes']")).click();
		
	}

}
