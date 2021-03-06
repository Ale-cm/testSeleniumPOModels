package Page_ATM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class Page_MerLib_Home {
	 
	protected WebDriver driver; 
	protected Screen src;
	private By txt_nombre = By.id("firstName");
	private By txt_apellido = By.id("lastName");
	private By txt_dni = By.id("identification");
	private By txt_email = By.id("email");
	private By txt_clave = By.id("password");
	private String capcha= "";
	
	public void iniciarDriver(WebDriver driver) {
		 this.driver = driver;
		  
		  }

	
	public void MaxPantalla(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void EscribeEmail(String email) {
		driver.findElement(txt_email).sendKeys(email);
		
	}
	public void EscribeClave(String clave) {
		driver.findElement(txt_clave).sendKeys(clave);
		
	}
	public void EscribeNombre(String nombre) {
		driver.findElement(txt_nombre).sendKeys(nombre);
		
	}
	public void EscribeApellido(String apellido) {
		driver.findElement(txt_apellido).sendKeys(apellido);
		
	}
	public void EscribeDni(String dni) {
		driver.findElement(txt_dni).sendKeys(dni);
	}
	
	public void SelecCapcha(Screen src,String capcha) {
	try {
		src.click(capcha);
	} catch (FindFailed e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	
	public void FinalizarDriver(WebDriver driver) {
		driver.close();	
	}
}
