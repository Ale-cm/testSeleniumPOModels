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
		    if (!driver.getTitle().equals("https://www.mercadolibre.com.ar/registration?confirmation_url=https%3A%2F%2Fwww.mercadolibre.com.ar%2Fregistration%3Fconfirmation_url%3Dhttps%253A%252F%252Fwww.mercadolibre.com.ar%252F%26rtx%3D37bcaf18-c67f-4f96-89ca-5be2a2414973#nav-header")) {
		      throw new IllegalStateException("Esta no es la pagina de crear usuario," +
		            " La pagina actual es: " + driver.getCurrentUrl());
		    }
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
