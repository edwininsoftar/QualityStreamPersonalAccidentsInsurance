package personal.accidents.insurance;

import org.openqa.selenium.By;

public class LocatorsPersonalAccidentsInsurance {
	//Ingreso
	public static final By LOCATOR_DATE = By.xpath("//*[@id=\"mat-date-range-input-0\"]");
	public static final By LOCATOR_DATE_28 = By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[6]/td[2]/div[1]");
	public static final By LOCATOR_DATE_30 = By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[6]/td[4]/div[1]");
	public static final By LOCATOR_EMAIL = By.xpath("//*[@id=\"mat-input-0\"]");
	public static final By LOCATOR_BUTTON_QUOTE = By.xpath("//*[@id=\"btnQuotationHome\"]/button");
	//Arme su seguro
	public static final By LOCATOR_FAMILY_NUCLEUS = By.xpath("//*[@id=\"mat-input-1\"]");
	public static final By LOCATOR_BASIC = By.xpath("/html/body/app-root/app-quotation-insurance/div/div/div[1]/app-plans-quotation/div/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]/div/div/button");
	public static final By LOCATOR_PREMIUM = By.xpath("/html/body/app-root/app-quotation-insurance/div/div/div[1]/app-plans-quotation/div/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]/div/div/button");
	public static final By LOCATOR_RENT_DAY = By.xpath("/html/body/app-root/app-quotation-insurance/div/div/div[2]/app-coverage/div[2]/div[1]/div/div[1]/label/span");
	public static final By LOCATOR_FRACTURES = By.xpath("/html/body/app-root/app-quotation-insurance/div/div/div[2]/app-coverage/div[3]/div[1]/div/div[1]/label/span");
	public static final By LOCATOR_BUTTON_CONTINUE = By.xpath("/html/body/app-root/app-quotation-insurance/app-continue/div/button");
	//ingrese sus datos 
	public static final By LOCATOR_TYPE_DOCUMENT = By.xpath("/html/body/app-root/app-personal-information/div/div[1]/div/app-traveler-information/div/div[3]/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div");
	public static final By LOCATOR_DOCUMENT = By.id("mat-input-2");
	public static final By LOCATOR_NAME = By.id("mat-input-3");
	public static final By LOCATOR_LAST_NAME = By.id("mat-input-4");
	public static final By LOCATOR_PHONE = By.id("phoneNumber");
	public static final By LOCATOR_DATE_BIRTH = By.id("mat-input-6");
	public static final By LOCATOR_PREVIOUS_DATE = By.xpath("//*[@id=\"mat-datepicker-1\"]/mat-calendar-header/div/div/button[2]");
	public static final By LOCATOR_CITY = By.name("city");
	public static final By LOCATOR_ADDRESS = By.id("mat-input-8");
	public static final By LOCATOR_GENDER_F = By.id("mat-radio-2");
	public static final By LOCATOR_GENDER_M = By.id("mat-radio-3");

}
