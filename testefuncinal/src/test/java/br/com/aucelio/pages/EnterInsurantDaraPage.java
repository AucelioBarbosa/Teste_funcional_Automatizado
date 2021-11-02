package br.com.aucelio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterInsurantDaraPage {

	WebDriver driver;
	private By campoPrimeiroNome = By.id("firstname");
	private By campoSobreNome = By.id("lastname");
	private By campoDataNascimento = By.id("birthdate");
	private By selecioSexoM = By
			.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(1) > .ideal-radio");
	private By selecioSexoF = By
			.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(2) > .ideal-radio");
	private By endereco = By.id("streetaddress");
	private By codigoPostal = By.id("zipcode");
	private By cidade = By.id("city"); 
	private By hobbies = By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check");
	private By web = By.id("website");
	private By btnClick = By.id("nextenterproductdata");

	public EnterInsurantDaraPage(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherCampoNome(String pNome) {
		driver.findElement(this.campoPrimeiroNome).sendKeys(pNome);
	}

	public void preecherCampoSobreNome(String sNome) {
		driver.findElement(this.campoSobreNome).sendKeys(sNome);
	}

	public void preencherCampoDataNascimento(String data) {
		driver.findElement(this.campoDataNascimento).sendKeys(data);
	}

	public void selecionarSexo(String sexo) {
		WebElement elemet = driver.findElement(By.id("gendermale"));
		String sex = elemet.getAttribute("value");
		if (sexo.equals(sex)) {
			driver.findElement(this.selecioSexoM).click();
		} else {
			driver.findElement(this.selecioSexoF).click();
		}
	}

	public void preecherCampoEndereco(String endereco) {
		driver.findElement(this.endereco).sendKeys(endereco);
	}

	public void selecionarPais(String pais) {
		WebElement dropdown = driver.findElement(By.id("country"));
		dropdown.findElement(By.xpath("//option[. = '" + pais + "']")).click();
		
	}
	
	public void preecherCampoCodigoPostal(String codPostal) {
		driver.findElement(this.codigoPostal).sendKeys(codPostal);
	}
	
	public void preecherCampoCidade(String codPostal) {
		driver.findElement(this.cidade).sendKeys(codPostal);
	}
	
	public void selecionarOcupacao(String cidade) {
		WebElement dropdown = driver.findElement(By.id("occupation"));
		dropdown.findElement(By.xpath("//option[. = '" + cidade + "']")).click();
	}
	
	public void selecionarHobbies(String hob){
		driver.findElement(this.hobbies).click();
	}
	
	public void preecherWebSite(String website) {
		driver.findElement(this.web).sendKeys(website);
	}
	
	public void clickBotao(String click) {
		driver.findElement(btnClick).click();
	}
}
