package br.com.aucelio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterVehicleDataPage {

	protected WebDriver driver;
	private By veiculo = By.id("nav_automobile");
	private By campoMontadora = By.id("make");
	private By potencia = By.id("engineperformance");
	private By anoFabricacao = By.id("dateofmanufacture");
	private By qtdPassageiros = By.id("numberofseats");
	private By precoTabela = By.id("listprice");
	private By tipoCombutivel = By.id("fuel");
	private By numeroLicenca = By.id("licenseplatenumber");
	private By qtdMilia = By.id("annualmileage");
	private By btnNext = By.id("nextenterinsurantdata");

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

	public void selecionarQtdPassageiros(Integer qtd) {
		WebElement dropdown = driver.findElement(this.qtdPassageiros);
		dropdown.findElement(By.xpath("//option[. = '" + qtd + "']")).click();
	}

	public void selecionarTipoCombustivel(String cobustivel) {
		WebElement dropdown = driver.findElement(this.tipoCombutivel);
		dropdown.findElement(By.xpath("//option[. = '" + cobustivel + "']")).click();
	}

	public void preecherCampoPrecoTabela(Integer valor) {
		driver.findElement(this.precoTabela).sendKeys("" + valor + "");
	}
	
	public void preecherCampoNumeroLicenca(String licenca) {
		driver.findElement(this.numeroLicenca).sendKeys(licenca);
	}
	
	public void preecherCampoQtdMilia(String milia) {
		driver.findElement(this.qtdMilia).sendKeys(milia);
	}
	public void clicarNoBotao(String btn) {
		driver.findElement(btnNext).click();

	}

}
