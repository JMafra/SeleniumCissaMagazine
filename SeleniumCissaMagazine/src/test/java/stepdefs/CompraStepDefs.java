package stepdefs;


import actions.CompraAction;
import io.cucumber.java.en.*;
import utils.InstanciarWebDriver;

public class CompraStepDefs {		
	
	
	CompraAction cissa;
	
	public CompraStepDefs() {
		InstanciarWebDriver.getDriver();
		cissa = new CompraAction(InstanciarWebDriver.getDriver());		
	}
   	
	
	@Given("estou na tela principal do site")
	public void estou_na_tela_principal_do_site() throws Exception {			
		cissa.validarLogo();
	}
	
	@And("realizo uma pesquisa por um produto")
	public void realizo_uma_pesquisa_por_um_produto() throws Exception {
		cissa.realizarPesquisa("Headset");	
		Thread.sleep(3000);
	}	
	
	@Then("seleciono um produto da lista")
	public void seleciono_um_produto_da_lista() {
		cissa.selecionarProduto();	
	}	
	
	@Given("que adiciono o produto ao carrinho")
	public void que_adiciono_o_produto_ao_carrinho() {
		try {
			cissa.adicionarCarrinho();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	
	@And("informo condicoes de pagamento")
	public void informo_condicoes_de_pagamento() {
		try {
			cissa.realizarPagamento();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	
	@Then("confirmo realizacao da compra")
	public void confirmo_realizacao_da_compra() throws Exception {		
		// Validação de finalização da compra não implementado devido ao CAPCHA.
		Thread.sleep(5000);
		InstanciarWebDriver.destroyInstanciarWebDriver();
	}	

}
