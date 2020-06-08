package actions;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CadastroPage;


public class CadastroAction extends CadastroPage{	
	
	WebDriverWait wait;
	
	public CadastroAction(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);		
		
	}	
	
	public void validarPaginaPrincipal() {
		wait.until(ExpectedConditions.visibilityOf(lblVisitante));
		assertTrue(lblVisitante.getText().equals("Olá, visitante!"));
	}
	
	
	public void  abrirTelaUsuarioNaoCadastro() {
		wait.until(ExpectedConditions.visibilityOf(linkCadastro)).click();				
	}
	
	public void  informarEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);	
		wait.until(ExpectedConditions.visibilityOf(btCadastro)).click();			
	}
	
	
	public void  preencherCampos() throws Exception {	
		
		
		Select comboDia  = new Select(wait.until(ExpectedConditions.elementToBeClickable(cbDiaAniversario)));	
		Select comboMes  = new Select(wait.until(ExpectedConditions.elementToBeClickable(cbMesAniversario)));	
		Select comboAno  = new Select(wait.until(ExpectedConditions.elementToBeClickable(cbAnoAniversario)));	
		
		
		wait.until(ExpectedConditions.visibilityOf(radioJuridica)).click();		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(radioFisica)).click();	
		wait.until(ExpectedConditions.visibilityOf(txtNomeCompleto)).sendKeys("Juliana Mafra");		
		Select comboSexo = new Select(wait.until(ExpectedConditions.elementToBeClickable(cbSexo)));	
		comboSexo.selectByVisibleText("Feminino");
		wait.until(ExpectedConditions.visibilityOf(txtCPF)).sendKeys("99668149068");			
		comboDia.selectByVisibleText("6");
		comboMes.selectByVisibleText("Mai");
		comboAno.selectByVisibleText("1984");
		wait.until(ExpectedConditions.visibilityOf(txtTelefonePrincipal)).sendKeys("9999999999");	
		wait.until(ExpectedConditions.visibilityOf(txtTelefoneSecundario)).sendKeys("8888888888");
		wait.until(ExpectedConditions.visibilityOf(txtSenha)).sendKeys("fltorres23");	
		wait.until(ExpectedConditions.visibilityOf(txtSenhaConfirmacao)).sendKeys("fltorres23");	
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(checkNovidades)).click();	
		wait.until(ExpectedConditions.visibilityOf(linkLogo)).click();	
	}


}

