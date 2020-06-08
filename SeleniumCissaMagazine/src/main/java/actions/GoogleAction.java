package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GooglePage;


public class GoogleAction extends GooglePage{	
	
	WebDriverWait wait;
	
	public GoogleAction(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);		
		
	}
		
	public void realizarPesquisa(String valor) {	
		wait.until(ExpectedConditions.visibilityOf(txtBusca)).sendKeys(valor);
		txtBusca.sendKeys(Keys.ENTER);		
	}
	
	
	public void  abrirSite() {
		for(WebElement link: itensDiv.findElements(By.tagName("h3"))) {
				
			if(link.getText().contains("Cissa Magazine: November Black 2019")) {				
				link.click();
				break;
			}			
		}	  			
	}


}

