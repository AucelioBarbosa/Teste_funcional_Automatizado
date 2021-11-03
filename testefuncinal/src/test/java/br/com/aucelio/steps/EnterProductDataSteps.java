package br.com.aucelio.steps;

import br.com.aucelio.pages.EnterProductDataPage;
import br.com.aucelio.util.Driver;
import io.cucumber.java.pt.Dado;

public class EnterProductDataSteps extends Driver {

	private EnterProductDataPage enterProductDataPage;

	@Dado("informar a data inicial {string}")
	public void informarADataInicial(String string) {
		enterProductDataPage = new EnterProductDataPage(driver);
		enterProductDataPage.preecherCampoData(string);
	}

	@Dado("selecionar a soma do suguro {string}")
	public void selecionarASomaDoSuguro(String string) {
		enterProductDataPage = new EnterProductDataPage(driver);
		enterProductDataPage.selecionarValorSeguro(string);
	}

	@Dado("selecionar a classificacao {string}")
	public void selecionarAClassificacaoBunos(String string) {
		enterProductDataPage = new EnterProductDataPage(driver);
		enterProductDataPage.selecionarValorResgate(string);
	}

	@Dado("selecionar o seguro contra danos {string}")
	public void selecionarOSeguroContraDanos(String string) {
		enterProductDataPage = new EnterProductDataPage(driver);
		enterProductDataPage.selecionarSeguroDatanos(string);
	}

	@Dado("produto opcional {string}")
	public void produtoOpcional(String string) {
		enterProductDataPage = new EnterProductDataPage(driver);
		enterProductDataPage.selecionarOpProduto(string);
	}

	@Dado("selecionar carro de cortesia {string}")
	public void selecionarCarroDeCortesia(String string) {
		enterProductDataPage = new EnterProductDataPage(driver);
		enterProductDataPage.selecionarCarroCortesia(string);
	}

}
