package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.name("phoneCountryCode")).clear();
	driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
	//driver.findElement(By.name("phoneAreaCode")).sendKeys("23");
	driver.findElement(By.name("phoneNumber")).sendKeys("9650392127");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
	Thread.sleep(5000);
	String capturedLeadID=driver.findElement(By.xpath("(//tr[1]/td[contains(@class,'cell-first')]/div/a)[1]")).getText();
	System.out.println("Captured lead id :"+capturedLeadID);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//tr[1]/td[contains(@class,'cell-first')]/div/a)[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.name("id")).sendKeys(capturedLeadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
	Thread.sleep(5000);
	//boolean isPresent=driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
	WebElement text = driver.findElement(By.xpath("//div[text()='No records to display']"));
	String text1 = text.getText();
	String text2 = "No records to display";
	if (text1.equalsIgnoreCase(text2)) {
		System.out.println("Already deleted or no record of such type found");
		}
	else
	{
		System.out.println("Record found");
		}
	
	
	
	
	
	

	/*http://leaftaps.com/opentaps/control/main
	
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click Find leads
	* 8	Enter first name
	* 9	Click Find leads button
	* 10 Click on first resulting lead
	* 11 Verify title of the page
	* 12 Click Edit
	* 13 Change the company name
	* 14 Click Update
	* 15 Confirm the changed name appears
	* 16 Close the browser (Do not log out)
*/
}
}
