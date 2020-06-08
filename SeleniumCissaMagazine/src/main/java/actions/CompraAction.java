package actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CompraPage;


public class CompraAction extends CompraPage{	
	
	WebDriverWait wait;
	
	public CompraAction(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);		
		
	}
	
			
	public void realizarPesquisa(String valor) {		
		wait.until(ExpectedConditions.visibilityOf(txtBusca)).sendKeys(valor);
		txtBusca.sendKeys(Keys.ENTER);		
	}
		
	public void  selecionarProduto() {
		wait.until(ExpectedConditions.visibilityOf(linkProduto)).click();				
	}
	
	public void  adicionarCarrinho() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(btComprar)).click();	
		
		for (int i =0; i < 2; i++) {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(btQtde)).click();	
		}
		
	}
	
	public void  realizarPagamento() throws Exception {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(btPagamento)).click();	
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys("j_mafra@hotmail.com");
		wait.until(ExpectedConditions.visibilityOf(txtSenha)).sendKeys("fltorres23");
		wait.until(ExpectedConditions.visibilityOf(btFazerLogin)).click();
	}
	
	public void validarLogo() {
		wait.until(ExpectedConditions.visibilityOf(txtBusca));
	}


}

