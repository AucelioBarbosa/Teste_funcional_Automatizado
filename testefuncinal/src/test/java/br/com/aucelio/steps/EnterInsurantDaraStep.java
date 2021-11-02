package br.com.aucelio.steps;

import br.com.aucelio.pages.EnterInsurantDaraPage;
import br.com.aucelio.util.Driver;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class EnterInsurantDaraStep extends Driver {
	
	private EnterInsurantDaraPage enterInsurantDaraPage;
	
	
	@Dado("informe o nome {string}")
	public void informeONome(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.preencherCampoNome(string);
	}

	@Quando("informe o sobre nome {string}")
	public void informeOSobreNome(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.preecherCampoSobreNome(string);
	}

	@Quando("informe sua data de nascimento {string}")
	public void informeSuaDataDeNascimento(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.preencherCampoDataNascimento(string);
	}

	@Quando("selecione seu genro {string}")
	public void selecioneSeuGenroMale(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.selecionarSexo(string);
		
	}

	@Quando("informe o seu endereco {string}")
	public void informeOSeuEndereO(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.preecherCampoEndereco(string);
	}

	@Quando("informe o pais {string}")
	public void informeOPais(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.selecionarPais(string);
	}

	@Quando("informe o codigo postal {string}")
	public void informeOCodigoPostal(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.preecherCampoCodigoPostal(string);
	}

	@Quando("informe a cidade {string}")
	public void informeACidade(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.preecherCampoCidade(string);
	}

	@Quando("selecionar a ocupacao {string}")
	public void selecionarAOcupaAo(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.selecionarOcupacao(string);	
	}

	@Quando("selecinar o hobbies {string}")
	public void selecinarOHobbies(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.selecionarHobbies(string);
	}

	@Quando("informar a website {string}")
	public void informarAWebsite(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.preecherWebSite(string);
	}

	@Entao("click no botao {string}")
	public void clickNoBotao(String string) {
		enterInsurantDaraPage = new EnterInsurantDaraPage(driver);
		enterInsurantDaraPage.clickBotao(string);
	}

}
