package br.com.aucelio.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class EnterVehicleDataSteps {
	
	WebDriver driver;
	

	@Dado("que acesse no site {string}")
	public void queAcesseNoSite(String string) {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/webdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(string);
		driver.manage().window().maximize();
	
	}

	@Dado("que o formulario, aba enter  Automobile")
	public void queOFormularioAbaEnterAutomobile() throws InterruptedException {
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(2000);

	}

	@Dado("selecione a marca do veiculo {string}")
	public void selecioneAMarcaDoVeiculo(String string) {

		WebElement dropdown = driver.findElement(By.id("make"));
		dropdown.findElement(By.xpath("//option[. = '" + string + "']")).click();
	}

	@Dado("preencha o campoa pontenica {double}")
	public void preenchaOCampoaPontenica(Double double1) {
		driver.findElement(By.id("engineperformance")).click();
		driver.findElement(By.id("engineperformance")).sendKeys("" + double1 + "");
	}

	@Dado("infrome o ano de fabircacao {int}\\/{int}\\/{int}")
	public void infromeOAnoDeFabircacao(Integer int1, Integer int2, Integer int3) {
		driver.findElement(By.id("dateofmanufacture")).click();
		driver.findElement(By.id("dateofmanufacture")).sendKeys("" + int1 + "/" + int2 + "/" + int3 + "");

	}

	@Dado("infrome a quantidade de passageiros {int}")
	public void infromeAQuantidadeDePassageiros(Integer int1) {
		WebElement dropdown = driver.findElement(By.id("numberofseats"));
		dropdown.findElement(By.xpath("//option[. = '" + int1 + "']")).click();
	}

	@Dado("selecione o timpo do combustivel {string}")
	public void selecioneOTimpoDoCombustivel(String string) {
		driver.findElement(By.id("fuel")).click();
		WebElement dropdown = driver.findElement(By.id("fuel"));
		dropdown.findElement(By.xpath("//option[. = '" + string + "']")).click();

	}

	@Dado("informe o preco de tabela {int}")
	public void informeOPrecoDeTabela(Integer int1) {
		driver.findElement(By.id("listprice")).click();
		driver.findElement(By.id("listprice")).sendKeys("" + int1 + "");
	}

	@Dado("o numero da licenca {int}")
	public void oNumeroDaLicenca(Integer int1) {
		driver.findElement(By.id("licenseplatenumber")).click();
		driver.findElement(By.id("licenseplatenumber")).sendKeys("" + int1 + "");
	}

	@Dado("a quantas em milhas ano {int}")
	public void aQuantasEmMilhasAno(Integer int1) {
		driver.findElement(By.id("annualmileage")).click();
		driver.findElement(By.id("annualmileage")).sendKeys("" + int1 + "");
	}

	@Entao("pressione o botao {string}")
	public void pressioneOBotao(String string) {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	
	
}
