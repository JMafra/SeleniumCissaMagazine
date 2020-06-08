package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class CadastroPage {	
	
	public CadastroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(.,'Olá, visitante!')]" )
	protected WebElement lblVisitante;
	
	@FindBy(how=How.XPATH, using="//a[contains(.,'Cadastre-se')]" )
	protected WebElement linkCadastro;
	
	@FindBy(how=How.ID , using="email" )
	protected WebElement txtEmail;
	
	@FindBy(how=How.XPATH , using="//span[@class='btn-criar-cadastro'][contains(.,'Criar cadastro')]" )
	protected WebElement btCadastro;
	
	@FindBy(how=How.ID , using="fisica" )
	protected WebElement radioFisica;
	
	@FindBy(how=How.ID , using="juridica" )
	protected WebElement radioJuridica;
	
	@FindBy(how=How.ID , using="email_1" )
	protected WebElement txtEmailConfirmacao;
	
	@FindBy(how=How.ID , using="nome-completo_1" )
	protected WebElement txtNomeCompleto;
	
	@FindBy(how=How.ID , using="sexo_1" )
	protected WebElement cbSexo;
	
	@FindBy(how=How.ID , using="cpf_1" )
	protected WebElement txtCPF;
	
	@FindBy(how=How.ID , using="datanasc-dia_1" )
	protected WebElement cbDiaAniversario;	

	@FindBy(how=How.ID , using="datanasc-mes_1" )
	protected WebElement cbMesAniversario;
	
	@FindBy(how=How.ID , using="datanasc-ano_1" )
	protected WebElement cbAnoAniversario;	

	@FindBy(how=How.NAME , using="telefone" )
	protected WebElement txtTelefonePrincipal;

	@FindBy(how=How.NAME , using="celular" )
	protected WebElement txtTelefoneSecundario;

	@FindBy(how=How.ID , using="senha_1" )
	protected WebElement txtSenha;

	@FindBy(how=How.ID , using="senha_2" )
	protected WebElement txtSenhaConfirmacao;

	@FindBy(how=How.ID , using="receber-ofertas_1" )
	protected WebElement checkNovidades;

	@FindBy(how=How.XPATH , using="(//button[contains(.,'Finalizar Cadastro')])[1]" )
	protected WebElement btFinalizarCadastro;
	
	@FindBy(how=How.ID , using="logo" )
	protected WebElement linkLogo;	

}
