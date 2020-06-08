package stepdefs;


import actions.CadastroAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.InstanciarWebDriver;

public class CadastroStepDefs {		
	
	
	CadastroAction cadastro;
	
	public CadastroStepDefs() {		
		InstanciarWebDriver.getDriver();
	  	cadastro = new CadastroAction(InstanciarWebDriver.getDriver());		
	}
   
	@Given("que estou na tela principal do site")
	public void que_estou_na_tela_principal_do_site() {
	   cadastro.validarPaginaPrincipal();
	}
	
	@And("sou um novo cliente")
	public void sou_um_novo_cliente() {
		cadastro.abrirTelaUsuarioNaoCadastro();
		cadastro.informarEmail("jmafra@gmail.com");
	}
	
	@Then("realizo cadastro de uma nova conta")
	public void realizo_cadastro_de_uma_nova_conta()  {
		try {
			cadastro.preencherCampos();
		} catch (Exception e) {			
			e.printStackTrace();
		}	 		
	}	
	

}
