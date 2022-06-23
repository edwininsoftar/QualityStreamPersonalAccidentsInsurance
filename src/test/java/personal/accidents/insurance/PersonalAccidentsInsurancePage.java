package personal.accidents.insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class PersonalAccidentsInsurancePage extends BasicWrap{

	public PersonalAccidentsInsurancePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void quote() {
		try {
			Thread.sleep(10000);
			click(LocatorsPersonalAccidentsInsurance.LOCATOR_DATE);
			click(LocatorsPersonalAccidentsInsurance.LOCATOR_DATE_28);
			click(LocatorsPersonalAccidentsInsurance.LOCATOR_DATE_30);
			type(BasicData.EMAIL, LocatorsPersonalAccidentsInsurance.LOCATOR_EMAIL);
			click(LocatorsPersonalAccidentsInsurance.LOCATOR_BUTTON_QUOTE);
		} catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void sure(String Protect, String Plan, String RentDay, String Fractures) {
		try {
			Thread.sleep(10000);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			WebElement pro = driver.findElement(LocatorsPersonalAccidentsInsurance.LOCATOR_FAMILY_NUCLEUS);
			pro.clear();
			type(Protect, LocatorsPersonalAccidentsInsurance.LOCATOR_FAMILY_NUCLEUS);
			if(BasicData.BUTTON_BASIC.equals(Plan)) {
				click(LocatorsPersonalAccidentsInsurance.LOCATOR_BASIC);
			}
			if(BasicData.BUTTON_PREMIUM.equals(Plan)) {
				click(LocatorsPersonalAccidentsInsurance.LOCATOR_PREMIUM);
			}
			JavascriptExecutor js2 = ((JavascriptExecutor) driver);
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			if(BasicData.RENT_DAY_SI.equals(RentDay)) {
				click(LocatorsPersonalAccidentsInsurance.LOCATOR_RENT_DAY);
			}
			if(BasicData.FRACTURES_SI.equals(Fractures)) {
				click(LocatorsPersonalAccidentsInsurance.LOCATOR_FRACTURES);
			}
			click(LocatorsPersonalAccidentsInsurance.LOCATOR_BUTTON_CONTINUE);
		} catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void data(String TypeDocument, String Document, String Name, String LastName, String Gender) {
		try {
			Thread.sleep(8000);
			//JavascriptExecutor js = ((JavascriptExecutor) driver);
			//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			click(LocatorsPersonalAccidentsInsurance.LOCATOR_TYPE_DOCUMENT);
			if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			type(Document, LocatorsPersonalAccidentsInsurance.LOCATOR_DOCUMENT);
			type(Name, LocatorsPersonalAccidentsInsurance.LOCATOR_NAME);
			Thread.sleep(5000);
			type(Name, LocatorsPersonalAccidentsInsurance.LOCATOR_NAME);
			type(LastName, LocatorsPersonalAccidentsInsurance.LOCATOR_LAST_NAME);
			type(BasicData.PHONE, LocatorsPersonalAccidentsInsurance.LOCATOR_PHONE);
			click(LocatorsPersonalAccidentsInsurance.LOCATOR_DATE_BIRTH);
			WebElement previous = driver.findElement(LocatorsPersonalAccidentsInsurance.LOCATOR_PREVIOUS_DATE);
			type(BasicData.CITY, LocatorsPersonalAccidentsInsurance.LOCATOR_CITY);
			Thread.sleep(3000);
			WebElement ct = driver.findElement(LocatorsPersonalAccidentsInsurance.LOCATOR_CITY);
			ct.sendKeys(Keys.DOWN);
			type(BasicData.ADDRESS, LocatorsPersonalAccidentsInsurance.LOCATOR_ADDRESS);
			Thread.sleep(5000);
			if(BasicData.GENDER_F.equals(Gender)) {
				click(LocatorsPersonalAccidentsInsurance.LOCATOR_GENDER_F);
			}
			if(BasicData.GENDER_M.equals(Gender)) {
				click(LocatorsPersonalAccidentsInsurance.LOCATOR_GENDER_M);
			}
		}  catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
