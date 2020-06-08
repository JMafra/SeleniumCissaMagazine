package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class GooglePage {	
	
	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="q" )
	protected WebElement txtBusca;	
	
	@FindBy(how=How.NAME, using="btnK" )
	protected WebElement btPesquisa;	
	
	@FindBy(how=How.XPATH, using="//h3[@class='LC20lb'][contains(.,'Cissa Magazine: November Black 2019')]" )
	protected WebElement linkSite;	
	
	@FindBy(how=How.XPATH, using="//div[@id='search']" )
	protected WebElement itensDiv;	

}
