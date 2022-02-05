package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
		  
		 // 2. Enter UserName and Password Using Id Locator
	WebElement elementUsername=driver.findElement((By.id("username")));
	elementUsername.sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
		  //3. Click on Login Button using Class Locator
	driver.findElement(By.className("decorativeSubmit")).click();
		  //4. Click on CRM/SFA Link
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//  5. Click on contacts Button
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	
	driver.findElement(By.partialLinkText("Contacts")).click();
	driver.findElement(By.partialLinkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Tony");
	driver.findElement(By.id("lastNameField")).sendKeys("Priya");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Tony1");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Priya1");
	driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Banker");
	driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("Miss");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Sales");
	WebElement currency = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
	Select currency1 = new Select(currency);
	currency1.selectByVisibleText("ARS - Argentina Peso");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Best Company");
	driver.findElement(By.id("createContactForm_birthDate")).sendKeys("02/02/2022");
	driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).sendKeys("10");
	driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("10");
	driver.findElement(By.id("createContactForm_primaryPhoneExtension")).sendKeys("91");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@gmail.com");
	driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("789987987897");
	driver.findElement(By.id("createContactForm_primaryPhoneAskForName")).sendKeys("tester4");
	driver.findElement(By.id("generalToNameField")).sendKeys("test2");
	driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("test3");
	driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Chennai");
	driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("600028");
	driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("6000281");
	driver.findElement(By.id("createContactForm_generalAttnName")).sendKeys("test5");
	driver.findElement(By.id("createContactForm_generalAddress2")).sendKeys("test 3 4");
	WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select state1 = new Select(state);
	state1.selectByVisibleText("Alaska");
	WebElement country = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
	Select country1 = new Select(country);
	country1.selectByVisibleText("Albania");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Tested");
	driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
	String title=driver.getTitle();
	System.out.println("Title of page:"+title);
	driver.close();
	}
	/*
	 * //Pseudo Code
	 * 
	 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	 * 
	 * 2. Enter UserName and Password Using Id Locator
	 * 
	 * 3. Click on Login Button using Class Locator
	 * 
	 * 4. Click on CRM/SFA Link
	 * 
	 * 5. Click on contacts Button
	 * 
	 * 6. Click on Create Contact
	 *  
	 * 7. Enter FirstName Field Using id Locator
	 * 
	 * 8. Enter LastName Field Using id Locator
	 * 
	 * 9. Enter FirstName(Local) Field Using id Locator
	 * 
	 * 10. Enter LastName(Local) Field Using id Locator
	 * 
	 * 11. Enter Department Field Using any Locator of Your Choice
	 * 
	 * 12. Enter Description Field Using any Locator of your choice 
	 * 
	 * 13. Enter your email in the E-mail address Field using the locator of your choice
	 * 
	 * 14. Select State/Province as NewYork Using Visible Text
	 * 
	 * 15. Click on Create Contact
	 * 
	 * 16. Click on edit button 
	 * 
	 * 17. Clear the Description Field using .clear
	 * 
	 * 18. Fill ImportantNote Field with Any text
	 * 
	 * 19. Click on update button using Xpath locator
	 * 
	 * 20. Get the Title of Resulting Page.
     */

}