package br.com.aucelio.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.aucelio.pages.EnterVehicleDataPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class EnterVehicleDataSteps {

	WebDriver driver;
	EnterVehicleDataPage enterVehicleDataPage;

	@Dado("que acesse no site {string}")
	public void queAcesseNoSite(String string) {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/webdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(string);
		driver.manage().window().maximize();

	}

	@Dado("que o formulario, aba enter  Automobile")
	public void queOFormularioAbaEnterAutomobile() throws InterruptedException {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.abrirOpçãoVeiculo();
		Thread.sleep(2000);
	}

	@Dado("selecione a marca do veiculo {string}")
	public void selecioneAMarcaDoVeiculo(String string) {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.selecionarVeiculo(string);
	}

	@Dado("preencha o campoa pontenica {string}")
	public void preenchaOCampoaPontenica(String string) {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.preecherCampoPotencia(string);
	}

	@Dado("infrome o ano de fabircacao {string}")
	public void infromeOAnoDeFabircacao(String ano) {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.preecherCampoAnoFabricacao(ano);
	}

	@Dado("infrome a quantidade de passageiros {int}")
	public void infromeAQuantidadeDePassageiros(Integer qtd) {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.selecionarQtdPassageiros(qtd);
		
	}

	@Dado("selecione o timpo do combustivel {string}")
	public void selecioneOTimpoDoCombustivel(String string) {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.selecionarTipoCombustivel(string);

	}

	@Dado("informe o preco de tabela {int}")
	public void informeOPrecoDeTabela(Integer int1) {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.preecherCampoPrecoTabela(int1);
	}

	@Dado("o numero da licenca {string}")
	public void oNumeroDaLicenca(String string) {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.preecherCampoNumeroLicenca(string);
	}

	@Dado("a quantas em milhas ano {string}")
	public void aQuantasEmMilhasAno(String string) throws InterruptedException {
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterVehicleDataPage.preecherCampoQtdMilia(string);
	}

	@Entao("pressione o botao {string}")
	public void pressioneOBotao(String string) {
		driver.findElement(By.id("nextenterinsurantdata")).click();	
	}

}
