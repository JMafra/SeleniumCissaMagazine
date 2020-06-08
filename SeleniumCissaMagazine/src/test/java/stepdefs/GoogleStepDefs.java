package stepdefs;


import actions.GoogleAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.InstanciarWebDriver;

public class GoogleStepDefs {		
	
	
	GoogleAction busca;
	
	public GoogleStepDefs() {
		InstanciarWebDriver.getDriver();
		busca = new GoogleAction(InstanciarWebDriver.getDriver());		
	}
   
	@Given("eu abro o navegador")
	public void eu_abro_o_navegador() {
		InstanciarWebDriver.getDriver();
		busca = new GoogleAction(InstanciarWebDriver.getDriver());
	}
	
	@And("acesso o site {string}")
	public void acesso_o_site(String url) {
		InstanciarWebDriver.getDriver().get(url);		
	}
	
	@And("realizo uma pesquisa por um site")
	public void realizo_uma_pesquisa_por_um_site() throws Exception {
		busca.realizarPesquisa("cissa magazine");	 
		busca.abrirSite();
	}	
	

}
