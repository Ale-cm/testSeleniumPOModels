package TestATM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import Page_ATM.Page_MerLib_Home;

public class TestExec1 {
		
	public static void main(String args[]) throws InterruptedException {
		String selecCapcha="C:\\Automatizacion\\imagenes\\mercadoLibre.sikuli\\capcha.png";
		
		Page_MerLib_Home phome= new Page_MerLib_Home();
		Screen src = new Screen();
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mercadolibre.com.ar/registration?confirmation_url=https%3A%2F%2Fwww.mercadolibre.com.ar%2Fregistration%3Fconfirmation_url%3Dhttps%253A%252F%252Fwww.mercadolibre.com.ar%252F%26rtx%3D37bcaf18-c67f-4f96-89ca-5be2a2414973#nav-header");
		
		
		phome.iniciarDriver(driver);
		phome.MaxPantalla(driver);
		phome.EscribeNombre("florindio");
		phome.EscribeApellido("anastacio");
		phome.EscribeDni("23232323");
		phome.EscribeEmail("guaw@outlok.com");
		phome.EscribeClave("1223232");
		phome.SelecCapcha(src, selecCapcha);
		Thread.sleep(4000);
		phome.FinalizarDriver(driver);
	}
}
