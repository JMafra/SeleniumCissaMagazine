package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class CompraPage {	
	
	public CompraPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[contains(@name,'q')]" )
	protected WebElement txtBusca;
	
	@FindBy(how=How.XPATH, using="//span[contains(.,'Headset Logitech H390 USB 2.0 em Couro Preto')]")
    protected WebElement linkProduto;	
	
	@FindBy(how=How.XPATH, using= "//button[@onclick='addCartsCompreJunto();']")
	protected WebElement btComprar;	
	
	@FindBy(how = How.XPATH, using="//button[@class='add-item']")
	protected WebElement btQtde;
	
	@FindBy(how = How.XPATH, using="//button[contains(.,'Ir para o pagamento')]")
	protected WebElement btPagamento;
	
	@FindBy(how = How.ID, using="login_1")  
	protected WebElement txtEmail;
	
	@FindBy(how=How.ID, using="pass_1")
	protected WebElement txtSenha;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit'][contains(.,'Fazer login')]")
	protected WebElement btFazerLogin; 	
	

}
