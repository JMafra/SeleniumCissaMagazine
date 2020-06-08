@Cissa
Feature: Automacao Cissa Magazine

@Google
Scenario Outline:  Realizar Pesquisa no Google
   Given eu abro o navegador
   And acesso o site "<url>"  
   Then realizo uma pesquisa por um site 
   
Examples:
 		|			    url 	 			|
 		|http://www.google.com|

   
@Cadastro
Scenario:  Realizar Cadastro de Cliente
   Given que estou na tela principal do site
   And sou um novo cliente 
   Then realizo cadastro de uma nova conta
   
@Compra
Scenario:  Realizar Pesquisa no Cissa Magazine
   Given que estou na tela principal do site 
   And realizo uma pesquisa por um produto
   Then seleciono um produto da lista	
   
@Compra
Scenario:  Adicionar Produto ao Carrinho
  Given que adiciono o produto ao carrinho   
  And  informo condicoes de pagamento
  Then confirmo realizacao da compra


 	