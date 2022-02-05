package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("eddy");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	String idbfore=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
	System.out.println("ID before update:"+idbfore);
	String companybfore = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']//a")).getText();
	System.out.println("Company name before update:"+companybfore);
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
	
String title =driver.getTitle();
System.out.println("Title is:"+title);
	
	
	driver.findElement(By.xpath("(//a[@class='subMenuButton']/following-sibling::a)[2]")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();

	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testedit");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Tony");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
	String idafter=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
	System.out.println("ID after update:"+idafter);
	String companyafter = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']//a")).getText();
	System.out.println("Company name after update:"+companyafter);
	String givenname="Testedit";
	System.out.println();
	if(companyafter.equalsIgnoreCase(givenname))
	{
		System.out.println("The company name is updated");
	}
	else
	{
		System.out.println("The company name is not updated");
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

