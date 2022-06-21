package personal.accidents.insurance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PersonalAccidentsInsurance_Test {
	
	private WebDriver driver;
	PersonalAccidentsInsurancePage personalAccidentsInsurancePage;
	
	@Before
	public void setUp() throws Exception {
		personalAccidentsInsurancePage = new PersonalAccidentsInsurancePage(driver);
		driver = personalAccidentsInsurancePage.chromeDriverConnection();
		personalAccidentsInsurancePage.visit("https://dev-web.segurosbolivar.com/seguros-en-linea/seguro-de-accidentes-personales");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		
	}

}
